package deepai;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conversation {

    private int id_conversation;
    private Date date_creation;
    private List<Message> messages;

    public Conversation(int id_conversation) {
        this.id_conversation = id_conversation;
        this.date_creation = new Date();
        this.messages = new ArrayList<>();
    }

    public int getId_conversation() {
        return id_conversation;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void envoyerMessage(Message message) {
        messages.add(message);
    }

    public void afficherMessages() {
        for (Message message : messages) {
            System.out.println(message.getContenu());
        }
    }
}
