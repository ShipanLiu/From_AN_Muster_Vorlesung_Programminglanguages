public class Licht {
    private boolean LichtAn = false;
    public Licht(boolean lichtan){
        this.LichtAn = lichtan;
    }

    public void LightOn(){
        this.LichtAn = true;
        System.out.println("Lights On");
    }
    public void LightOff(){
        this.LichtAn = false;
        System.out.println("Lights Off");
    }

    public boolean isLichtAn() {
        return this.LichtAn;
    }
    public void setLichtAn(boolean lichtAn) {
        this.LichtAn = lichtAn;
    }
}
