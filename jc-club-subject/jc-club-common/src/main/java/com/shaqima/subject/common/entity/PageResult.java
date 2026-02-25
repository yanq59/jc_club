package com.shaqima.subject.common.entity;

import java.util.Collections;
import java.util.List;

/**
 * 分页返回的实体
 *
 * @Author : qi
 * @create 2026/2/25 17:13
 */
public class PageResult<T> {
    /**
     * 当前页码
     */
    private Integer pageNo = 1;

    /**
     * 每页条数
     */
    private Integer pageSize = 20;

    private Integer total = 0;

    private Integer totalPages = 0;

    private List<T> result = Collections.emptyList();

    private Integer start = 1;

    private Integer end = 0;

    public void setRecords(List<T> result) {
        this.result = result;
        if (result != null && result.size() > 0) {
            setTotal(result.size());
        }
    }

    public void setTotal(Integer total) {
        this.total = total;
        if (this.totalPages > 0) {
            this.totalPages = (total / this.pageSize) + (total % this.pageSize == 0 ? 0 : 1);
        } else {
            this.totalPages = 0;
        }
        this.start = (this.pageSize > 0 ? (this.pageNo - 1) * this.pageSize : 0) + 1;
        this.end = (this.start - 1 + this.pageSize * (this.pageNo > 0 ? 1 : 0));
    }


    private void setPageSize(Integer pageSize){
            this.pageSize = pageSize;
    }

    private void setPageNo(Integer pageNo){
            this.pageNo = pageNo;
    }

}
