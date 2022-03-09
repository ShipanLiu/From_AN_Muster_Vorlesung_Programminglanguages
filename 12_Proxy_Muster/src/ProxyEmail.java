import java.util.Base64;


public class ProxyEmail implements IEmail{
    private String Subject;         // Subject
    private EmailImpl Email;        // EmailImpl Klasse: momentan null
    private String encoded;         // encoded message
    private String decoded;     // Decoded message
    private boolean isDecoded = false;      // frage, ob es decoded wurde

    public ProxyEmail(String Subject, String encoded){
        this.encoded = encoded;         // Nachricht kommt verschlüsselt an
        this.Subject = Subject;
    }

    private void decode(){
        // decodiere die Nachricht und wenn es dekodiert ist, dann wechsle auf True
        this.decoded = new String(Base64.getDecoder().decode(this.encoded));
        this.isDecoded = true;
    }

    @Override
    public String getSubject() {
        return this.Subject;        // Subject darf auch schon wiedergegeben werden
    }

    @Override
    public String getContent() {
        // Bei der nachfrage auf dem Content (welches noch nicht dekodiert wurde)
        if(Email != null){
            // Wenn eine EmailImpl Klasse schon existiert, dann wird der Content daraus entzogen
            return Email.getContent();
        }else{
            // wenn nicht, dann kommt ein Loading bildschirm
            System.out.println("wird decodiert...");
            if(this.isDecoded){
                // Wenn es bereits decodiert wurde, dann ist die Proxy Klasse nicht mehr
                // nötigt und eine EmailImpl KLasse wird erstellt
                this.Email = new EmailImpl(this.Subject, this.decoded);
            }else{
                this.decode();  // decodiere, wenn es noch nicht decodiert wurde
            }
        }
        return this.getContent();   // Content wird wieder aufgerufen, bis es decodiert wurde
    }
}
