
package deepai;

import java.util.ArrayList;
import java.util.List;

public class Historique {

    private int id_historique;
    private List<Conversation> conversations;

    public Historique(int id_historique) {
        this.id_historique = id_historique;
        this.conversations = new ArrayList<>();
    }

    public int getId_historique() {
        return id_historique;
    }

    public List<Conversation> getConversations() {
        return conversations;
    }

    public void ajouterConversation(Conversation conversation) {
        conversations.add(conversation);
    }

    public void consulterHistorique() {

        System.out.println("Historique des conversations :");

        if (conversations.isEmpty()) {
            System.out.println("Aucune conversation enregistrée.");
        } else {
            for (Conversation c : conversations) {
                System.out.println("Conversation ID : " + c.getId_conversation());
            }
        }
    }
}
