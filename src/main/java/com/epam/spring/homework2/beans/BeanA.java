package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.MyValidator;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean, DisposableBean, MyValidator {
    private String name;
    private double value;

    public BeanA(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanA Inside InitializingBean.afterPropertiesSet ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanA Inside DisposableBean.destroy");
    }

    @Override
    public void validate() {
        if(name != null && value > 0){
            System.out.println(getClass().getSimpleName() + "is valid");
        } else{
            System.out.println(getClass().getSimpleName() + "is not valid");
        }
    }
}
