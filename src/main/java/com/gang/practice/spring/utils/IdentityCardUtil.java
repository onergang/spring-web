package com.gang.practice.spring.utils;

import java.util.*;

/**
 * @ClassName: IdentityCardUtil
 * @Description: 身份证验证工具
 * @Author GaoGang
 * @Date 2016-09-13 15:07
 * @Version V1.0
 */
public class IdentityCardUtil {
    private static volatile IdentityCardUtil instance;

    public static IdentityCardUtil getInstance() {
        if (instance == null) {
            synchronized (IdentityCardUtil.class) {
                if (instance == null)
                    instance = new IdentityCardUtil();
            }
        }
        return instance;
    }

    int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2}; // 十七位数字本体码权重
    Character[] validate = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};   // 返回值

    public boolean isValide(String identityCard) {
        if (identityCard.length() > 18)
            throw new IllegalArgumentException("identityCard length too long");
        boolean validFlag = false;
        // 获取前17位字符串
        String identityCardSubString = getSubString(identityCard);
        char validateNumber = calculateValidateChar(identityCardSubString);
        char lastNumber = getLastChar(identityCard);
        if (lastNumber == validateNumber) {
            validFlag = true;
        }
        return validFlag;
    }

    /**
     * 计算最后一位
     *
     * @param identityCardSubString
     * @return
     */
    public char calculateValidateChar(String identityCardSubString) {
        int mod = getSum(identityCardSubString) % 11;
        return validate[mod];
    }

    /**
     * 获取前17位
     *
     * @param identityCard
     * @return
     */
    public String getSubString(String identityCard) {
        return identityCard.substring(0, identityCard.length() - 1);
    }

    /**
     * 获取最后1位
     *
     * @param identityCard
     * @return
     */
    public char getLastChar(String identityCard) {
        return identityCard.charAt(identityCard.length() - 1);
    }

    /**
     * 计算前17位的和,0的话不计算
     *
     * @param identityCardSubString
     * @return
     */
    public int getSum(String identityCardSubString) {
        int sum = 0;
        for (int i = 0; i < identityCardSubString.length(); i++) {
            if (identityCardSubString.charAt(i) == '0')
                continue;
            sum += Integer.parseInt(String.valueOf(identityCardSubString.charAt(i))) * weight[i];
        }
        return sum;
    }

    public String formatToTwo(String number) {
        return number.length() > 1 ? number : "0" + number;
    }

    /**
     * 获取birthday列表
     *
     * @param encryptIdCard
     * @return
     */
    public Set<String> getBirthday(String encryptIdCard) {
        Set<String> birthdayList = new LinkedHashSet<>();
        String birthday = null;

        char validateChar = encryptIdCard.charAt(encryptIdCard.length() - 1);
        int mod = CollectionUtil.getLocation(validate, validateChar);

        Integer bornYear = Integer.parseInt(encryptIdCard.substring(6, 10));

        Map<Integer, Integer> datas = DateUtil.getTotalDays(bornYear);

        for (int i = 1; i <= 12; i++) {
            String month = formatToTwo(String.valueOf(i));

            for (int j = 1; j <= datas.get(i); j++) {
                String day = formatToTwo(String.valueOf(j));
                birthday = month + day;
                String dealString = encryptIdCard.substring(0, 10) + birthday
                        + encryptIdCard.substring(encryptIdCard.length() - 4, encryptIdCard.length() - 1);
                int sum = getSum(dealString);
                if ((sum - mod) % 11 == 0)
                    birthdayList.add(birthday);
            }
        }
        return birthdayList;
    }

}
