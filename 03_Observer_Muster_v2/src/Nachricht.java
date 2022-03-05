import java.util.Date;

public class Nachricht {

    private Date uhrzeit;
    private String text;
    private String empfaenger;
    private String sender;

    public Nachricht(String text, String sender, String empfaenger){
        this.text = text;
        this.sender = sender;
        this.empfaenger = empfaenger;
    }

    public Date getUhrzeit(){
        return new Date();
    }

    public String getText(){
        return this.text;
    }

    public String getEmpfaenger(){
        return this.empfaenger;
    }

    public String getSender(){
        return this.sender;
    }
}
