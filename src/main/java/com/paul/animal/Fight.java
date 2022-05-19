package com.paul.animal;

public class Fight {

    public void match(Animal fighter1, Animal fighter2) {
        int finalPowerFighter1 = randomPower() + fighter1.getPower();
        int finalPowerFighter2 = randomPower() + fighter2.getPower();

        Animal winner;
        if (finalPowerFighter1 > finalPowerFighter2) {
            winner = fighter1;
        } else {
            winner = fighter2;
        }
        Fightwinner(winner);
    }
    static int randomPower(){

        return  (int) ((Math.random() * (10-1)));
    }
    static void Fightwinner(Animal animal){
        System.out.println("vainqueur :" + animal.getType() );
        animal.win();
    }
}
