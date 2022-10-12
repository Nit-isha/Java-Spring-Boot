package com.cg.service;

import java.util.List;

import com.cg.entity.Review;

public interface IMovieReviewService {
	Review addReviewService(String movieCode,Review review);
	List<Review> readAllReviewsService(String movieCode);
	Review updateReviewService(String movieCode,Review review );
	Review updateRatingsService(int reviewId,float ratings);
}