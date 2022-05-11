// © 2022 Anna Vasileva. All rights reserved.

package com.netit.movietask;

import java.util.List;

public class MovieApp {

	private List<Movie> movies;
	private List<Actor> actors;

	public MovieApp(List<Movie> movies, List<Actor> actors) {
		this.movies = movies;
		this.actors = actors;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

}
