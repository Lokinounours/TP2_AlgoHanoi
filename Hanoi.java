package TP2.src.hanoi;

import java.util.*;
import TP2.src.TP2.*;

public class Hanoi {
    public static void algoHanoi(int nbDisque, pileInt D, pileInt A, pileInt I) {
        if (nbDisque != 0) {
            algoHanoi(nbDisque - 1, D, I, A);
            A.Empiler(D.Depiler());
            algoHanoi(nbDisque - 1, I, A, D);
        }
    }

    public static void main(String[] args) {
        pileInt P1 = new pileInt();
        pileInt P2 = new pileInt();
        pileInt P3 = new pileInt();

        int nbDisque = nbDisque();

        P1.pileCroissante(nbDisque);
        P1.afficher();
        P2.afficher();
        P3.afficher();
        algoHanoi(nbDisque, P1, P3, P2); // P1 est la pile de départ et P3 la pile d'arrivé avec P2 notre pile Tmp
        P1.afficher();
        P2.afficher();
        P3.afficher();

    }

    public static int nbDisque() {
        int nb = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Veuillez entrer un nombre positif: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("%s n'est pas un nombre valide.\n", input);
            }
            nb = scanner.nextInt();
        } while (nb < 0);
        scanner.close();

        return nb;
    }
}