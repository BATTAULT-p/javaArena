package com.paul.animal;

public class Animal {
    private String type;
    private int power;
    private int victory;

    public Animal(String type){
        this(type,0);
    }
    public Animal(String type,int power){
        type = type;
        this.power = power;
        this.victory = 0;
    }
    public int getPower(){
        return power;
    }
    public String getType(){
        return type;
    }
    public int getVictory(){
        return victory;
    }
    public void crier() {
        System.out.println(type);
    }
    public void win(){
        victory = victory + 1;
    }
    
}

