package com.gang.practice.spring.utils;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName: DateUtil
 * @Description: 时间处理
 * @Author GaoGang
 * @Date 2016-09-18 15:44
 * @Version V1.0
 */
public class DateUtil {
    static Integer[] bigMonth = new Integer[]{1, 3, 5, 7, 8, 10, 12};

    /**
     * 获取一年月份数集合
     *
     * @param year
     * @return
     */
    public static Map<Integer, Integer> getTotalDays(int year) {
        Map<Integer, Integer> datas = new LinkedHashMap<>();
        for (int i = 1; i <= 12; i++)
            datas.put(i, getDays(year, i));
        return datas;
    }

    /**
     * 获得月份的天数
     *
     * @return
     */
    public static int getDays(int year, int month) {
        int days = 30;
        if (month == 2)
            days = getFebruaryDays(year);
        if (Arrays.asList(bigMonth).contains(month))
            days = 31;
        return days;
    }

    /**
     * 2月天数判断
     *
     * @param year
     * @return
     */
    public static int getFebruaryDays(int year) {
        return isLeapYear(year) ? 29 : 28;
    }

    /**
     * 判断是否为闰年
     *
     * @param year
     * @return
     */
    public static boolean isLeapYear(Integer year) {
        boolean leapFlag = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            leapFlag = true;
        }
        return leapFlag;
    }

}
