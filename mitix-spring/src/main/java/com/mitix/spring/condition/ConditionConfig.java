package com.mitix.spring.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by oldflame on 2017/2/13.
 */
@Configuration
//@Conditional(TestCondition.class)
public class ConditionConfig {

    @Bean
    @Conditional(WindowsConditional.class)
    public ListService WindowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService LinuxService() {
        return new LinuxListService();
    }

    @Bean
    @Conditional(MacOSConditional.class)
    public ListService MacService() {
        return new MacListService();
    }
}
