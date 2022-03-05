import java.util.Date;
public class Zeitung {
    private Date datum;
    private String titel;

    public Zeitung(Date datum, String titel){
        this.datum = datum;
        this.titel = titel;
    }

    // Getter Methods
    Date getDatum(){
        return this.datum;
    }

    String getTitel(){
        return this.titel;
    }

    // Setter Methods
    void set_datum(Date new_date){
        this.datum = new_date;
    }

    void setTitel(String new_titel){
        this.titel = new_titel;
    }


}
