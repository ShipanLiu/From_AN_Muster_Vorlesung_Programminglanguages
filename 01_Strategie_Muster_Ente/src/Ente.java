public class Ente {
    protected FlugVerhalten flugverhalten;
    protected QuakVerhalten quakverhalten;

    public void schwimmen(){
        System.out.println("Schwimmennnnn");
    }

    // abstrakt
    public void anzeigen(){
        System.out.println("Ist eine Ente");
    }

    public void tuQuaken(){
        quakverhalten.Quak();
    }

    public void tuFliegen(){
        flugverhalten.fliegen();
    }

    public void setQuakverhalten(QuakVerhalten newQuak){
        this.quakverhalten = newQuak;
    }

    public void setFlugverhalten(FlugVerhalten newFlug){
        this.flugverhalten = newFlug;
    }
}
