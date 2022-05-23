package com.wfs.springbootconfig;

import com.wfs.springbootconfig.bean.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
public class SpringBootConfigApplication {

    public static void main(String[] args) {




        SpringApplication.run(SpringBootConfigApplication.class, args);
    }

}
