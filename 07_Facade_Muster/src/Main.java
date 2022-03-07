public class Main {
    public static void main(String[] args) {
        Film movie = new Film("Objekt Orientierte Modellierung (Starring Jonny Sins)");
        Vorhang vorhang = new Vorhang(false);
        Licht light = new Licht(true);

        Kino Heimkino = new Kino(movie, light, vorhang);
        Heimkino.startMovie();

    }
}
