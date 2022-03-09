package Statemaschine;

public class z3 implements State{

    private Kaffeemaschine kontext;

    public z3(Kaffeemaschine kontext) {
        this.kontext = kontext;
    }

    @Override
    public void start() {
        // geht zu z4: Brühzeit
        kontext.setCurrState(kontext.getZ4());
    }

    @Override
    public void select() {
        // geht zu z1: Kaffee
        kontext.setCurrState(kontext.getZ1());
    }

    @Override
    public void stop() {
        // geht zu z0: Standby
        kontext.setCurrState(kontext.getZ0());
    }
}
