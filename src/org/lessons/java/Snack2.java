//Snack2 Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una
//        lista di cognomi, e da queste vuole mostrare a video una
//        falsa lista di invitati con nome e cognome.

package org.lessons.java;
import java.util.Random;
public class Snack2 {
    public static void main(String[] args) {

        String[] nomi = {"Pietro","Susanna","Tommy","Mario","Roberto","Maria"};
        String[] cognomi = {"Amba","Raba'","Cici'","Coco'","Tre","Civette"};
        Random rand = new Random();

        int nomeCasuale = rand.nextInt(nomi.length);
        int cognomeCasuale = rand.nextInt(cognomi.length);

        System.out.print("l'accoppiata nome+cognome generata e'..." + nomi[nomeCasuale] + " " + cognomi[cognomeCasuale]);
    }
}
