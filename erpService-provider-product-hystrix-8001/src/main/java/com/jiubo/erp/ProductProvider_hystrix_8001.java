package com.jiubo.erp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix //开启 Hystrix 熔断机制的支持
@EnableEurekaClient //本服务启动后会自动注册进Eureka中心
@MapperScan("com.jiubo.erp.mapper") //扫描所有Mapper接口
@SpringBootApplication
public class ProductProvider_hystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_hystrix_8001.class, args);
    }
}
