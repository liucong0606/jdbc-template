package com.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

public class JdbcUtil {
    private static DataSource ds;

    static{
        try {
            //加载配置文件
            Properties pro = new Properties();
            pro.load(JdbcUtil.class.getClassLoader().
                    getResourceAsStream("jdbc.properties"));
            //获取DataSource
            DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return ds;
    }
}
