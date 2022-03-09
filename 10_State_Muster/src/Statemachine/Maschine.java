package Statemachine;

public class Maschine {
    // Die Statemachine.Maschine muss alle States als Variable Speichern und den Momentanen State
    private int Kaugummis;
    private State z0;
    private State z1;
    private State z2;
    private State z3;
    private State currState;

    public Maschine(int Kaugummi){
        this.Kaugummis = Kaugummi;
        this.z0 = new z0(this);
        this.z1 = new z1(this);
        this.z2 = new z2(this);
        this.z3 = new z3(this);
        this.currState = this.z0;
    }

    // State funktionen
    public void GeldRein(){
        System.out.println("Geld wird reingelegt...");
        this.currState.GeldRein();
    }
    public void GeldRaus(){
        System.out.println("Geld wird entnommen...");
        this.currState.GeldRaus();
    }
    public void KurbelDrehen(){
        System.out.println("Kurbel wird gedreht...");
        this.currState.KurbelDrehen();
    }
    public void CheckKaugummi(){
        System.out.println("nach Kaugummis checken...");
        this.currState.KaugummiChecken();
    }

    // Set State
    public void setState(State state){this.currState = state;}
    public void Kaugummiraus(){ this.Kaugummis -= 1;}
    // Getter
    public int getKaugummis() {
        return Kaugummis;
    }
    public State getZ0() {
        return z0;
    }
    public State getZ1() {
        return z1;
    }
    public State getZ2() {
        return z2;
    }
    public State getZ3() {
        return z3;
    }
    public State getState() {
        return currState;
    }
}
