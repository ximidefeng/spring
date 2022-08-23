package com.ximi.main.service;

import com.ximi.spring.BeanPostProcessor;
import com.ximi.spring.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 西米的风
 * @description TODO
 * @date 2022-08-24 0:54
 */
@Component
public class XimiBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {

        if (beanName.equals("userService")) {
            Object proxyInstance = Proxy.newProxyInstance(XimiBeanPostProcessor.class.getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    // 切面
                    System.out.println("切面逻辑");

                    return method.invoke(bean, args);
                }
            });

            return proxyInstance;
        }

        // bean
        return bean;
    }
}
