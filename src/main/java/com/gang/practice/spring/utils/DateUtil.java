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
    static int[] bigMonth = new int[]{1, 3, 5, 7, 8, 10, 12};

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

    /**
     * 获得月份的天数
     *
     * @return
     */
    public static int getDays(int year, int month) {
        int days = 30;
        if (isLeapYear(year))
            days = getFebruaryDays(year);
        if (Arrays.asList(bigMonth).contains(month))
            days = 31;
        return days;
    }

    /**
     * 2月天数判断
     * @param year
     * @return
     */
    public static int getFebruaryDays(int year) {
        return isLeapYear(year) ? 29 : 28;
    }

    public static Map<Integer,Integer> getTotalDays(int year) {
        Map<Integer, Integer> datas = new LinkedHashMap<>();
        datas.put(2, getFebruaryDays(year));
        int[] bigMonth = new int[]{1, 3, 5, 7, 8, 10, 12};
        for (int big : bigMonth) {
            datas.put(big, 31);
        }
        int[] smallMonth = new int[]{4, 6, 9, 11};
        for (int small : smallMonth) {
            datas.put(small, 30);
        }
        return datas;
    }
}
