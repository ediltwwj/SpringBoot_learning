package com.wwj.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
// @PropertySource("classpath:application.properties")
@EnableConfigurationProperties(JdbcProperties.class)  // 使用配置项类，而不是配置文件
public class JdbcConfig {
/*
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.driverClassName}")
    String driverClassName;
    @Value("${jdbc.userName}")
    String userName;
    @Value("${jdbc.password}")
    String password;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);

        return dataSource;
    }
 */

    @Bean
    public DataSource dataSource(JdbcProperties jdbcProperties) {
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUserName());
        dataSource.setPassword(jdbcProperties.getPassword());

        return dataSource;
    }

    /**
     * 事实上，如果一段属性只有一个Bean需要使用，我们无需将其注入到一个类(JdbcProperties，将该类上的所有注解去掉)
     * 而是直接在需要的地方声明即可，再次修改JdbcConfig为如下代码:
     * 该类必须有对应属性的set方法
     */
    /*
    @Configuration
    public class JdbcConfig {

        @Bean
        // 声明要注入的属性前缀，SpringBoot会自动把相关属性通过set方法注入到DataSource中
        @ConfigurationProperties(prefix="jdbc")
        public DataSource dataSource() {

            return new DruidDataSource();
        }
    }
     */
}

