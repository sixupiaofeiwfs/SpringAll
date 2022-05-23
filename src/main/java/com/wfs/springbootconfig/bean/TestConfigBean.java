package com.wfs.springbootconfig.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix="test")
@PropertySource("classpath:test.properties")
@Component
public class TestConfigBean {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}





/*
*   @ConfigurationProperties  为了解决频繁使用@Value的方式对所有的属性进行注解，此注解（prefix=“test"）代表只要是test前缀的配置文件数据自动填充到bean中
*   @PropertySource注解用于指定自定义配置文件的具体位置和名称。同时，为了保证spring boot能够扫描该注解，
*   需要在该类上添加@Configuration注解将实体类作为自定义配置类。
*
*
*
* */