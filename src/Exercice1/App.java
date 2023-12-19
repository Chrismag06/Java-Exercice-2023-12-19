package Exercice1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercice 1 :
        // Écrire un programme en Java qui demande l'âge d'un enfant et permet
        // d'informer de sa catégorie sachant que les catégories sont les suivantes:
        // "poussin de 6 a 7 ans"
        // "pupille de 8 a 9 ans "
        // "minime de 10 a 11 ans "
        // " cadet après 12 ans ".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'age de l'enfant?");

        int AgeEnfant = scanner.nextInt();

        String type = (AgeEnfant >= 12) ? "cadet"
                : (AgeEnfant >= 10) ? "minime"
                        : (AgeEnfant >= 8) ? "pupille" : (AgeEnfant >= 6) ? "poussin" : "out of scope";

        System.out.println(type);

        scanner.close();

    }
}
