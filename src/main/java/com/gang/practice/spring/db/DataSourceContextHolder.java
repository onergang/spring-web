package com.gang.practice.spring.db;

/**
 * @ClassName: DataSourceContextHolder
 * @Description: 数据库切换
 * @Author GaoGang
 * @Date 2016-12-20 17:28
 * @Version V1.0
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    /**
     * 设置当前数据源
     *
     * @param dataSourceType 数据源名称
     */
    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    /**
     * 获取当前数据源
     *
     * @return
     */
    public static String getDataSourceType() {
        return contextHolder.get();
    }

    /**
     * 清除数据信息
     */
    public static void clearDataSourceType() {
        contextHolder.remove();
    }
}
