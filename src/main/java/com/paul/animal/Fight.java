package com.paul.animal;

public class Fight {
    private int value1 = 10;
    private int value2 = 1;


    public Fight(int value1, int value2){
        this.value1=value1;
        this.value2=value2;
    }

    public Animal match(Animal fighter1, Animal fighter2) {
        int finalPowerFighter1 = randomPower1() + fighter1.getPower();
        int finalPowerFighter2 = randomPower1() + fighter2.getPower();

        Animal winner;
        if (finalPowerFighter1 > finalPowerFighter2) {
            winner = fighter1;
        } else {
            winner = fighter2;
        }
        return winner;
    }
    static int randomPower(){

        return  (int) ((Math.random() * (10-1)));
    }

    public int randomPower1(){
        return  (int) ((Math.random() * (this.value1 - this.value2)));
    }

}



