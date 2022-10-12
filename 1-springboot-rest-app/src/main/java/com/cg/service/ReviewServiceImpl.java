package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IMovieReviewDao;
import com.cg.entity.Review;

@Component
@Transactional
public class ReviewServiceImpl implements IMovieReviewService {
	@Autowired
private IMovieReviewDao movieReviewDao;
	@Override
	public Review addReviewService(String movieCode, Review review) {
		return movieReviewDao.addReview(movieCode, review);
	}

	@Override
	public List<Review> readAllReviewsService(String movieCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review updateReviewService(String movieCode, Review review) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review updateRatingsService(int reviewId, float ratings) {
		// TODO Auto-generated method stub
		return null;
	}

}