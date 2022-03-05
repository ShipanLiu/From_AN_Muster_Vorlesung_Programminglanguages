public class Strat1 implements Strategy{
    @Override
    public String say_hello() {
        return "Hello World";
    }

    // This function can't be used by the main class:
    public String say_bye(){
        return "Bye World";
    }
}
