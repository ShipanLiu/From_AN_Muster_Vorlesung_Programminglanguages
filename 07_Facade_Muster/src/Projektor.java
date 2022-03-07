public class Projektor {
    private boolean PlayState = false;
    private Film movie;

    public Projektor(Film movie){
        this.movie = movie;
    }

    public void PlayMovie(){
        this.PlayState = true;
        System.out.println("Play the Movie: " + this.movie.getFilmName());
    }
    public void StopMovie(){
        this.PlayState = false;
        System.out.println("Stop the Movie: " + this.movie.getFilmName());
    }
    public boolean isPlayState() {
        return this.PlayState;
    }
    public void setPlayState(boolean playState) {
        this.PlayState = playState;
    }

    public Film getMovie() {
        return this.movie;
    }
    public void setMovie(Film movie) {
        this.movie = movie;
    }
}
