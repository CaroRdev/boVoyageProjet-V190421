package domaine;

/**
 *  Le client n'est pas forcement voyageur, c'est celui ou celle qui paye le voyage.
 */
public class Client extends Personne {

    public Reservation  myReservation;
    public Facture  myFacture;
    public MoyenPaiement  myMoyenPaiement;
    private String user = "Client1";
    private String password = "abcde";

    public Client() {
        super();
    }

    public Reservation getMyReservation() {
        return myReservation;
    }
    public void setMyReservation(Reservation myReservation) {
        this.myReservation = myReservation;
    }
    public Facture getMyFacture() {
        return myFacture;
    }
    public void setMyFacture(Facture myFacture) {
        this.myFacture = myFacture;
    }

    public boolean authentification(String userName, String passWord) {
        System.out.println(userName+" "+passWord);
        return userName.equals(this.user) && passWord.equals(this.password);
    }


}
