package Exercice8;

import java.util.Arrays;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        // Exercice 8 :
        // Écrire un programme en Java qui permet de saisir 10 entiers dans un tableau.
        // - compter combien y a-t-il d'éléments pairs et impairs.
        // - mettre les éléments pairs dans un tableau T1 et les éléments impaires dans
        // un tableau T2.
        // - Puis afficher T1 et T2

        Scanner scanner = new Scanner(System.in);

        int[] tab = new int[10];
        int nbPair = 0;
        int nbImpair = 0;
        int i;
        int nbResteASaisir;

        System.out.println("Entrez 10 entiers: ");

        nbResteASaisir = tab.length;
        for (i = 0; i < tab.length; i++) {
            System.out.printf("Reste à saisir %d \n", nbResteASaisir);
            tab[i] = scanner.nextInt();
            if (tab[i] % 2 == 0) {
                nbPair++;
            } else {
                nbImpair++;
            }
            nbResteASaisir--;
        }

        int[] T1 = new int[nbPair];
        int[] T2 = new int[nbImpair];

        nbPair = 0;
        nbImpair = 0;
        for (i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                T1[nbPair++] = tab[i];
            } else {
                T2[nbImpair++] = tab[i];
            }
        }

        System.out.println("Premier tableau saisie:");

        System.out.println(Arrays.toString(tab));
        System.out.println("");

        System.out.println("\ntableau paire:");
        System.out.printf(Arrays.toString(T1));
        System.out.println("");

        System.out.println("\ntableau impaire:");
        System.out.printf(Arrays.toString(T2));
        System.out.println("");

        scanner.close();

    }
}
