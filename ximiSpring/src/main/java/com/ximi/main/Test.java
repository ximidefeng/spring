package com.ximi.main;

import com.ximi.main.service.UserInterface;
import com.ximi.spring.XimiApplicationContext;

/**
 * @author 西米的风
 * @description TODO
 * @date 2022-08-24 0:32
 */
public class Test {


    public static void main(String[] args) {

        // 扫描--->创建单例Bean BeanDefinition BeanPostPRocess
        XimiApplicationContext applicationContext = new XimiApplicationContext(AppConfig.class);

        UserInterface userService = (UserInterface) applicationContext.getBean("userService");
        userService.test();
    }
}
