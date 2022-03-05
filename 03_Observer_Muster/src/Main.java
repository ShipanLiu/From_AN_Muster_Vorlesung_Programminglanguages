import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ZeitungVerlag elsevier = new ZeitungVerlag();
        IAbonnent infBI = new Abonnent("Lehrstuhl fuer Informatik im Bauwesen");
        IAbonnent max = new Abonnent("Max Mustermann");
        elsevier.registriereBeobachter(infBI);
        elsevier.registriereBeobachter(max);
        elsevier.verteileZeitung("Java Design Patterns");
        
    }
}
