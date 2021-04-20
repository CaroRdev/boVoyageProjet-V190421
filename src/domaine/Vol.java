package domaine;

import java.util.Date;

public class Vol extends Prestation {
    private String aeroport;
    private String compagnie;

    public Vol() {
    }

    public Vol(Date dateDepart, Date dateArrivee, double prixHT, String aeroport, String compagnie) {
        super(dateDepart, dateArrivee, prixHT);
        this.aeroport = aeroport;
        this.compagnie = compagnie;
    }

    public String getAeroport() { return aeroport; }
    public void setAeroport(String aeroport) { this.aeroport = aeroport; }

    public String getCompagnie() { return compagnie; }
    public void setCompagnie(String compagnie) { this.compagnie = compagnie; }


}