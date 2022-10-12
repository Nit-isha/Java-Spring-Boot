package com.cg.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.dao.IMovieCatalougeDao;
import com.cg.entity.Movie;

@Component
public class MovieCatalougeServiceImpl implements IMovieCatalougeService{
	
	@Autowired
	private IMovieCatalougeDao movieCatalougeDao;
	
	public List<Movie> getAllMovieService() {
		return movieCatalougeDao.getAllMovies();
	}
	
	@Override
	@Transactional
	public Movie addMovieService(Movie m) {
		return movieCatalougeDao.addMovie(m);
	}
	
	@Override
	public Movie updateMovieService(Movie m, String movieCode) {
		return null;
	}
	
	@Override
	public Movie deleteMovieService(String movieCode) {
		return null;
	}

}