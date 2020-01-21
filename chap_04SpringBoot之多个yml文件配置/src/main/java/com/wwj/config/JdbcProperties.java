package com.wwj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ConfigurationProperties从配置文件application.properties或者application.yml中读取配置项
 * prefix表示配置项的前缀，例如jdbc.url
 * 配置项类中的类变量名必须要与前缀之后的配置项名称保持松散绑定(相同)
 * 不严格要求属性文件中的属性名与成员变量名一致，支持驼峰，中划线，下划线等转换
 * 甚至支持对象引导，如uer.friend.name，friend是对象，name是friend的属性，使用@Value则难以完成注入
 *
 * ConfigurationProperties注解提示Not registered via...时说明配置文件未被正确使用(可能是名称错误)
 */
@ConfigurationProperties(prefix="jdbc")
public class JdbcProperties {
    private String url;
    private String driverClassName;
    private String userName;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
