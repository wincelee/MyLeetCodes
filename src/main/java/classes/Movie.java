package classes;

public class Movie {

    int id;
    String movieName;

    public Movie(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
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

    @Override
    public String toString() {
        return movieName;
    }
}
