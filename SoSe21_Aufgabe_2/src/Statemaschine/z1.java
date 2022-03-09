package Statemaschine;

public class z1 implements State{

    private Kaffeemaschine kontext;

    public z1(Kaffeemaschine kontext) {
        this.kontext = kontext;
    }

    @Override
    public void start() {
        // geht in z1: Kaffee
        kontext.setCurrState(kontext.getZ1());
    }

    @Override
    public void select() {
        // geht in z2: Milchkaffee
        kontext.setCurrState(kontext.getZ2());
    }

    @Override
    public void stop() {
        // geht in z0:
        kontext.setCurrState(kontext.getZ0());
    }
}
