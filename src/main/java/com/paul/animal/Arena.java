package com.paul.animal;

public class Arena {


    public static void main(String[] args){
        Animal carapuce = new Animal("carapuce");
        Animal salameche = new Animal("salameche");
        Animal pikachu = new Animal("pikachu");

        for (int combat = 0; combat<5;combat++) {
            fight(carapuce, pikachu);
        }
        win(carapuce, pikachu);
    }

    static void Fightwinner(Animal pokemon){
        System.out.println("vainqueur :" + pokemon.getType() );
        pokemon.win();
    }
    static void Bigwinner(Animal pokemon){
        System.out.println("Le grand vainqueur est :" + pokemon.getType());
    }
    static int randomNumber(){
        return  (int) ((Math.random() * (10-1)));
    }
    static void fight(Animal fighter1, Animal fighter2){
        int i = randomNumber() + fighter1.getPower();
        int e = randomNumber() + fighter2.getPower();

        Animal winner;
        if (i > e) {
            winner = fighter1;
        } else {
            winner = fighter2;
        }
        Fightwinner(winner);
    }
    static void win(Animal fighter1, Animal fighter2){
        Animal bigwinner ;
        if (fighter1.getVictory() > fighter2.getVictory()) {
            bigwinner = fighter1;
        } else {
            bigwinner = fighter2;
        }
        Bigwinner(bigwinner);
    }

}
