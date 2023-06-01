//Snack3 Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

package org.lessons.java;

public class Snack3 {
    public static void main(String[] args) {

        int[] mioArray = {0,0,0,4,5,6,7,8,9,10,1,5,5};

        int sommaDeiDispari = 0;

        for (int i = 0; i < mioArray.length; i++) {
            if ((i + 1) % 2 != 0) {
                sommaDeiDispari += mioArray[i];
            }
        }

        System.out.println("La somma degli elementi in posizione dispari è: " + sommaDeiDispari);
    }
}