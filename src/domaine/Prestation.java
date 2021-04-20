package domaine;

import java.util.Date;

/**
 *  La prestation comprend :
 *  - date de d?part
 *  - date d'arriv?e
 *  - prix HT
 *  - compagnie
 */
public abstract class Prestation {
    private Date dateDepart;
    private Date dateArrivee;
    //verifier prix et prixHT dans les différentes classes
    private double prixHT;

    public Prestation(Date dateDepart, Date dateArrivee, double prixHT) {
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.prixHT = prixHT;
    }
    public Prestation() {
    }


    public Date getDateDepart() { return dateDepart; }
    public void setDateDepart(Date dateDepart) { this.dateDepart = dateDepart; }

    public Date getDateArrivee() { return dateArrivee; }
    public void setDateArrivee(Date dateArrivee) { this.dateArrivee = dateArrivee; }

    public double getPrixHT() { return prixHT; }
    public void setPrixHT(double prixHT) { this.prixHT = prixHT; }



}
