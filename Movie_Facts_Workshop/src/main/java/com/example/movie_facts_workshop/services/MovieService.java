package com.example.movie_facts_workshop.services;

import com.example.movie_facts_workshop.controllers.Movie;
import com.example.movie_facts_workshop.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public String display() {
        return "Velkommen til min applikation";
    }

    public Movie getMovie() {
        return movieRepository.getFirst();
    }

    public Movie getRandom() {
        return movieRepository.getRandom();

    }

    public List<Movie> getToptenMovies() {
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            movies.add(movieRepository.getRandom());
        }
        Collections.sort(movies);
        return movies;
    }
}
