package com.ximi.spring;

/**
 * @author 西米的风
 * @description TODO
 * @date 2022-08-24 0:47
 */
public interface BeanPostProcessor {
    default Object postProcessBeforeInitialization(Object bean, String beanName) {
        return bean;
    }

    default Object postProcessAfterInitialization(Object bean, String beanName) {
        return bean;
    }
}
