package com.dao;

/**
 * @ClassName:
 * @Description:
 * @author:
 * @date:
 * @Version:
 * @Copyright:
 */
//数据库连接配置信息
public interface JdbcConfig {
    String DRIVER = "com.mysql.jdbc.Driver";
    String URL = "jdbc:mysql://localhost:3306/StudentSystemDao";
    String USERNAME = "root";
    String PASSWORD = "123";
}
