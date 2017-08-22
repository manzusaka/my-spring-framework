package com.mitix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {BeanConfiguration.class})
@ContextConfiguration(locations = {"classpath:com/mitix/applicationContext.xml"})
@ActiveProfiles("prod")
public class ApplicationContextTest extends AbstractJUnit4SpringContextTests {

    @Test
    public void profilesTest() {
        MyTestBean myTestBean= (MyTestBean) applicationContext.getBean("mytestbean");
        System.out.println(myTestBean.getTestStr());
    }

}
