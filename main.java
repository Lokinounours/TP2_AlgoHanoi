/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2.src.TP2;

import java.util.*;

/**
 *
 * @author pierr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pileInt P1 = new pileInt();
        pileInt P2 = new pileInt();
        pileInt P3 = new pileInt();
        
        // Random ran = new Random();
        // for (int i = 0; i<5 ;i++) {
        // P1.Empiler(ran.nextInt());
        // }

        P1.pileCroissante(5);
        
        P1.afficher();
        P2.afficher();
        P3.afficher();

        pileInt Ptmp = new pileInt();

        while (P1.sizePile() > 0) {
            Ptmp.Empiler(P1.Depiler());
        }
        while (Ptmp.sizePile() > 0) {
            int tmp = Ptmp.Depiler();
            if (tmp % 2 == 0)
                P2.Empiler(tmp);
            else
                P3.Empiler(tmp);
        }
        P1.afficher();
        P2.afficher();
        P3.afficher();
    }

}
