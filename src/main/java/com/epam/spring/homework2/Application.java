package com.epam.spring.homework2;

import com.epam.spring.homework2.config.BeansConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        System.out.println(" Application is configured");
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(context.getBean(name));
        }
        context.close();
    }
}
