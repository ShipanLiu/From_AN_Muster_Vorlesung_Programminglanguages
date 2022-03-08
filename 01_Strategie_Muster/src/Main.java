public class Main
{
    public static void main(String[] args){
        // Use Strategy as type, since Strat1 implements Strategy
        Strategy strat = new Strat1();
        System.out.println(strat.say_hello());      // use the say_hello() from Strat1()

        // override strat with Strat2()
        strat = new Strat2("Max");
        System.out.println(strat.say_hello());      // use say_hello() from Strat2()
    }
}
