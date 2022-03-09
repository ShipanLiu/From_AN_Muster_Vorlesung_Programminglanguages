package Statemaschine;

public class Kaffeemaschine {
    private State z0 = new z0(this);
    private State z1 = new z1(this);
    private State z2 = new z2(this);
    private State z3 = new z3(this);
    private State z4 = new z4(this);
    private State z5 = new z5(this);
    private State currState = this.z0;

    public Kaffeemaschine(){}

    public void start(){this.currState.start();}
    public void select(){this.currState.select();}
    public void stop(){this.currState.stop();}

    public State getCurrState(){return this.currState;}
    public void setCurrState(State state){this.currState = state;}

    public State getZ0() {
        System.out.println("STANDBY");
        return this.z0;
    }
    public State getZ1() {
        System.out.println("KAFFEE");
        return this.z1;
    }
    public State getZ2() {
        System.out.println("MILCHKAFFEE");
        return this.z2;
    }
    public State getZ3() {
        System.out.println("EINSTELLUNGEN");
        return this.z3;
    }
    public State getZ4() {
        System.out.println("BRÜHZEIT");
        return this.z4;
    }
    public State getZ5() {
        System.out.println("RÖSTSTUFE");
        return this.z5;
    }
}
