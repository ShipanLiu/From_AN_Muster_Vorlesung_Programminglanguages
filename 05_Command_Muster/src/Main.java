public class Main {
    public static void main(String[] args) {
        Licht l1 = new Licht();

        // Sequenz 1: Licht in die Fernbedienung programmieren
        Command lightcommand = new LichtCommand(l1);

        // Sequenz 2: Licht execute()
        lightcommand.execute();
        lightcommand.execute();
    }
}
