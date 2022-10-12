package com.cg.controller;
import com.cg.entity.Movie;
import com.cg.entity.Movies;
import com.cg.exception.MovieNotFoundException;
import com.cg.service.IMovieCatalougeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies")
public class MovieCatalouge {
	
	@Autowired
	private IMovieCatalougeService movieCatalougeService;
	public void setMovieCatalogueService(IMovieCatalougeService movieCatalogueService) {
		this.movieCatalougeService = movieCatalogueService;
	}
	
	@RequestMapping(value = "/test",produces = "application/json")
	public Movie test() {
		System.out.println("working ......");
		return new Movie("Movie1234", "Test Movie", "Eng", "Action");
	}
	
	@GetMapping
	public ResponseEntity<Movies> movieList(){
		return null;
	}
	
	@RequestMapping(value = "/{mCode}",produces = {"application/json"})
	public  ResponseEntity<Movie> findMovieById( @PathVariable("mCode")  String movieCode) {
		return null;
	}
	
	@PostMapping(consumes =  {"application/json"},produces = {"application/json"})
	public ResponseEntity<Movie> addNewMovie(@RequestBody  Movie movie) {
		
		Movie m = movieCatalougeService.addMovieService(movie);
		return new ResponseEntity<Movie>(m, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{mCode}", produces = {"application/json"})
	public ResponseEntity<Movies> deleteMovie(@PathVariable("mCode")  String movieCode) {
		return null;
	}
	
	@PutMapping(value = "/{mCode}", produces = {"application/json"},consumes =  {"application/json"})
	public Movies updateMovie(@PathVariable("mCode")  String movieCode, @RequestBody Movie movie) {
		return null;
	}
	
}
