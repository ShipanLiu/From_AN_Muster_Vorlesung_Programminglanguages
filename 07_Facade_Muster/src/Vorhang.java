public class Vorhang {
    private boolean VorhangState = false;

    public Vorhang(boolean vorhangAuf) {
        this.VorhangState = vorhangAuf;
    }

    public void VorhangAuf(){
        this.VorhangState = true;
        System.out.println("Vorhang Auf");
    }
    public void VorhangZu(){
        this.VorhangState = false;
        System.out.println("Vorhang Zu");
    }

    public boolean isVorhangAuf() {
        return this.VorhangState;
    }
    public void setVorhangAuf(boolean vorhangAuf) {
        this.VorhangState = vorhangAuf;
    }
}
