package com.paul.animal;

public class Arena {


    public static void main(String[] args){
        Animal carapuce = new Animal("carapuce", 12);
        Animal salameche = new Animal("salameche", 12);
        int i = 0;
        int e = 0;
        int pointsCarapuce = 0;
        int pointsSalameche = 0;
        for (int combat = 0; combat<3;combat++) {

            i = randomNumber() + carapuce.power;
            e = randomNumber() + salameche.power;


            Animal winner;
            if (i > e) {
                winner = carapuce;
                pointsCarapuce = pointsCarapuce + 1;
            } else {
                winner = salameche;
                pointsSalameche = pointsSalameche + 1;
            }

            print(winner);

        }
        Animal bigwinner ;
        if (pointsCarapuce > pointsSalameche) {
            bigwinner = carapuce;
        } else {
            bigwinner = salameche;
        }
        Victoryprint(bigwinner);
    }

    static void print(Animal pokemon){
        System.out.println("vainqueur :" + pokemon.type);
    }
    static void Victoryprint(Animal pokemon){
        System.out.println("Le grand vainqueur est :" + pokemon.type);
    }
    static int randomNumber(){
        return  (int) ((Math.random() * (10-1)));
    }



}
