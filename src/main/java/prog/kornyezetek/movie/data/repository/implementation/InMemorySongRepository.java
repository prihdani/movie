package prog.kornyezetek.movie.data.repository.implementation;

import prog.kornyezetek.movie.data.repository.Repository;
import prog.kornyezetek.movie.data.model.Movie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* Is able to store in memory
* */

@org.springframework.stereotype.Repository
public class InMemorySongRepository implements Repository<Movie, Long> {

    private static final Map<Long, Movie> STORAGE = new HashMap<Long, Movie>();
    @Override
    public Movie save(Movie movie) {
        Long id = STORAGE.size()+1L;
        movie.setId(id);
        STORAGE.put(id,movie);
        return STORAGE.get(id);
    }

    @Override
    public Movie getById(Long id) {
        return STORAGE.get(id);
    }

    @Override
    public List<Movie> getAll() {
        return STORAGE.values().stream().toList();
    }

    @Override
    public Movie update(Movie movie) {
        Long id = movie.getId();
        STORAGE.put(id,movie);
        return STORAGE.get(id);
    }

    @Override
    public void deleteById(Long id) {
        STORAGE.remove(id);
    }
}
