public class Main {

    public static void main(String[] args) {

        GummiEnte Donald = new GummiEnte();         // Init GummiEnte
        Donald.anzeigen();                          // Anzeige wurde überschrieben
        Donald.tuFliegen();                         // Fliegen ist default "KannNichtFliegen"
        Donald.tuQuaken();                          // Quaken ist default "Quack"
        Donald.setFlugverhalten(new KannFliegen());         // ändere das Flugverhalten
        Donald.tuFliegen();                         // Durch Interface kann es jetzt Fliegen
    }
}
