// © 2022 Anna Vasileva. All rights reserved.

package com.netit.movietask;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		MovieApp movieApp = createMovieApp();
		MovieAppService service = new MovieAppServiceImpl();

		List<Movie> movies = movieApp.getMovies();
		Movie mostAwaredMovie = service.findThisYearTheMostAwaredMovie(movies);
		System.out.println("Most awared movie is: " + mostAwaredMovie.getName() + " with total of "
				+ mostAwaredMovie.getAwards().size());

		Movie topdMovie = service.findTopRatedMovie(movies);
		System.out.println(
				"The movie with highest rating is: " + topdMovie.getName() + " with rating " + topdMovie.getRating());

		Actor topActor = service.findTopActor(movieApp.getActors());
		List<Movie> topActorMovies = topActor.getMovies();
		System.out.println("The top actor is " + topActor.getName() + " and his/her movies are: ");
		topActorMovies.stream().forEach(movie -> System.out.println(movie.getName()));

		Actor topActress = service.findTopActress(movieApp.getActors());
		List<AwardEnum> actressAwards = topActress.getAwards();
		System.out.println("The most awarded actress is: " + topActress.getName() + " with awards: ");
		actressAwards.stream().forEach(award -> System.out.println(award.label));

	}

	private static MovieApp createMovieApp() {

		List<AwardEnum> awardsList1 = Arrays.asList(AwardEnum.OSCAR);
		List<AwardEnum> awardsList2 = Arrays.asList(AwardEnum.GOLDEN_GLOBE);
		List<AwardEnum> awardsList3 = Arrays.asList(AwardEnum.GOLDEN_LION);
		List<AwardEnum> awardsList4 = Arrays.asList(AwardEnum.OSCAR, AwardEnum.GOLDEN_GLOBE);
		List<AwardEnum> awardsList5 = Arrays.asList(AwardEnum.OSCAR, AwardEnum.GOLDEN_GLOBE, AwardEnum.GOLDEN_LION);

		Movie m1 = new Movie("Movie1", 1998, awardsList1, 7.5);
		Movie m2 = new Movie("Movie2", 2001, awardsList2, 8.5);
		Movie m3 = new Movie("Movie3", 2022, awardsList3, 6.5);
		Movie m4 = new Movie("Movie4", 2022, awardsList4, 9);
		Movie m5 = new Movie("Movie5", 2022, awardsList5, 10);

		Actor a1 = new Actor("Actor1", GenderEnum.FEMALE, Arrays.asList(m1), awardsList4);
		Actor a2 = new Actor("Actor2", GenderEnum.MALE, Arrays.asList(m1, m2), awardsList4);
		Actor a3 = new Actor("Actor3", GenderEnum.FEMALE, Arrays.asList(m2, m3), awardsList3);
		Actor a4 = new Actor("Actor4", GenderEnum.MALE, Arrays.asList(m1, m3), awardsList5);

		return new MovieApp(Arrays.asList(m1, m2, m3, m4, m5), Arrays.asList(a1, a2, a3, a4));
	}

}
