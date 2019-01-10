package com.example.excel.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Date: 2019/1/9 14:15
 * @Author:jyj
 */
public class DateUtil {

    public static String getCurrentDate() {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        java.util.Date today = new java.util.Date();
        String tString = df.format(today);
        return tString;
    }

    public static String getCurrentTime() {
        String pattern = "HH:mm:ss";
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        Date today = new Date();
        String tString = df.format(today);
        return tString;
    }
}
