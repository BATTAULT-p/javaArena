package com.paul.animal;

public class Arena {


    public static void main(String[] args){
        Animal carapuce = new Animal("carapuce");
        Animal salameche = new Animal("salameche");
        Animal pikachu = new Animal("pikachu");
        Fight match1 = new Fight();

        for (int combat = 0; combat<5;combat++) {

            match1.match(carapuce, salameche);
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
