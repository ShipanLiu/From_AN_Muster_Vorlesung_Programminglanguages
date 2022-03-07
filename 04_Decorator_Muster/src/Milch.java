public class Milch extends ZutatDekorierer{

    public Milch(Getraenk getraenk){
        super.getraenk = getraenk;
    }

    public String getBeschreibung() {
        return super.getraenk.getBeschreibung() + " Milch";
    }

    public double getPreis() {
        return super.getraenk.getPreis() + 0.1;
    }
}
