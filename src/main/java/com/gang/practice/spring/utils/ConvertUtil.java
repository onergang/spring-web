package com.gang.practice.spring.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: ConvertUtil
 * @Description: 数字转换为中文
 * @Author GaoGang
 * @Date 2016-12-20 8:12
 * @Version V1.0
 */
public class ConvertUtil {
    public static Map<String, String> chinese = new HashMap<>(10);
    public static Map<Integer, String> unit = new HashMap<>(16);

    static {
        chinese.put("0", "零");
        chinese.put("1", "一");
        chinese.put("2", "二");
        chinese.put("3", "三");
        chinese.put("4", "四");
        chinese.put("5", "五");
        chinese.put("6", "六");
        chinese.put("7", "七");
        chinese.put("8", "八");
        chinese.put("9", "九");

        unit.put(1, "十");
        unit.put(2, "百");
        unit.put(3, "千");
        unit.put(4, "万");
        unit.put(5, "十");
        unit.put(6, "百");
        unit.put(7, "千");
        unit.put(8, "亿");
        unit.put(9, "十");
        unit.put(10, "百");
        unit.put(11, "千");

    }

    public static String numberToChinese(Integer num) {
        if (num < 0)
            throw new IllegalArgumentException("数组不合法");
        String numString = String.valueOf(num);
        List<Character> chars = new ArrayList<Character>(numString.length());
        for (int i = 0; i < numString.length(); i++)
            chars.add(numString.charAt(i));
        StringBuilder toChinese = new StringBuilder();
        int length = chars.size();
        for (int j = 0; j < length; j++) {
            toChinese.append(chinese.get(String.valueOf(chars.get(j))));
            if (chars.get(j) != '0' && j < length - 1) {
                toChinese.append(unit.get(length - j - 1));
            }
        }
        return toChinese.toString();
    }

    public static void main(String[] args) {
        String aa = numberToChinese(233233);
        System.out.print(aa);
    }
}
