package Statemaschine;

public class z0 implements State{

    private Kaffeemaschine kontext;

    public z0(Kaffeemaschine kontext) {
        this.kontext = kontext;
    }

    @Override
    public void start() {
        // geht in z1: Kaffee
    }

    @Override
    public void select() {

    }

    @Override
    public void stop() {

    }
}
