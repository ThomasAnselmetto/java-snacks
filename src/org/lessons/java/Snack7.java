//Snack 7 Scrivere un programma che dati dei secondi li converta
// in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)

package org.lessons.java;
import java.util.Scanner;
public class Snack7 {
    public static void main(String[] args) {
        System.out.println("inserisci un numero (n. secondi da ricalcolare)");

        Scanner scanner = new Scanner(System.in);
        int inputSeconds = scanner.nextInt();

//    imposto le divisioni di ore minuti e secondi con / e calcolando il % dell'operazione'

        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;

//        conversione in stringa e in formato a doppia cifra

        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("Tempo convertito: " + timeString);


        scanner.close();
    }
}
