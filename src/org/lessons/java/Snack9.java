//Snack9 Calcola la somma e la media dei primi 10 numeri
package org.lessons.java;

public class Snack9 {
    public static void main(String[] args) {

        int [] primaDecade = {1,2,3,4,5,6,7,8,9,10};

        int somma = 0;

        for (int i = 0; i < primaDecade.length; i++) {
            somma += primaDecade[i];
        }
//        effettuo un operazione di casting per rendere uno dei due elementi del calcolo un double(prima di cio' il risultato della media era 5.0')

        double media = (double)somma / primaDecade.length;

        System.out.println(primaDecade.length);
        System.out.println("La somma e': " + somma);
        System.out.println("La media e': " + media);
    }
}
