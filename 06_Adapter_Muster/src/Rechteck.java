public class Rechteck {
    private int x;
    private int y;
    private int w;
    private int h;

    public Rechteck(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void beschreibung(){
        System.out.println("Ich bin ein Recheck welches folgendes gegeben hat:");
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setW(int w) {
        this.w = w;
    }
    public void setH(int h) {
        this.h = h;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getW() {
        return w;
    }
    public int getH() {
        return h;
    }
}
