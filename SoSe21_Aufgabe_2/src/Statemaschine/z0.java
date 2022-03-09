package Statemaschine;

public class z0 implements State{

    private Kaffeemaschine kontext;

    public z0(Kaffeemaschine kontext) {
        this.kontext = kontext;
    }

    @Override
    public void start() {
        // geht in z1: Kaffee
        kontext.setCurrState(kontext.getZ1());
    }

    @Override
    public void select() {
        System.out.println("Still in Standby");
    }

    @Override
    public void stop() {
        System.out.println("Still in Standby");
    }
}
