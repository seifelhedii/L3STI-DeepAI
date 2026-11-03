
package deepai;

public class Main {

    public static void main(String[] args) {

        
    	// Essai création des deux goats
    	
        Utilisateur u1 = new Utilisateur(
            1, "Metayer", "Theo", "theo@gmail.com", "1234"
        );
        
        Utilisateur u2 = new Utilisateur(
        	2, "Metayer", "Seifelhedi", "pmahmoud347@gmail.com", "ABCDEFG"
        );

        u1.sInscrire();
        u1.acheterToken(10.0);
        
        System.out.println("Solde utilisateur : " + u1.getSolde_token() + " $");
        
        u2.sInscrire();
        u2.acheterToken(40.0);
        
        System.out.println("Solde utilisateur : " + u2.getSolde_token() + " $");
        

        
        
        // Attribuer prix tokens : 
        
        ModeleIA modele1 = new ModeleIA("DeepFast : un modèle rapide et peu couteux : 0,10 $ / MTok (millions de tokens)", 0.10);
        ModeleIA modele2 = new ModeleIA("DeepMedium : un modèle parfait pour tous les usages : 0,50 $ / MTok", 0.50);
        ModeleIA modele3 = new ModeleIA("DeepThink : un modèle capable de raisonnement avancé : 1 $ / MTok", 1.00);

        System.out.println("\nModèles disponibles :");
        System.out.println(modele1.getNom());
        System.out.println(modele2.getNom());
        System.out.println(modele3.getNom());
        
        
        

        // Création conversation
        
        
        Conversation essai = new Conversation(1);
        Conversation essai2 = new Conversation(2);
        
        
        

        // Messages conv1
        
        
        Message message1 = new Message(1, "Je m'appelle Théo");
        Message message2 = new Message(2, "Moi je suis agent IA");

        essai.envoyerMessage(message1);
        essai.envoyerMessage(message2);
        
        
        
        // Messages conv2
        
        
        Message message3 = new Message(3, "Comment s'est passé votre journée ?");
        Message message4 = new Message(4, "Mal");
        
        
        essai2.envoyerMessage(message3);
        essai2.envoyerMessage(message4);
        
        
        System.out.println("\nMessages de la conversation 1 :");
        essai.afficherMessages();
        System.out.println("\nMessages de la conversation 2 :");
        essai2.afficherMessages();

        
        
  
        // historique conv1
        
        Historique h1 = new Historique(1);
        h1.ajouterConversation(essai);

        System.out.println();
        h1.consulterHistorique();
        
        
        // historique conv2
        
        Historique h2 = new Historique(2);
        h2.ajouterConversation(essai2);

        System.out.println();
        h2.consulterHistorique();
        
        
        

        // Calcul tokens (requete moyenne)
        
        Token t1 = new Token(1000000, 500000, modele2.getPrix_token());

        System.out.println("\nConsommation : " + t1.calculerQuantite() + " tokens");
        System.out.println("Prix de la requête : " + t1.calculerPrix() + " $");
        
        
        // Calcul tokens (requête grosse)
        
        Token t2 = new Token(1000000, 500000, modele3.getPrix_token());

        System.out.println("\nConsommation : " + t2.calculerQuantite() + " tokens");
        System.out.println("Prix de la requête : " + t2.calculerPrix() + " $");
        
        
        // Calcul tokens (requête petite)
        
        Token t3 = new Token(1000000, 500000, modele1.getPrix_token());

        System.out.println("\nConsommation : " + t3.calculerQuantite() + " tokens");
        System.out.println("Prix de la requête : " + t3.calculerPrix() + " $");
        
        

        // Création IA
        AgentIA agent1 = new AgentIA(1, "AssistantCode");

        System.out.println();
        agent1.executer();

    }
}
