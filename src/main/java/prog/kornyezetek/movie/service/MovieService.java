package prog.kornyezetek.movie.service;

import prog.kornyezetek.movie.data.model.Movie;

import java.util.List;

public interface MovieService {

    /*
    * TODO.
    *
    * */
    Movie createMovie(Movie movie); //create

    Movie retrieveByMovieId(Long id); //read
    List<Movie> retrieveAllMovie(); // read

    Movie update(Movie movie); // update

    void deleteMovieById(Long id); // delete
}
