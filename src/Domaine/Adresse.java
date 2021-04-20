package Domaine;
/*
utilisé par personne et hotel
 */
public class Adresse {
    private String rue;
    private String ville;
    private String codePostal;
    private String pays;
    //public String region;

    public Adresse(String rue, String ville, String codePostal, String pays, String region) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.pays = pays;
    }

    public String getRue() { return rue; }
    public void setRue(String rue) { this.rue = rue; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }

    public String getCodePostal() { return codePostal; }
    public void setCodePostal(String codePostal) { this.codePostal = codePostal; }

    public String getPays() { return pays; }
    public void setPays(String pays) { this.pays = pays; }

}
