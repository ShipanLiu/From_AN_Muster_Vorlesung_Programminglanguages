import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        String encoded = "R2VoZWlt";
        String Subject = "Von MAX an Mustermann: ";
        IEmail Email = new ProxyEmail(Subject, encoded);
        System.out.println(Email.getSubject() + Email.getContent());
    }
}
