public abstract class Beverage {

    final void prepareTemplate(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater(){
        System.out.println("Boil some Wa'er");
    }

    public abstract void brew();                    // added in the child classes

    public void pourInCup(){
        System.out.println("pour it into a cup");
    }
    public abstract void addCondiments();           // added in the child classes
}
