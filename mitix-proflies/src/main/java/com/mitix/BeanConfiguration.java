package com.mitix;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class BeanConfiguration {

    @Bean(name = "mytestbean")
    public MyTestBean myTestBean() {
        return new MyTestBean();
    }

    @Bean
    @Profile("dev")
    public PropertyPlaceholderConfigurer devPropertyPlaceholderConfigurer() {
        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer=new PropertyPlaceholderConfigurer();
        propertyPlaceholderConfigurer.setLocation(new ClassPathResource("com/mitix/dev.properties"));
        return propertyPlaceholderConfigurer;
    }

    @Bean
    @Profile("prod")
    public PropertyPlaceholderConfigurer prodPropertyPlaceholderConfigurer() {
        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer=new PropertyPlaceholderConfigurer();
        propertyPlaceholderConfigurer.setLocation(new ClassPathResource("com/mitix/prod.properties"));
        return propertyPlaceholderConfigurer;
    }
}
