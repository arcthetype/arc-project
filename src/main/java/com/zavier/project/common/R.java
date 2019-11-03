package com.zavier.project.common;

import lombok.Data;

@Data
public class R<T> {
    private boolean success;
    private String code;
    private T data;
    private String msg;

    public static <T> R<T> wrapSuccessResult(T data) {
        final R<T> result = new R<>();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }
}
