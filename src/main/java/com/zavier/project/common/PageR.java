package com.zavier.project.common;

import lombok.Data;

import java.util.List;

@Data
public class PageR<T> {
    private boolean success;
    private String code;
    private List<T> list;
    private Integer total;

    public static <T> PageR<T> wrapSuccessResult(List<T> list, Integer total) {
        final PageR<T> result = new PageR<>();
        result.setSuccess(true);
        result.setList(list);
        result.setTotal(total);
        return result;
    }
}
