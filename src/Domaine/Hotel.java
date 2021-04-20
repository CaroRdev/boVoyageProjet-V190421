package Domaine;

import java.util.ArrayList;
import java.util.Date;

public class Hotel extends Prestation {
    public String nomHotel;
    private int nbEtoiles;
    private ArrayList<Chambre> mesChambres;
    private Adresse adresse;

    public Hotel(Date dateDepart, Date dateArrivee, double prixHT, int nbEtoiles, ArrayList<Chambre> mesChambres,
                 Adresse adresse) {
        super(dateDepart, dateArrivee, prixHT);
        this.nbEtoiles = nbEtoiles;
        this.mesChambres = mesChambres;
        this.adresse = adresse;
    }

    public int getNbEtoiles() { return nbEtoiles; }
    public void setNbEtoiles(int nbEtoiles) { this.nbEtoiles = nbEtoiles; }
    public Adresse getAdresse() { return adresse; }
    public void setAdresse(Adresse adresse) { this.adresse = adresse; }


}
