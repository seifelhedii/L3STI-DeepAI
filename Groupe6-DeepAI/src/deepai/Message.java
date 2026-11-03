
package deepai;

public class Message {

    private int id_message;
    private String contenu;

    public Message(int id_message, String contenu) {
        this.id_message = id_message;
        this.contenu = contenu;
    }

    public int getId_message() {
        return id_message;
    }

    public String getContenu() {
        return contenu;
    }

    public void afficherMessage() {
        System.out.println(contenu);
    }
}
