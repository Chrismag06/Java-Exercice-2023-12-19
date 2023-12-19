package Exercice6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercice 6 :
        // Écrivez un programme Java qui demande deux chiffres à un utilisateur, pour
        // afficher la somme (addition), multiplier, soustraire, diviser et le reste.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un premier chiffre");
        double nb1 = scanner.nextDouble();

        System.out.println("Entrez un deuxième chiffre");
        double nb2 = scanner.nextDouble();

        double somme = nb1 + nb2;
        double multiplier = nb1 * nb2;
        double soustraire = nb1 - nb2;

        double diviser = 0;
        double reste = 0;

        if (nb2 != 0) {
            diviser = nb1 / nb2;
            reste = nb1 % nb2;
        } else {
            System.out.println("Le deuxième nombre ne doit pas être négatif");
        }

        System.out.printf("La somme de %.2f et %.2f est %.2f \n", nb1, nb2, somme);
        System.out.printf("La multiplier de %.2f et %.2f est %.2f \n", nb1, nb2, multiplier);
        System.out.printf("La soustraction de %.2f et %.2f est %.2f \n", nb1, nb2, soustraire);
        System.out.printf("La division de %.2f et %.2f est %.2f \n", nb1, nb2, diviser);
        System.out.printf("Le reste de %.2f et %.2f est %.2f \n", nb1, nb2, reste);

        scanner.close();

    }
}
