package com.jitu.movieinfoservice.resources;

import com.jitu.movieinfoservice.models.MovieItem;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

    @RequestMapping("/{movieId}")
    public MovieItem getMovie(@PathVariable String movieId) {
        return new MovieItem(movieId, "Witcher");
    }
}
