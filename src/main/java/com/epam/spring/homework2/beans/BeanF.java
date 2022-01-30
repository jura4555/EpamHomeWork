package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.MyValidator;

public class BeanF implements MyValidator {
    private String name;
    private double value;

    public BeanF(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanF{" +
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
