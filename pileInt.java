package TP2.src.TP2;

public class pileInt {
    
    private listeInt maListe;
    
    public pileInt() {
        maListe = new listeInt();
        //System.out.println("Création de notre pile");
    }

    public void pileCroissante(int taille) {
        for (int i = taille; i > 0; i--) {
            this.Empiler(i);
        }
    }
    
    public int sizePile() {
        return maListe.list.size();
    }
    
    public void afficher() {
        maListe.afficher();
    }
    
    public void Empiler(Integer myNewItem) {
        maListe.Ajouter(myNewItem);
    }
    
    public Integer Depiler() {
        maListe.Dernier();
        Integer tmp = maListe.objetCourrant();
        maListe.Supprimer();
        return tmp;
    }
}