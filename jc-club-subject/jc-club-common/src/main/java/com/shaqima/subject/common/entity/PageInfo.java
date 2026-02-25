package com.shaqima.subject.common.entity;

import lombok.Data;

/**
 * 分页请求实体
 *
 * @Author : qi
 * @create 2026/2/25 17:02
 */
@Data
public class PageInfo {
    /**
     * 当前页码
     */
    private Integer pageNo = 1;

    /**
     * 每页条数
     */
    private Integer pageSize = 20;

    public Integer getPageNo() {
        if (pageNo == null || pageNo < 1) {
            return 1;
        }
        return pageNo;
    }

    public Integer getPageSize() {
        if (pageSize == null || pageSize < 1 || pageSize > Integer.MAX_VALUE) {
            return 20;
        }
        return pageSize;
    }
}
