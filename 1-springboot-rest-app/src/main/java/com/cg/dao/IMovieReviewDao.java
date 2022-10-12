package com.cg.dao;

import java.util.List;

import com.cg.entity.*;

public interface IMovieReviewDao {
	Review addReview(String movieCode,Review review);
	List<Review> readAllReviews(String movieCode);
	Review updateReview(String movieCode,Review review );
	Review updateRatings(int reviewId,float ratings);
}
