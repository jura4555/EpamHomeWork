package com.epam.spring.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor(){
        System.out.println("MyBeanFactoryPostProcessor constructor");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("Inside MyBeanFactoryPostProcessor.postProcessBeanFactory");
        System.out.println("beanB init method name: " +
                configurableListableBeanFactory.getBeanDefinition("getBeanB").getInitMethodName());
        configurableListableBeanFactory.getBeanDefinition("getBeanB").setInitMethodName("otherInitMethod");
        System.out.println("beanB new init method name: " +
                configurableListableBeanFactory.getBeanDefinition("getBeanB").getInitMethodName());
        System.out.println("postProcessBeanFactory completed");
    }
}
