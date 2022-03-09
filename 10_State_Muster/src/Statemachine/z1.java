package Statemachine;

public class z1 implements State {
    Maschine kontext;

    public z1(Maschine kontext){
        this.kontext = kontext;
    }
    // Alle Methoden aber Zustand 1 (Hat Geld) kann nur
    // die Methode GeldRaus benutzen und in Zustand 0 rein
    // oder KurbelDrehen und in Zustand 2 rein.
    @Override
    public void GeldRein() {
        System.out.println("Es liegt bereits schon Geld drin.");
    }

    @Override
    public void GeldRaus() {
        // Zurück in Zustand 0
        System.out.println("Geld erfolgreich wieder rausgenommen");
        kontext.setState(kontext.getZ0());
    }

    @Override
    public void KurbelDrehen() {
        // Weiter in Zustand 2
        System.out.println("Kurbel wurde erfolgreich gedreht");
        kontext.Kaugummiraus();
        kontext.setState(kontext.getZ2());
    }

    @Override
    public void KaugummiChecken() {
        System.out.println("Du muss noch drehen");
    }
}
