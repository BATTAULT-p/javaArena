package com.paul.animal;

public class Pokemon extends Animal{

    private String element;


    public Pokemon(String type, int power, String element) {
        super(type, power);
        this.element = element;
    }

}

