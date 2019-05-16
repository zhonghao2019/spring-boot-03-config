package com.zhonghao.springboot;

import com.zhonghao.springboot.bean.Emp;
import com.zhonghao.springboot.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03ConfigApplicationTests {

    @Autowired
    Emp emp;

    @Autowired
    ApplicationContext context;

    @Test
    public void contextLoads() {
        System.out.println(emp);
    }

    /**
     * 测试启动类ImportResource加载xml配置文件
     */
    @Test
    public void testXml(){
        EmpService empService = (EmpService) context.getBean("empService");
        empService.add();
    }

    /**
     * 测试EmpConfig配置类
     */
    @Test
    public void testConfigClass() {
        EmpService empService = (EmpService) context.getBean("empService");
        empService.add();
    }

}
