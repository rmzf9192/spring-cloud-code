package com.el.cloud.utils;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Roman.Zhang
 * @date 2020/2/28
 * @description:
 */
public class UtcTimeUtil {

    static String minusHours(int hours) {
        return ZonedDateTime.now().minusHours(hours).format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    static String plusHours(int hours) {
        return ZonedDateTime.now().plusHours(hours).format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }



    public static void main(String[] args) {
        ZonedDateTime time=  ZonedDateTime.now();
        System.out.println(time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str=time.format(formatter);
        System.out.println(str);

        System.out.println("minusHours:"+minusHours(1)+","+plusHours(1));

    }

}