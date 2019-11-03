package com.zavier.project.common.util;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {

    public static boolean isBlank(String str) {
        return StringUtils.isBlank(str);
    }

    public static boolean isNotBlank(String str) {
        return StringUtils.isNotBlank(str);
    }
}
