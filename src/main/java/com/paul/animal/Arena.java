package com.paul.animal;

public class Arena {


    public static void main(String[] args){
        Pokemon carapuce = new Pokemon("carapuce", 0, "eau");
        Pokemon salameche = new Pokemon("salameche", 0, "feu");
        Pokemon pikachu = new Pokemon("pikachu", 0,"electrique");

        Fight manche = new Fight();

        for (int combat = 0; combat<5;combat++) {

            manche.match(carapuce, salameche);
        }
        win(carapuce, salameche);

    }

    static void Bigwinner(Animal pokemon){

        System.out.println("Le grand vainqueur est :" + pokemon.getType());
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
