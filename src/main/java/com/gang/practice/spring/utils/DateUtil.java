package com.gang.practice.spring.utils;

import java.util.*;

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

    /**
     * 自定义一个时间(仅 年 月 日 中某一属性修改)
     * @param type 要改变的属性 eg:Calendar.MONTH
     * @param offset 偏移量 eg：-1 与当前时间的差值
     * @return
     */
    public static Date
    getCustomDate(int type, int offset) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(type, calendar.get(type) + offset);
        return calendar.getTime();
    }
    /**
     * 将秒转换为 时分秒
     * @param second
     * @return
     */
    public static String dateParse(int second) {
        int h = 0;
        int m = 0;
        int s = 0;
        String str = "";
        int temp = second % 3600;
        if (second > 3600) {
            h = second / 3600;
            if (temp != 0) {
                if (temp > 60) {
                    m = temp / 60;
                    if (temp % 60 != 0) {
                        s = temp % 60;
                    }
                } else {
                    s = temp;
                }
            }
        } else {
            m = second / 60;
            if (second % 60 != 0) {
                s = second % 60;
            }
        }
        if (h > 0) {
            str += h + "时";
        }
        if (m > 0) {
            str += m + "分";
        }
        if (s > 0) {
            str += s + "秒";
        }
        return str;
    }
}
