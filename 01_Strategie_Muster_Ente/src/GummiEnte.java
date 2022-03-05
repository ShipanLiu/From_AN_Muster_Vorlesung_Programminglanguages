public class GummiEnte extends Ente{

    public GummiEnte(){
        super.flugverhalten = new KannNichtFliegen();
        super.quakverhalten = new Quak();
    }

    @Override
    public void anzeigen() {
        System.out.println("Ich bin eine Gummiente");
    }
}
