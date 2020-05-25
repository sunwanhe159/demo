package com.donkey.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zcool on 2020/5/25.
 */
public class CookieUtil {

    public static String getCookieValue(HttpServletRequest request,String cookieName) {
        Cookie[] cookies = request.getCookies();

        if (cookies == null || cookieName == null) {
            return null;
        }

        String result = null;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(cookieName)) {
                result = cookie.getValue();
                break;
            }
        }

        return result;
    }
}
