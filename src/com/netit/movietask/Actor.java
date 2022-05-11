// © 2022 Anna Vasileva. All rights reserved.

package com.netit.movietask;

import java.util.List;

public class Actor {

	private String name;
	private GenderEnum gender;
	private List<Movie> movies;
	private List<AwardEnum> awards;

	public Actor(String name, GenderEnum gender, List<Movie> movies, List<AwardEnum> awards) {
		this.name = name;
		this.gender = gender;
		this.movies = movies;
		this.awards = awards;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GenderEnum getGender() {
		return gender;
	}

	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public List<AwardEnum> getAwards() {
		return awards;
	}

	public void setAwards(List<AwardEnum> awards) {
		this.awards = awards;
	}

}
