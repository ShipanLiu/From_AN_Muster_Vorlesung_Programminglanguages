public class KannNichtFliegen implements FlugVerhalten{

    @Override
    public void fliegen() {
        System.out.println("Ist zu dumm zu Fliegen... ");
        System.out.println("Happy Feet");
    }
}
