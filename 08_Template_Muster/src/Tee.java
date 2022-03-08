public class Tee extends Beverage{

    @Override
    public void brew(){
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add some Lemon");
    }
}
