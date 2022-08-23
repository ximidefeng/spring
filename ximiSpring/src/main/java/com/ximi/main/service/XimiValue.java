package com.ximi.main.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 西米的风
 * @description TODO
 * @date 2022-08-24 0:56
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface XimiValue {
    String value() default "";
}
