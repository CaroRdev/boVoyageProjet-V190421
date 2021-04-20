package Domaine;

/**
 *  Plusieurs voyageurs peuvent etre inscrits sur le meme voyage
 */
public class Voyageur extends Personne {


    /**
     *  numero carte d'identite ! chiffres et de lettre : type String)
     */
    private String numeroPieceIdentite;
    private int age;
    public Reservation reservation;

    public Voyageur(String numeroPieceIdentite, int age, Reservation reservation) {
        this.numeroPieceIdentite = numeroPieceIdentite;
        this.age = age;
        this.reservation = reservation;
    }

    public Voyageur() {
        super();
    }

    public String getNumeroPieceIdentite() { return numeroPieceIdentite; }
    public void setNumeroPieceIdentite(String numeroPieceIdentite) { this.numeroPieceIdentite = numeroPieceIdentite; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }


}
