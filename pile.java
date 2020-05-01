package TP2.src.TP2;

public class pile {
    
    private liste maListe;
    
    public pile() {
        maListe = new liste();
        //System.out.println("Création de notre pile");
    }
    
    public void afficher() {
        maListe.afficher();
    }
    
    public void Empiler(Object myNewItem) {
        maListe.Ajouter(myNewItem);
    }

    public Object Depiler() {
        maListe.Dernier();
        Object tmp = maListe.objetCourrant();
        if (tmp != null) maListe.Supprimer();
        else System.out.println("On ne peut pas suprrimer, aucun item présent");
        return tmp;
    }
}