package Statemaschine;

public class z1 implements State{

    private Kaffeemaschine kontext;

    public z1(Kaffeemaschine kontext) {
        this.kontext = kontext;
    }

    @Override
    public void start() {
        // geht in z1: Kaffee
    }

    @Override
    public void select() {
        // geht in z2: Milchkaffee
    }

    @Override
    public void stop() {
        // geht in z0:
    }
}
