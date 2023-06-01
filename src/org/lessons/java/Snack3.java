//Snack3 Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

package org.lessons.java;

public class Snack3 {
    public static void main(String[] args) {

        int[] mioArray = {1,2,3,4,5,6,7,8,9};

        int sommaDeiDispari = 0;

        for (int i = 0; i < mioArray.length; i++) {
            if(mioArray[i] % 2 != 0){

                sommaDeiDispari += mioArray[i];
            }
        }
        System.out.println(sommaDeiDispari);


    }
}
