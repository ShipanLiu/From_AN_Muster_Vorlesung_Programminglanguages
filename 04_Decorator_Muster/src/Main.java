public class Main {
    public static void main(String[] args) {

        Getraenk coffee = new Espresso();
        coffee = new Milch(coffee);
        coffee = new Milch(coffee);
        System.out.println(coffee.getBeschreibung() + ": " +  coffee.getPreis() + " Euro");
    }
}
