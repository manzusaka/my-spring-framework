package com.mitix.spring.context.expb;

import java.lang.annotation.Annotation;

public class ClassTest {
    public static void main(String[] args) {
        Annotation[] annotations = DiConfig.class.getAnnotations();
        System.out.println(annotations.length);
    }
}
