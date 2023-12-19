package Exercice4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercice 4 :
        // Une boutique propose à ses clients, une réduction de 15% pour les montants
        // d’achat supérieurs à 200 Euros.
        // Écrire un programme en Java permettant de saisir le prix total HT
        // et de calculer le montant TTC en prenant en compte la réduction et la
        // TVA=20%.
        Scanner scanner = new Scanner(System.in);

        double reduction = 15;
        double montantPourReduction = 200;
        double TVA = 20;

        System.out.println("Veuillez saisir un prix total HT");
        double prixTotalHT = scanner.nextDouble();

        double prixTotalTTC = prixTotalHT * (TVA / 100 + 1);

        System.out.print("Le montant TTC  ");
        if (prixTotalHT > montantPourReduction) {
            prixTotalTTC -= reduction * prixTotalTTC / 100;
            System.out.print("après réduction ");
        }

        System.out.printf("est %.2f \n", prixTotalTTC);
        
        scanner.close();
    }
}
