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
    int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2}; // 十七位数字本体码权重
    char[] validate = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};   // 返回值

    public boolean isValide(String identityCard) {
        if (identityCard.length() > 18)
            throw new IllegalArgumentException("identityCard length too long");
        boolean validFlag = false;
        // 获取前17位字符串
        String identityCardString = identityCard.substring(0, identityCard.length() - 1);
        char validateNumber = getValidateChar(identityCardString);
        char lastNumber = identityCard.charAt(identityCard.length() - 1);
        if (lastNumber == validateNumber) {
            validFlag = true;
        }
        return validFlag;
    }

    /**
     * 计算最后一位
     *
     * @param identityCardString
     * @return
     */
    public char getValidateChar(String identityCardString) {
        int mod = getSum(identityCardString) % 11;
        return validate[mod];
    }

    /**
     * 计算前17位的和
     *
     * @param identityCardString
     * @return
     */
    public int getSum(String identityCardString) {
        int sum = 0;
        for (int i = 0; i < identityCardString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(identityCardString.charAt(i))) * weight[i];
        }
        return sum;
    }

    /**
     * 获取列表
     *
     * @param encryptIdCard
     * @return
     */
    public Set<String> getBirthday(String encryptIdCard) {
        Set<String> birthday = new HashSet<>();
        int mod = 0;
        char validateChar = encryptIdCard.charAt(encryptIdCard.length() - 1);
        System.out.println(validateChar);
        for (int i = 0; i < validate.length; i++) {
            if (validateChar == validate[i])
                mod = i;
        }
        Integer bornYear = Integer.parseInt(encryptIdCard.substring(6, 10));
        Map<Integer, Integer> datas = new HashMap<>();
        if (DateUtil.isLeapYear(bornYear))
            datas.put(2, 29);
        else
            datas.put(2, 28);
        int[] bigMonth = new int[]{1, 3, 5, 7, 8, 10, 12};
        for (int big : bigMonth) {
            datas.put(big, 31);
        }
        int[] smallMonth = new int[]{4, 6, 9, 11};
        for (int small : smallMonth) {
            datas.put(small, 30);
        }
        for (int i = 1; i <= 12; i++) {
            String month = String.valueOf(i);
            if (month.length() == 1)
                month = "0" + month;

            for (int j = 1; j <= datas.get(i); j++) {
                String day = String.valueOf(j);
                if (day.length() == 1)
                    day = "0" + day;

                String birthString = month + day;
                String dealString = encryptIdCard.substring(0, 10) + birthString
                        + encryptIdCard.substring(encryptIdCard.length() - 4, encryptIdCard.length() - 1);
                int sum = getSum(dealString);
                if ((sum - mod) % 11 == 0)
                    birthday.add(birthString);
            }
        }
        return birthday;
    }

}
