package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.cg.entity.Movie;
import com.cg.entity.Review;

@Component
public class MovieReviewDaoImpl implements IMovieReviewDao {
	@PersistenceContext
	private EntityManager em;
	@Override
	public Review addReview(String movieCode, Review review) {
		Movie movie=em.find(Movie.class, movieCode);
		if(movie!=null) {
			review.setMovie(movie);
			em.persist(review); //managed state 
			return review;
		}
		return null;
	}

	@Override
	public List<Review> readAllReviews(String movieCode) {
		return null;
	}

	@Override
	public Review updateReview(String movieCode, Review review) {
		return null;
	}

	@Override
	public Review updateRatings(int reviewId, float ratings) {
		// TODO Auto-generated method stub
		return null;
	}
}