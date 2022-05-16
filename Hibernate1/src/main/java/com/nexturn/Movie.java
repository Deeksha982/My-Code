package com.nexturn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Movie 
{
  @Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", language=" + language + ", releasedln="
				+ releasedIn+", revInDollars=" + revenueInDollars + "]";
	}
@Id
  @Column(name = "movieId", length = 100)

	 
	private String movieId;
	private String movieName;
	private String language;
	private int releasedIn;
	private int revenueInDollars;
	
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
		}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getReleasedIn() {
		return releasedIn;
	}
	public void setReleasedIn(int releasedIn) {
		this.releasedIn = releasedIn;
	}
	public int getRevenueInDollars() {
		return revenueInDollars;
	}
	public void setRevenueInDollars(int revenueInDollars) {
		this.revenueInDollars = revenueInDollars;
	}
	public Movie() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String movieId, String movieName, String language, int releasedln, int revenuelnDollars) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.releasedIn = releasedIn;
		this.revenueInDollars = revenueInDollars;
	}
}

		
	
	

