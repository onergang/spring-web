package com.gang.practice.spring.utils;

/**
 * @ClassName: DateUtil
 * @Description: 时间处理
 * @Author GaoGang
 * @Date 2016-09-18 15:44
 * @Version V1.0
 */
public class DateUtil {

    public static boolean isLeapYear(Integer year) {
        boolean leapFlag = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            leapFlag = true;
        }
        return leapFlag;
    }
}
