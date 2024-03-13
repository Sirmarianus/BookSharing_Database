package com.bookSzpan;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcConfig
{
    
    public static DataSource getMysqlDataSource()
    {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/dbserver");
    dataSource.setUsername("root");

    return dataSource;
    }
}
