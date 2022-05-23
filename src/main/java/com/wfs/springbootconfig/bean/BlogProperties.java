package com.wfs.springbootconfig.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties {

    @Value("$(mrbird.blog.name)")
    private String name;


    @Value("$(mrbird.blog.title)")
    private String title;

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
}




/*
*
*   @Component:把普通的类实例化到spring容器中,相当于配置文件中的<bean id="" class="">
    @Component:是一个元注解,意思是可以注解其他类注解,如:@Controller @Service @Respository  @Aspect
   *官方的原话是:带此注解的类看为组件,当使用基于注解的配置和类路径扫描的时候,这些类就会被实例化.其他类级别的注解也可以
   * 被认定是一种特殊类型的组件.所以,该注解可以注解其他类注解.
*
*
*   @Value:该注解的作用是将我们配置文件的属性通过前缀匹配的方式读出来,有@Value(“${}”)和@Value(“#{}”)两种方式。
*
*
* */