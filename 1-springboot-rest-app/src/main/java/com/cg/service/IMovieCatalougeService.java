package com.cg.service;

import java.util.List;

import com.cg.entity.Movie;

public interface IMovieCatalougeService {
	List<Movie> getAllMovieService();
	Movie addMovieService(Movie m);
	Movie updateMovieService(Movie m, String movieCode);
	Movie deleteMovieService(String movieCode);
}
