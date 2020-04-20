package com.fuqiang.springbootsharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.fuqiang.springbootsharding.mapper", "com.fuqiang.*.mapper"})
@ComponentScan(basePackages = {"com.fuqiang.*"})
public class SpringbootShardingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShardingApplication.class, args);
    }

}
