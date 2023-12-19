package Exercice11;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercice 11 :
        // Écrivez un programme java qui renvoie le plus grand entier dans un tableau.
        // Exemple:
        // int[] tab = {1, 2, 9, 4};

        int[] tab = { 1, 2, 9, 4, 25 };
        int max = 0;

        for (int i = 0; i <= tab.length - 1; i++) {
            if (tab[i] > max)
                max = tab[i];
        }

        System.out.println(max);

    }
}
