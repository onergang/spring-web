package com.gang.practice.spring.utils;

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

    public char getValidateChar(String identityCardString) {
        int sum = 0;
        int mod;
        for (int i = 0; i < identityCardString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(identityCardString.charAt(i))) * weight[i];
        }
        mod = sum % 11;
        return validate[mod];
    }
}
