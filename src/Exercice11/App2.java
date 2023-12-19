package Exercice11;

public class App2 {
    public static void main(String[] args) throws Exception {

        // Exercice 11 :
        // Écrivez un programme java qui renvoie le plus grand entier dans un tableau.
        // Exemple:
        // int[] tab = {1, 2, 9, 4};
        // Add min number in the result

        int[] tab = {41, 74, 1, 2, 9, 4, 25 };
        int min = tab[0];
        int max = 0;

        for (int i = 0; i <= tab.length - 1; i++) {
            if (tab[i] > max)
                max = tab[i];
            if (tab[i] < min)
                min = tab[i];
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);

    }
}
