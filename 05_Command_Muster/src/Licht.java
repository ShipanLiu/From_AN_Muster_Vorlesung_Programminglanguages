public class Licht {
    public boolean licht = false;
    public Licht(){}

    public void on(){
        this.licht = true;
        System.out.println("Licht An");
    }

    public void off(){
        this.licht = false;
        System.out.println("Licht Aus");
    }
}
