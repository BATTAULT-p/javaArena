package com.paul.openclassrooms;

public class LessonOne {

    public void coucou(){
        System.out.println("coucou");
    }





    public static void print(String elementamodifier){
        String monString1 = new String("hhhhh1");
        String monString2 = "hhhhh2";
        String elementModifier= elementamodifier.toUpperCase();
        System.out.println(elementModifier);
    }
    public static void main(String[] args) {
        int thisYear = 2019;
        String birthdayMonth = "June";
        int firstDay = 3;
        int daysInWeek = 7;
        firstDay += daysInWeek ;
        final int STARTINGDAY = firstDay ;

        print(birthdayMonth);



        //TODO Etape 1 : créez une variable daysInWeek avec une valeur de 7

        //TODO Etape 2 : ajoutez la valeur de la variable daysInWeek à la variable firstDay, en utilisant un opérateur raccourci

        //TODO Etape 3 : créez une constante numérique nommé STARTINGDAY avec la nouvelle valeur de la variable firstDay

        // Affiche le résultat
        print("There are " + daysInWeek + "days in a week.\nYour starting day in the month is: " + STARTINGDAY);
    }

}