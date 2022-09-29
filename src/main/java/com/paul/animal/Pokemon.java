package com.paul.animal;

public class Pokemon extends Animal{

    private Elements element;


    public Pokemon(String type, int power, Elements element) {
        super(type, power);
        this.element = element;
    }

}

