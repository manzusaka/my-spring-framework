package com.mitix.spring.exp19;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * 
 *创建于:2016年5月15日<br>
 *版权所有(C) 2016 one dream code farmer<br>
 * 水果名字注解
 * @author hlh19
 * @version 1.0.0
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface FruitName {
  public String name() default "";
}
