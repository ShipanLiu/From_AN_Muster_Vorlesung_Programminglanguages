import Statemachine.*;
public class Main {
    public static void main(String[] args) {
        // Es gibt eine Kaugummimaschine mit 2 Kaugummi
        Maschine Kaugummimaschine = new Maschine(2);

        // count: 2
        Kaugummimaschine.GeldRein();
        Kaugummimaschine.GeldRaus();
        Kaugummimaschine.GeldRein();
        Kaugummimaschine.KurbelDrehen();

        // count: 1
        Kaugummimaschine.CheckKaugummi();
        Kaugummimaschine.GeldRein();
        Kaugummimaschine.KurbelDrehen();

        // count: 0
        Kaugummimaschine.CheckKaugummi();
        Kaugummimaschine.GeldRein();
    }
}
