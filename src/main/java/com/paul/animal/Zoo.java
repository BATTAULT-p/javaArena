package com.paul.animal;

public class Zoo {


    public static void main(String[] args){
        Animal animal1 = new Animal("lion",12);
        Animal animal2 = new Animal("guepard",11);
        Animal animal3 = new Animal("chien",10);
        Animal animal4 = new Animal("chat",9);
        animal1.crier();
        int i = 0;
        int e = 0;

        do {
            i = randomNumber() + animal1.getPower();
            e = randomNumber() + animal2.getPower();
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
        System.out.println("vainqueur :" + animal.getType());
    }
    static int randomNumber(){
        return  (int) ((Math.random() * (10-1)));
    }

}
