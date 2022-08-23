package com.ximi.main.service;

import com.ximi.spring.BeanPostProcessor;
import com.ximi.spring.Component;

import java.lang.reflect.Field;

/**
 * @author 西米的风
 * @description TODO
 * @date 2022-08-24 0:55
 */
@Component
public class XimiValueBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {

        for (Field field : bean.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(XimiValue.class)) {
                field.setAccessible(true);
                try {
                    field.set(bean, field.getAnnotation(XimiValue.class).value());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // bean
        return bean;
    }
}