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
     * 当前页码
     */
    private Integer pageNum = 1;

    /**
     * 每页条数
     */
    private Integer pageSize = 20;
}
