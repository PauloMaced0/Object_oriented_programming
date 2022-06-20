package aula11;

public class Movie {
    protected String name;
    protected Double score;
    protected String rating;
    protected String genre;
    protected int running_time;

    Movie(String name, Double score, String rating, String genre, int running_time) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.running_time = running_time;
    }

    public Double getScore() {
        return score;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public int getRunning_time() {
        return running_time;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setRunning_time(int running_time) {
        this.running_time = running_time;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String toString() {
        return String.format("%-38s %-5s %-6s %-9s %-4s", getName(), getScore(), getRating(), getGenre(),
                getRunning_time());
    }
}
