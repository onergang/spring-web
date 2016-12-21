package com.gang.practice.spring.db;

/**
 * @ClassName: DataSourceType
 * @Description: 数据库名称
 * @Author GaoGang
 * @Date 2016-12-20 17:28
 * @Version V1.0
 */

/**
 * 注意：name的值要与 配置文件中的 key 值相同
 * <property name="targetDataSources">
 * <map key-type="java.lang.String">
 * <entry key="master" value-ref="dataSource_master"/>
 * <entry key="slave" value-ref="dataSource_slave"/>
 * </map>
 * </property>
 */
public enum DataSourceType {
    MASTER("master"), SLAVE("slave");

    private String name;

    private DataSourceType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
