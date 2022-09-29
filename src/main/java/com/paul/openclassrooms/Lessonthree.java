package com.paul.openclassrooms;

    public class Lessonthree {
        public static void main(String[] args){
            //TODO- Déclarez une variable nommée colors qui correspond à un tableau de String de longueur 5
            String[] colors = new String[5];
            //TODO- Remplissez le tableau avec les couleurs demandées
            colors [0]= "red";
            colors [1]= "yellow";
            colors [2]= "orange";
            colors [3]= "green";
            colors [4]= "blue";
            //TODO- Remplacez 'green' par 'emerald' dans le tableau
            colors [3]= "emerald";

            //Affiche le contenu du tableau
            for(String color:colors){
                System.out.println(color);
            }
        }
    }

