package com.ximi.main.service;

import com.ximi.spring.Autowired;
import com.ximi.spring.BeanNameAware;
import com.ximi.spring.Component;

/**
 * @author 西米的风
 * @description TODO
 * @date 2022-08-24 0:32
 */
@Component
public class UserService implements UserInterface, BeanNameAware {
    @Autowired
    private OrderService orderService;

    @XimiValue("xxx")
    private String test;

    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void test() {
        System.out.println(beanName+","+test);
    }
}
