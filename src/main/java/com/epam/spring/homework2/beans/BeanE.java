package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.MyValidator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE implements MyValidator {
    private String name;
    private double value;

    public BeanE(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("BeanE Inside @PreDestroy");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("BeanE Inside @PostConstruct");
    }


    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
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
