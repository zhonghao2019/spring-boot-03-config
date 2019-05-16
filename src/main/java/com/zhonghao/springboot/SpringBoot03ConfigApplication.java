package com.zhonghao.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * ImportResource：加载xml配置文件到容器中，一般不推荐使用
 */
//@ImportResource(locations = {"classpath:spring01.xml"})
@SpringBootApplication
public class SpringBoot03ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot03ConfigApplication.class, args);
    }

}
