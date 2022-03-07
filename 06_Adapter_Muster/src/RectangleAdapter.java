public class RectangleAdapter extends Rectangle{

    public RectangleAdapter(Rechteck R){
        super(R.getX(), R.getY(), R.getX() + R.getW(), R.getY() +R.getH());
    }

}
