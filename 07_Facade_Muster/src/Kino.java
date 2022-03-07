public class Kino {
    private Projektor projektor;
    private Film movie;
    private Licht light;
    private Vorhang vorhang;

    public Kino(Film movie, Licht licht, Vorhang vorhang){
        this.projektor = new Projektor(movie);
        this.movie = movie;
        this.light = licht;
        this.vorhang = vorhang;
    }

    public void startMovie(){
        if(this.light.isLichtAn()){
            this.light.LightOff();
        }
        if(!this.vorhang.isVorhangAuf()){
            this.vorhang.VorhangAuf();
        }
        if(!this.projektor.isPlayState()){
            this.projektor.PlayMovie();
        }
    }

    public Projektor getProjektor() {
        return projektor;
    }

    public void setProjektor(Projektor projektor) {
        this.projektor = projektor;
    }

    public Film getMovie() {
        return movie;
    }

    public void setMovie(Film movie) {
        this.movie = movie;
    }

    public Licht getLight() {
        return light;
    }

    public void setLight(Licht light) {
        this.light = light;
    }

    public Vorhang getVorhang() {
        return vorhang;
    }

    public void setVorhang(Vorhang vorhang) {
        this.vorhang = vorhang;
    }
}
