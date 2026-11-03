
package deepai;

public class AgentIA {

    private int id_agent;
    private String nom;

    public AgentIA(int id_agent, String nom) {
    	this.id_agent = id_agent;
    	this.nom = nom;
    }

    public int getId_agent() {
    	return id_agent;

    }

    public String getNom() {
    	return nom;

    }

    public void executer() {
    	System.out.println("L'agent " + nom + " est en cours d'exécution.");
    }

}
