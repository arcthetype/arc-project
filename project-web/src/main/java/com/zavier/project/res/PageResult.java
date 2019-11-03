package com.zavier.project.res;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    private boolean success;
    private String code;
    private List<T> list;
    private Integer total;

    public static <T> PageResult<T> wrapSuccessResult(List<T> list, Integer total) {
        final PageResult<T> result = new PageResult<>();
        result.setSuccess(true);
        result.setList(list);
        result.setTotal(total);
        return result;
    }
}
