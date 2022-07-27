package classes;

public class MovieLocal {

    int id;
    String movieName;

    boolean isCached;

    public MovieLocal(int id, String movieName, boolean isCached) {
        this.id = id;
        this.movieName = movieName;
        this.isCached = isCached;
    }

    public MovieLocal(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public boolean isCached() {
        return isCached;
    }

    public void setCached(boolean cached) {
        isCached = cached;
    }

    @Override
    public String toString() {
        return movieName;
    }
}
