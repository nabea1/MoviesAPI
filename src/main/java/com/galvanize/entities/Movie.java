package com.galvanize.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long movieId;
    String  imdbId;
//    List<Actor> actors;
    String director;
    String title;
    String year;
//    LocalDate released;

    public Movie() {
    }

    public Movie(Long movieId, String imdbId, String director, String title, String year, LocalDate released) {
        this.movieId = movieId;
        this.imdbId = imdbId;
        this.director = director;
        this.title = title;
        this.year = year;
//        this.released = released;
    }

    public Movie(String imdbId, String director, String title, String year, LocalDate released) {
        this.imdbId = imdbId;
        this.director = director;
        this.title = title;
        this.year = year;
//        this.released = released;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

//    public LocalDate getReleased() {
//        return released;
//    }
//
//    public void setReleased(LocalDate released) {
//        this.released = released;
//    }
}
