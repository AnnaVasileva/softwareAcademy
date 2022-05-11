// © 2022 Anna Vasileva. All rights reserved.

package com.netit.movietask;

import java.util.List;

public class Movie {

	private String name;
	private int year;
	private List<AwardEnum> awards;
	private double rating;

	public Movie(String name, int year, List<AwardEnum> awards, double rating) {
		this.name = name;
		this.year = year;
		this.awards = awards;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<AwardEnum> getAwards() {
		return awards;
	}

	public void setAwards(List<AwardEnum> awards) {
		this.awards = awards;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
