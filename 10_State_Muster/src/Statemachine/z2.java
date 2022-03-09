package Statemachine;

public class z2 implements State {
    Maschine kontext;

    public z2(Maschine kontext){
        this.kontext = kontext;
    }
    // Alle Methoden aber Zustand 2 (Kaugummi Raus) kann nur
    // die Methode KaugummiChecken benutzen und in Zustand 0 oder 3 rein.
    @Override
    public void GeldRein() {
        System.out.println("Checke erstmal aus ob noch ein Kaugummi drin ist");
    }

    @Override
    public void GeldRaus() {
        System.out.println("Checke erstmal aus ob noch ein Kaugummi drin ist");
    }

    @Override
    public void KurbelDrehen() {
        System.out.println("Checke erstmal aus ob noch ein Kaugummi drin ist");
    }

    @Override
    public void KaugummiChecken() {
        // Kreutzung (Entscheidung) in 0 oder 3
        if(kontext.getKaugummis() > 0 ){
            System.out.println("Es gibt noch" + kontext.getKaugummis() + " Kaugummis.");
            kontext.setState(kontext.getZ0());
        }else{
            System.out.println("Keine Kaugummis vorhanden");
            kontext.setState(kontext.getZ3());
        }

    }
}
