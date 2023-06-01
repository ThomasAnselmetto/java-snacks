//Snack5 Data una stringa in input mostrare a video quanti caratteri alfabetici
// contiene, quanti numeri e quanti simboli non alfanumerici.

package org.lessons.java;
import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        System.out.println("Inserisci del testo alfanumerico, aggiungi anche dei simboli:");
        Scanner inputUtente = new Scanner(System.in);
        String frase = inputUtente.nextLine();

//    devo trovare la cifra per ogni tipologia quindi imposto subito dei counter a 0 per ogni tipo
        int caratteriAlfabetici = 0;
        int numeri = 0;
        int simboliNonAlfanumerici = 0;

//        ciclo tutti i caratteri e stabilisco di che natura siano
        for (int i = 0; i < frase.length(); i++) {

//            definisco il carattere usando charAt che restituisce il carattere della posizione richiesta(i) della stringa
            char carattere = frase.charAt(i);

//    quindi condizione se il carattere selezionato sia una lettera una cifra o altro
            if (Character.isLetter(carattere)) {
                caratteriAlfabetici++;
            } else if (Character.isDigit(carattere)) {
                numeri++;
            } else {
                simboliNonAlfanumerici++;
            }
        }

        System.out.println("Numero di caratteri alfabetici: " + caratteriAlfabetici);
        System.out.println("Numero di numeri: " + numeri);
        System.out.println("Numero di simboli non alfanumerici: " + simboliNonAlfanumerici);

        inputUtente.close();
    }
}



