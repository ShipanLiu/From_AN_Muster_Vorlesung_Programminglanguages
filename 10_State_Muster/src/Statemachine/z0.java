package Statemachine;
public class z0 implements State {
    Maschine kontext;

    public z0(Maschine kontext){
        this.kontext = kontext;
    }

    // Alle Methoden aber Zustand 0 (Kein Geld) kann nur
    // die Methode GeldRein benutzen und in Zustand 1 rein.
    @Override
    public void GeldRein() {
        // Weiter in Zustand 1
        System.out.println("Geld wurde erfolgreich reingesteckt");
        kontext.setState(kontext.getZ1());
    }

    @Override
    public void GeldRaus() {
        System.out.println("Du kannst kein Geld raus nehmen, wenn noch nichts drin ist.");
    }

    @Override
    public void KurbelDrehen() {
        System.out.println("Noch kein Geld drin. Kurbeln lohnt sich nicht");
    }

    @Override
    public void KaugummiChecken() {
        System.out.println("Noch kein Kaugummi raus, weil du kein Geld hast");
    }
}
