package com.galvanize.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.entities.Movie;
import com.galvanize.services.MovieService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.time.LocalDate;
import java.util.ArrayList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class MovieControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    MovieService movieService;
    ObjectMapper mapper = new ObjectMapper();

    @Test
    void createMovieReturnsMovie() throws Exception {
        // Setup
        Movie expectedMovie = new Movie("2", "Mickey Mouse", "2015", "2015", LocalDate.now());
        String movieJson = mapper.writeValueAsString(expectedMovie);
        expectedMovie.setMovieId(1L);
        when(movieService.save(ArgumentMatchers.any(Movie.class))).thenReturn(expectedMovie);
        mockMvc.perform(post("/api/movies").contentType(MediaType.APPLICATION_JSON).content(movieJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.movieId").exists());
    }

    @Test
    void createMovieWhenNoDescriptionExists() throws Exception {
        // Setup
        Movie noDescriptionMovie = new Movie();
        noDescriptionMovie.setMovieId();
    }
}
