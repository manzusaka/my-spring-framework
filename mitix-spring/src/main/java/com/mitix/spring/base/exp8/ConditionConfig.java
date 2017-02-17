package com.mitix.spring.base.exp8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by oldflame on 2017/2/13.
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsConditional.class)
    public ListService WindowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService LinuxService(){
        return new LinuxListService();
    }
}
