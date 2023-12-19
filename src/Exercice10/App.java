package Exercice10;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercice 10 :
        // Écrivez un programme Java qui inverse une chaîne de caractères.

        // Aide : Utiliser StringBuilder pour inverser la chaîne de manière efficace
        // https://www.codecademy.com/resources/docs/java/stringbuilder/reverse

        StringBuilder str = new StringBuilder("Hello World!");
        System.out.println(str.toString());
        str.reverse();
        System.out.println(str.toString());
    }
}
