import Statemaschine.Kaffeemaschine;

public class Main {
    public static void main(String[] args) {
        Kaffeemaschine machine = new Kaffeemaschine();
        machine.start();
        machine.select();
        machine.select();
        machine.start();
        machine.start();
        machine.select();
        machine.stop();
        machine.select();
        machine.start();
        machine.stop();
    }
}
