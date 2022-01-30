package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.MyValidator;

public class BeanB implements MyValidator {
    private String name;
    private double value;

    public BeanB(String name, double value) {
        this.name = name;
        this.value = value;
    }

    private void customInitMethod(){
        System.out.println("BeanB Inside customInitMethod");
    }

    private void otherInitMethod(){
        System.out.println("BeanB Inside otherInitMethod");
    }

    private void customDestroyMethod(){
        System.out.println("BeanB Inside customInitDestroy");
    }

    @Override
    public String toString() {
        return "BeanB{" +
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
