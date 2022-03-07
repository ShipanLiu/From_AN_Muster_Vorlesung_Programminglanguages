public class Main {
    public static void main(String[] args) {
        Rechteck R = new Rechteck(10, 10, 20, 20);
        System.out.println(R.toString());

        // After adapter into Rectangle
        Rectangle r = new RectangleAdapter(R);
        System.out.println(r.toString());
    }
}
