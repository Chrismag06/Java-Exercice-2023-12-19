package Exercice8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercice 8 :
        // Écrire un programme en Java qui permet de saisir 10 entiers dans un tableau.
        // - compter combien y a-t-il d'éléments pairs et impairs.
        // - mettre les éléments pairs dans un tableau T1 et les éléments impaires dans
        // un tableau T2.
        // - Puis afficher T1 et T2

        Scanner scanner = new Scanner(System.in);

        int[] tab = new int[10];
        int[] T1 = new int[10];
        int[] T2 = new int[10];
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
                T1[nbPair++] = tab[i];
            } else {
                T2[nbImpair++] = tab[i];
            }
            nbResteASaisir--;
        }

        System.out.println("Premier tableau saisie:");
        for (i = 0; i < tab.length; i++) {
            System.out.printf("%d ", tab[i]);
        }
        System.out.println("");

        System.out.println("\ntableau pair:");
        i = 0;
        while (i < nbPair) {
            System.out.printf("%d ", T1[i]);
            i++;
        }
        System.out.println("");

        System.out.println("\ntableau impair:");
        i = 0;
        while (i < nbImpair) {
            System.out.printf("%d ", T2[i]);
            i++;
        }

        scanner.close();

    }
}
