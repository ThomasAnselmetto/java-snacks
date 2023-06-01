//Snack4 Data in input una stringa verificare se è palindroma
package org.lessons.java;
import java.util.Scanner;
public class Snack4 {
    public static void main(String[] args) {
        System.out.println("Inserisci una parola e vediamo se e' palindroma...");
        Scanner input = new Scanner(System.in);
        String userWord = input.nextLine();

//        creo un booleano flag per la palindromia
        boolean palindroma = true;
//    ciclo tutti i caratteri della parola divisa in 2 e confronto in una condizione il carattere iniziale che incrementa
//    con il crattere finale che decrementa appena trovo caratteri diversi esco dal ciclo

        for (int i = 0; i < userWord.length() / 2; i++) {
            if (userWord.charAt(i) != userWord.charAt(userWord.length() - 1 - i)) {
                palindroma = false;
                break;
            }
        }
    if (palindroma){
        System.out.println("La parola: " + userWord + " e' palindroma");
    }else{
        System.out.println("La parola: " + userWord + " non e' palindroma");;
    }


    }
}
