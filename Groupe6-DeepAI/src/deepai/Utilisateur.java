package deepai;

public class Utilisateur {

    private int id_utilisateur;
    private String nom;
    private String prenom;
    private String identifiant;
    private String mot_de_passe;
    private double solde_token;

    public Utilisateur(int id_utilisateur, String nom, String prenom, String identifiant, String mot_de_passe) {

        this.id_utilisateur = id_utilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.mot_de_passe = mot_de_passe;
        this.solde_token = 0;
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public double getSolde_token() {
        return solde_token;
    }

    public void sInscrire() {
        System.out.println("Inscription de " + prenom + " " + nom);
    }

    public boolean seConnecter(String identifiant, String mot_de_passe) {
        return this.identifiant.equals(identifiant)
                && this.mot_de_passe.equals(mot_de_passe);
    }

    public void acheterToken(double montant) {
        if (montant > 0) {
            solde_token += montant;
        }
    }
}
