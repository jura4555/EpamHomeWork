package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.epam.spring.homework2.beans")
@PropertySource("homework2.properties")
public class OtherConfig {

    @Value("${BeanB.name}")
    private String nameBeanB;
    @Value("${BeanB.value}")
    private double valueBeanB;

    @Value("${BeanC.name}")
    private String nameBeanC;
    @Value("${BeanC.value}")
    private double valueBeanC;

    @Value("${BeanD.name}")
    private String nameBeanD;
    @Value("${BeanD.value}")
    private double valueBeanD;

    @DependsOn({"getBeanD", "getBeanB", "getBeanC"})
    @Bean
    public BeanA getBeanA(){
       System.out.println("Create beanA");
       return new BeanA("beanA", 5);
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    public BeanB getBeanB(){
        System.out.println("Create beanB");
        return new BeanB(nameBeanB, valueBeanB);
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    public BeanC getBeanC(){
        System.out.println("Create beanC");
        return new BeanC(nameBeanC, valueBeanC);
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    public BeanD getBeanD(){
        System.out.println("Create beanD");
        return new BeanD(nameBeanD, valueBeanD);
    }

    @Bean
    public BeanE getBeanE(){
        System.out.println("Create beanE");
        return new BeanE("beanE", 25);
    }

    @Bean
    @Lazy
    public BeanF getBeanF(){
        System.out.println("Create beanF");
        return new BeanF("beanF", 1024);
    }

}
