package TP2.src.TP2;

import java.util.*;

public class liste {
    
    protected ArrayList<Object> list;
    private int currentPos = 0;

    protected liste() {
        list = new ArrayList<Object>();
        //System.out.println("Création de notre liste");
    }
    
    protected void afficher() {
        System.out.println(list);
    }
    
    protected Object objetCourrant() {
        if(list.size() - 1 == 0) {
            //System.out.println("Erreur: La liste est vide pour le moment");
            return null;
        } else {
            //System.out.println("Le curseur est positionné sur le premier élément: " + currentPos);
            return list.get(currentPos);
        }
    }

    protected void Premier() {
        if(list.size() - 1 == 0) {
            currentPos = 0;
            //System.out.println("Erreur: La liste est vide pour le moment");
        } else {
            currentPos = 0;
            //System.out.println("Le curseur est positionné sur le premier élément: " + currentPos);
        }
    }

    protected void Dernier() {
        if(list.size() - 1 == 0) {
            currentPos = 0;
            //System.out.println("Erreur: La liste est vide pour le moment");
        } else {
            currentPos = list.size() - 1;
            //System.out.println("Le curseur est positionné sur le dernier élément: " + currentPos);
        }
    }

    protected Object Suivant() {
        if(currentPos != list.size() - 1) {
            //System.out.println("On retourne l'élément suivant");
            return list.get(currentPos + 1);
        } else {
            //System.out.println("On retourne le dernier élément");
            return list.get(currentPos);
        }
    }

    protected void Supprimer() {
        list.remove(currentPos);
    }

    protected void Ajouter(Object myObject) {
        list.add(myObject);
    }
}