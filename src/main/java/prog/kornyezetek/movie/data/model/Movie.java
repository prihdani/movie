package prog.kornyezetek.movie.data.model;

import java.util.Objects;
import java.util.StringJoiner;

/*
* Model Class for movies
* */
public class Movie {

    private Long id;
    private String title;
    private String director;
    private int releaseDate;
    private int ageRestriction;
    private Genre genre;

    public Movie(){

    }

    public Movie(Long id, String title, String director, int releaseDate, int ageRestriction, Genre genre) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.ageRestriction = ageRestriction;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return getReleaseDate() == movie.getReleaseDate() && getAgeRestriction() == movie.getAgeRestriction() && Objects.equals(getId(), movie.getId()) && Objects.equals(getTitle(), movie.getTitle()) && Objects.equals(getDirector(), movie.getDirector()) && getGenre() == movie.getGenre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getDirector(), getReleaseDate(), getAgeRestriction(), getGenre());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Movie.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("title='" + title + "'")
                .add("director='" + director + "'")
                .add("releaseDate=" + releaseDate)
                .add("ageRestriction=" + ageRestriction)
                .add("genre=" + genre)
                .toString();
    }
}
