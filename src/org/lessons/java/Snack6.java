//Snack Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
//        Possibile usare solo :
//        cicli
//        chartAt
//        if / switch
//        Es. “25" come stringa deve essere convertito in intero 25.
package org.lessons.java;
import java.util.Scanner;
public class Snack6 {
    public static void main(String[] args) {
        System.out.println("inserisci un numero");
        Scanner inputUtente = new Scanner(System.in);
        String numeroUtente = inputUtente.nextLine();

        for (int i = 0; i < numeroUtente.length(); i++) {
            char carattere = numeroUtente.charAt(i);
            System.out.print(carattere);
        }
    }
}
