package prog.kornyezetek.movie.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import prog.kornyezetek.movie.data.model.Movie;
import prog.kornyezetek.movie.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("api/v1/movie")
public class MovieRestController {

    private final MovieService movieService;
    @Autowired
    public MovieRestController(MovieService movieService) {
        this.movieService = movieService;
    }

    // CRUD

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id){
        return movieService.retrieveByMovieId(id);
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie){
        return movieService.createMovie(movie);
    }

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.retrieveAllMovie();
    }

    @PutMapping //meglevo eroforrast modositunk ezzel
    public Movie updateMovie(@RequestBody Movie movie){
        return movieService.update(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovieById(@PathVariable Long id){
        movieService.deleteMovieById(id);
    }

}
