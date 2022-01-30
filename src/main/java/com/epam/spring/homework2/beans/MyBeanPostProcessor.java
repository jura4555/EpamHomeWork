package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.MyValidator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof MyValidator){
            ((MyValidator) bean).validate();
        }
        return bean;
    }
}
