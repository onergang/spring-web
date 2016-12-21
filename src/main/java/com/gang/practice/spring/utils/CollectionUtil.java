package com.gang.practice.spring.utils;

/**
 * @ClassName: CollectionUtil
 * @Description:
 * @Author GaoGang
 * @Date 2016-09-19 13:42
 * @Version V1.0
 */
public class CollectionUtil {
    /**
     * 根据值判断在数组中的位置
     * 方法中使用泛型， 自动拆箱操作 jdk 处理
     * @param array 数组
     * @param value 数组中的值
     * @return
     */
    public static <T>int getLocation(T[] array, T value) {
        int location = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i])
                location = i;
        }
        return location;
    }
}
