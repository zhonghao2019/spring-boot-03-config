package com.zhonghao.springboot.config;

import com.zhonghao.springboot.service.EmpService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {

    /**
     *Bean: 将组件注入到容器中
     * 方法名为对象的id
     * 返回组件对象
     */
    @Bean
    public EmpService empService() {
        return new EmpService();
    }
}
