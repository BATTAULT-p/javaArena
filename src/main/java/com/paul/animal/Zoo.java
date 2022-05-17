package com.paul.animal;

public class Zoo {


    public static void main(String[] args){
        Animal animal1 = new Animal("lion",14);
        Animal animal2 = new Animal("guepard",10);
        Animal animal3 = new Animal("chien",8);
        Animal animal4 = new Animal("chat",6);
        animal1.crier();
        int i = 0;
        int e = 0;

        do {
            i = randomNumber() + animal1.power;
            e = randomNumber() + animal2.power;
            Animal winner;
            if (i > e){
                winner = animal1;
            } else{
                winner = animal2;
            }
            print(winner);
        } while (i > e);
    }
    static void print(Animal animal){
        System.out.println("vainqueur :" + animal.type);
    }
    static int randomNumber(){
        return  (int) ((Math.random() * (10-1)));
    }

}
