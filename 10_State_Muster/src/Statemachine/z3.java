package Statemachine;

public class z3 implements State {

    Maschine kontext;

    public z3(Maschine kontext){
        this.kontext = kontext;
    }
    // Alle möglichen Methoden, aber Zustand 3 kann in keinen weiteren rein
    @Override
    public void GeldRein() {
        System.out.println("Bitte nachfüllen");
    }

    @Override
    public void GeldRaus() {
        System.out.println("Bitte nachfüllen");
    }

    @Override
    public void KurbelDrehen() {
        System.out.println("Bitte nachfüllen");
    }

    @Override
    public void KaugummiChecken() {
        System.out.println("Bitte nachfüllen");
    }
}
