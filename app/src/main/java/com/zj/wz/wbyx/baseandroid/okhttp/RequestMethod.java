package com.zj.wz.wbyx.baseandroid.okhttp;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * FileName: RequestMethod
 * Author: 曹伟
 * Date: 2019/9/16 16:36
 * Description:
 */

public enum RequestMethod {

    GET,
    POST,
    PUT,
    DELETE,
    HEAD,
    PATCH,
    OPTIONS,
    TRACE;

    public static final Set<String> METHODS = new LinkedHashSet<String>(Arrays.asList("OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"));

    public static boolean isValid(final String method) {
        return METHODS.contains(method);
    }

    public static boolean supportBody(final String method) {
        return supportBody(RequestMethod.valueOf(method));
    }

    public static boolean supportBody(final RequestMethod method) {
        return RequestMethod.POST.equals(method) || RequestMethod.PUT.equals(method) || RequestMethod.PATCH
                .equals(method) || RequestMethod.DELETE.equals(method);
    }
}
