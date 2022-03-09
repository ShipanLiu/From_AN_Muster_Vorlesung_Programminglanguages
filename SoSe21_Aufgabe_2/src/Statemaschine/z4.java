package Statemaschine;

public class z4 implements State{

    private Kaffeemaschine kontext;

    public z4(Kaffeemaschine kontext) {
        this.kontext = kontext;
    }

    @Override
    public void start() {
        // geht zu z4: Brühzeit
        kontext.setCurrState(kontext.getZ4());
    }

    @Override
    public void select() {
        // geht zu z5: Röststufe
        kontext.setCurrState(kontext.getZ5());
    }

    @Override
    public void stop() {
        // geht zu z3: Einstellung
        kontext.setCurrState(kontext.getZ3());
    }
}
