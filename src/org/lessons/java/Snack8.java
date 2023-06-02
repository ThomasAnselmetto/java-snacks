//Snack8 Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero.

package org.lessons.java;

import java.util.Scanner;

public class Snack8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean validNumber = false;
        int number;
        do {
            System.out.print("Insert a 4 digit number: ");
            number = scan.nextInt();

//            validazione del numero inserito n strettamente maggiore di 999 e str minore di 10000
            if (number > 999 && number < 10000) {
                // valid number
                validNumber = true;
            }
        } while (!validNumber);
        System.out.println("Il tuo numero valido e': " + number);

//      divido la il numero dato di 4 cifre per mille e ottengo come resto dalla sua ulteriore divisione per 10 l'ultima cifra proseguo cosi fino alla prima

        int unita = (number / 1000 % 10);
        int decine = (number / 100 % 10);
        int centinaia = (number / 10 % 10);
        int migliaia = (number % 10);

//        sommo il contenuto delle variabili tra di loro

        int somma = migliaia + centinaia + decine +unita;

        System.out.println("La somma dei numeri da te scelti e': " + somma);

        scan.close();
    }
}