package Exercice9;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercice 9 :
        // Écrivez un programme Java qui itère les entiers de 1 à 100 :
        // ‐ Pour les multiples de trois, imprimez "Fizz" au lieu du nombre et pour les
        // multiples de cinq
        // imprimez "Buzz".
        // ‐ Pour les nombres qui sont des multiples de trois et cinq, imprimez
        // "FizzBuzz".

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.printf("%d --> FizzBuzz \n",i);
            else if (i % 3 == 0)
                System.out.printf("%d --> Fizz \n",i);
            else if (i % 5 == 0)
                System.out.printf("%d --> Buzz \n",i);
        }

    }
}
