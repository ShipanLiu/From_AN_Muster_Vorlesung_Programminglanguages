public class Espresso extends Getraenk{
    public Espresso(){
        super.preis = 1.5;
        super.beschreibung = "Espresso";
    }

    public String getBeschreibung(){
        return this.beschreibung;
    }

    public double getPreis(){
        return this.preis;
    }
}
