public class Kaffee extends Beverage{

    @Override
    public void brew(){
        System.out.println("Dripping Coffee through the filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add Sugar and Milk");
    }
}
