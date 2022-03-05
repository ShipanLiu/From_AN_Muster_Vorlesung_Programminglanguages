import java.util.Date;
public class Abonnent implements IAbonnent{

    public String name;

    public Abonnent(String name){
        this.name = name;
    }

    // Getter and Setter Methods
    String get_name(){
        return this.name;
    }

    void set_name(String new_name){
        this.name = new_name;
    }

    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println(this.name + " hat die Zeitung "+ zeitung.getTitel() + " am " + zeitung.getDatum() + " Erhalten");
    }

}