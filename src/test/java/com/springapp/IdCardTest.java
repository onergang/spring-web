package com.springapp;

import com.gang.practice.spring.utils.IdentityCardUtil;

import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName: IdCardTest
 * @Description:
 * @Author GaoGang
 * @Date 2016-12-19 11:31
 * @Version V1.0
 */
public class IdCardTest {
    public static void main(String[] args) {
        String encryptString = " ";// input idCard
        IdentityCardUtil id = new IdentityCardUtil();
        Set<String> sets = id.getBirthday(encryptString);
        for (String str : sets) {
            System.out.println(str);
        }
        System.out.println("------another method------");
        Iterator<String> iterator = sets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
