package com.cg.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import com.cg.entity.Movie;


@Component
public class MovieCatalougeImpl implements IMovieCatalougeDao{
	@PersistenceContext
	private EntityManager em;
	public List<Movie> getAllMovies() {
		return null;
	}

	@Override
	public Movie addMovie(Movie m) {
		System.out.println("Added");
		em.persist(m);
		return m;
	}

	@Override
	public Movie updateMovie(Movie m, String movieCode) {
		return null;
	}

	@Override
	public Movie deleteMovie(String movieCode) {
		return null;
	}
}