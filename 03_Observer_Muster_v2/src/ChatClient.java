import java.util.ArrayList;

public class ChatClient {

    private ArrayList<IChatBeobachter> chats = new ArrayList<IChatBeobachter>();

    public ChatClient(){

    }

    public void registriereBeobachter(IChatBeobachter beo){
        if (!this.chats.contains(beo))
            chats.add(beo);
    }

    public void entferneBeobachter(IChatBeobachter beo){
        chats.remove(beo);
    }

    public void benachrichtigeBeobachter(Nachricht nachricht){
        for (IChatBeobachter chat : this.chats){
            chat.aktualisieren(nachricht);
        }
    }

    public void schreibeNachricht(String text, String sender, String empfaenger){
        Nachricht nachricht = new Nachricht(text, sender, empfaenger);
        this.benachrichtigeBeobachter(nachricht);
    }
}
