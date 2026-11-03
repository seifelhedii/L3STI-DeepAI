
package deepai;

public class ModeleIA {

    private String nom;
    private double prix_token;

    public ModeleIA(String nom, double prix_token) {
        this.nom = nom;
        this.prix_token = prix_token;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix_token() {
        return prix_token;
    }

}
