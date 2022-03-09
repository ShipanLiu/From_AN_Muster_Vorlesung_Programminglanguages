package Statemaschine;

public class z2 implements State{

    private Kaffeemaschine kontext;

    public z2(Kaffeemaschine kontext) {
        this.kontext = kontext;
    }

    @Override
    public void start() {
        // geht in zustand z2: Milchkaffee
        kontext.setCurrState(kontext.getZ2());
    }

    @Override
    public void select() {
        // geht in zustand z3: Einstellung
        kontext.setCurrState(kontext.getZ3());
    }

    @Override
    public void stop() {
        // geht in zustand z0: Standby
        kontext.setCurrState(kontext.getZ0());
    }
}
