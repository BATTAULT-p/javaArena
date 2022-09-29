package com.paul.animal;

public class Arena {


    public static void main(String[] args){
        Pokemon carapuce = new Pokemon("carapuce", 0,Elements.WATER);
        Pokemon salameche = new Pokemon("salameche", 0, Elements.FIRE);
        Pokemon pikachu = new Pokemon("pikachu", 0,Elements.ELECTRIC);

        Fight manche = new Fight(1000, 1);

        for (int combat = 0; combat<5;combat++) {

            Animal winner = manche.match(carapuce, salameche);
            Fightwinner(winner);
        }
        win(carapuce, salameche);

    }
    static void Fightwinner(Animal animal){
        System.out.println("vainqueur :" + animal.getType() );
        animal.win();
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
