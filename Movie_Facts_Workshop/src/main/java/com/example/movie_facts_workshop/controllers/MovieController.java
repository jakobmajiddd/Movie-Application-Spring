package com.example.movie_facts_workshop.controllers;

import com.example.movie_facts_workshop.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MovieController {

    private final MovieService movieService;


    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public String display() {
        return movieService.display();
    }

    @GetMapping("/getFirst")
    public Movie getFirstMovie() {
        return movieService.getMovie();
    }

    @GetMapping("/getRandom")
    public Movie getRandom() {
        return movieService.getRandom();
    }

    @GetMapping("/getTop10")
    public List<Movie> getTopTen() {
        return movieService.getToptenMovies();
    }


}
