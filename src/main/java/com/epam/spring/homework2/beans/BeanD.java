package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.MyValidator;

public class BeanD implements MyValidator {
    private String name;
    private double value;

    public BeanD(String name, double value) {
        this.name = name;
        this.value = value;
    }

    private void customInitMethod(){
        System.out.println("BeanD Inside customInitMethod");
    }

    private void customDestroyMethod(){
        System.out.println("BeanD Inside customInitDestroy");
    }

    @Override
    public String toString() {
        return "BeanD{" +
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
