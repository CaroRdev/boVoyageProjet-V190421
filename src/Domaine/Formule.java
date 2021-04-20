package Domaine;

import java.util.ArrayList;


/**
 *  La formule est associee au voyage.
 */
public class Formule {
    private double prixTotal;
    public ArrayList<Prestation> mesPrestation;

    public Formule(double prixTotal, ArrayList<Prestation> mesPrestation) {
        this.prixTotal = prixTotal;
        this.mesPrestation = mesPrestation;
    }

    public void addPrestation(Prestation p) {
        mesPrestation.add(p);
    }

    public double getPrixTotal() { return prixTotal; }
    public void setPrixTotal(double prixTotal) { this.prixTotal = prixTotal; }


}