package io.cxh.j2ee.utils;

/**
 * Created by Administrator on 2017/3/9.
 */
public class ServletUtil {
    public static String paramsClean(String str) {
        if (str == null || str.trim().equals("")) {
            return null;
        }


        return str.trim();
    }
}
