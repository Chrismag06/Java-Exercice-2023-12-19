package Exercice3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercice 3 :
        // Écrire un programme en Java qui permet d'échanger le contenu de deux entiers
        // A et B saisis par l'utilisateur.
        // et afficher ces entiers après l’échange.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un premier entier");
        int A = scanner.nextInt();

        System.out.println("Veuillez saisir un deuxième entier");
        int B = scanner.nextInt();

        System.out.printf("Les entiers saisie sont A: %d et B : %d \n", A, B);

        int C = A;
        A = B;
        B = C;

        System.out.printf("Après changement les deux saisies sont A: %d et B: %d \n", A, B);

        scanner.close();

    }
}