package deepai;

public class Token {

    private int tokens_entree;
    private int tokens_sortie;
    private double prix_token;

    public Token(int tokens_entree, int tokens_sortie, double prix_token) {
        this.tokens_entree = tokens_entree;
        this.tokens_sortie = tokens_sortie;
        this.prix_token = prix_token;
    }

    public int getTokens_entree() {
        return tokens_entree;
    }

    public int getTokens_sortie() {
        return tokens_sortie;
    }

    public int calculerQuantite() {
        return tokens_entree + tokens_sortie;
    }

    public double calculerPrix() {
        return (calculerQuantite() / 1000000.0) * prix_token;
    }
}
