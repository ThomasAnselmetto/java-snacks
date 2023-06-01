//Snack1 Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

package org.lessons.java;
import java.util.Scanner;
public class Snack1 {

    public static void main(String[] args) {
        System.out.println("inserisci un numero");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(number % 2 == 0){
            System.out.println("il numero scelto e' pari");
        }else{
           int numeroDiRipiego = number + 1;
            System.out.println("il numero scelto non e' pari dunque siamo passati al successivo ossia:" + numeroDiRipiego);
        }


    }
}
