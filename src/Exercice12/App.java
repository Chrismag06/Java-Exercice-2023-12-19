package Exercice12;

import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercice 12 : Nombre magique
        // Écrire un programme Java qui permet à l'utilisateur de deviner un nombre
        // choisi aléatoirement par l'ordinateur.
        // Le programme doit donner des indications à l'utilisateur sur si le nombre à
        // deviner est plus grand ou plus petit que la proposition de l'utilisateur.
        // Le jeu doit se poursuivre tant que l'utilisateur n'a pas correctement deviné
        // le nombre.

        // Aide :
        // La boucle while est appropriée pour cet exercice car le nombre de tentatives
        // nécessaires pour deviner le nombre est inconnu à l'avance.
        // La boucle while continue tant que la condition spécifiée est vraie.

        //my se

        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 20;
        int nombreSaisie;

        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(randomNumber);

        System.out.println("Essayez de deviner le nombre généré aléatoirement par l'ordinateur ");

        while (true) {
            nombreSaisie = scanner.nextInt();
            if (nombreSaisie > randomNumber)
                System.out.printf("Le nombre saisie %d est plus grand que random number\n", nombreSaisie);
            else if (nombreSaisie < randomNumber)
                System.out.printf("Le nombre saisie %d  est plus petit que random number\n", nombreSaisie);
            else{
                System.out.println("Bravo!");
                break;
            }
                
        }
        scanner.close();

    }
}
