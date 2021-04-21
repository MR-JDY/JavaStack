package com.vaynenet.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication//(scanBasePackages = {"com.vaynenet.core","com.vaynenet.user","com.vaynenet.redis"})
@MapperScan(basePackages = {"com.vaynenet.user.mapper"})
public class UserCenterApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(UserCenterApplication.class, args);
//        String[] beans = ctx.getBeanDefinitionNames();
//        Arrays.sort(beans);
//        for (String bean : beans) {
//            System.out.println(bean + " of Type :: " + ctx.getBean(bean).getClass());
//        }

    }

}
