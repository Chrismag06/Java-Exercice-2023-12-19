package Exercice2;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercice 2 :
        // Écrire un programme en Java qui permet de calculer la somme S=1+2+3+...+ 10.
        // Utilisant la boucle for.
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            total += i;
            System.out.printf("i:%d total:%d \n", i, total);
        }
        System.out.printf("Total %d ", total);

    }
}
