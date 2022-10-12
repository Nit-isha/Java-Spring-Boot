package com.cg.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Review {
	@Id
	private int revId;
	private String reviewerName;
	private String content;
	private float ratings;
	
	@ManyToOne
	@JoinColumn(name = "MOVIE_CODE")
	@JsonBackReference
	private Movie movie;
	public Review() {
		
	}
	
	public Review(int revId, String reviewerName, String content, float ratings) {
		super();
		this.revId = revId;
		this.reviewerName = reviewerName;
		this.content = content;
		this.ratings = ratings;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public int getRevId() {
		return revId;
	}
	
	public void setRevId(int revId) {
		this.revId = revId;
	}
	
	public String getReviewerName() {
		return reviewerName;
	}
	
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public float getRatings() {
		return ratings;
	}
	
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

}