package com.paul.animal;

public class Animal {
    String type;
    int power;

    public Animal(String type,int power){
        this.type = type;
        this.power = power;
    }

    public void crier() {
        System.out.println(type);
    }
}
