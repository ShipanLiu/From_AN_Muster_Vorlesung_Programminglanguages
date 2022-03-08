public class Strat2 implements Strategy{
    String name;
    public Strat2(String name){
        this.name = name;
    }
    @Override
    public String say_hello() {
        return "hi, I am " + this.name;
    }
}
