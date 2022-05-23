package com.wfs.springbootconfig.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



@ConfigurationProperties(prefix="mrbird.blog")
public class ConfigBean {

    private String name;
    private String title;
    private String wholeTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWholeTitle() {
        return wholeTitle;
    }

    public void setWholeTitle(String wholeTitle) {
        this.wholeTitle = wholeTitle;
    }
}



/*
*
未通过 @EnableConfigurationProperties 注册、标记为 Spring 组件或通过 @ConfigurationPropertiesScan 扫描
* 意思是该类没有添加到Spring容器中,解决此问题只需要将该类加入到容器中即可
*解决方法:在该类中添加@Component 或添加@EnableConfigurationProperties(类名.class)
* 或在启动类中添加@EnableConfigurationProperties({类名.class})
*
*
* */