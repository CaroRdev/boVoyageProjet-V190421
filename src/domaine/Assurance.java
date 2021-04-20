package domaine;

/**
 *  L'utilisateur peut souscrire une assurance
 */
public class Assurance {


    public double prixAssurance;
    public Contrat  contrat;
    public Reservation  reservation;
    public Assurance(double prixAssurance, Contrat contrat, Reservation reservation) {
        this.prixAssurance = prixAssurance;
        this.contrat = contrat;
        this.reservation = reservation;
    }
    public double getPrixAssurance() {
        return prixAssurance;
    }
    public void setPrixAssurance(double prixAssurance) {
        this.prixAssurance = prixAssurance;
    }
    public Contrat getMyContrat() {
        return contrat;
    }
    public void setMyContrat(Contrat myContrat) {
        this.contrat = myContrat;
    }
    public Reservation getMyReservation() {
        return reservation;
    }
    public void setMyReservation(Reservation myReservation) {
        this.reservation = myReservation;
    }


}