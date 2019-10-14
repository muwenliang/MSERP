package com.jiubo.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//会扫描标记了指定包下@FeignClient注解的接口，并生成此接口的代理对象
@EnableFeignClients(basePackages= {"com.jiubo.erp"})
@EnableEurekaClient //向服务注册中心进行注册
@SpringBootApplication
public class ProductConsumer_feign {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_feign.class, args);
    }
}
