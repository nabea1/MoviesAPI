package com.galvanize.services;

import com.galvanize.entities.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    public Movie save(Movie movie) {
        return movie;
    }
}
