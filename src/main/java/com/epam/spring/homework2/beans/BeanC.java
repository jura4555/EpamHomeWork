package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.MyValidator;

public class BeanC implements MyValidator {
    private String name;
    private double value;

    public BeanC(String name, double value) {
        this.name = name;
        this.value = value;
    }

    private void customInitMethod(){
        System.out.println("BeanC Inside customInitMethod ");
    }

    private void customDestroyMethod(){
        System.out.println("BeanC Inside customInitDestroy");
    }

    @Override
    public String toString() {
        return "BeanC{" +
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
