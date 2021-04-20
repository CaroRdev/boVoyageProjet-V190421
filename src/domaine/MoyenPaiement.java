package domaine;

public abstract class MoyenPaiement {

    public String banque;
    public double solde;

    public MoyenPaiement(String banque, double solde) {
        this.banque = banque;
        this.solde = solde;
    }
    public MoyenPaiement() {

    }




}
