// © 2022 Anna Vasileva. All rights reserved.

package com.netit.movietask;

import java.util.Calendar;
import java.util.List;

public class MovieAppServiceImpl implements MovieAppService {

	@Override
	public Movie findThisYearTheMostAwaredMovie(List<Movie> movies) {

		int maxAwardsNumber = 0;
		Movie result = movies.get(0);
		for (Movie movie : movies) {
			int currentAwardsNumber = movie.getAwards().size();
			int year = Calendar.getInstance().get(Calendar.YEAR);
			if (movie.getYear() == year && maxAwardsNumber < currentAwardsNumber) {
				maxAwardsNumber = currentAwardsNumber;
				result = movie;
			}
		}
		return result;
	}

	@Override
	public Movie findTopRatedMovie(List<Movie> movies) {

		double maxRating = 0.0;
		Movie result = movies.get(0);
		for (Movie movie : movies) {
			double currentMaxRating = movie.getRating();
			if (maxRating < currentMaxRating) {
				maxRating = currentMaxRating;
				result = movie;
			}
		}
		return result;
	}

	@Override
	public Actor findTopActor(List<Actor> actors) {

		int maxAwardsNumber = 0;
		Actor result = actors.get(0);
		for (Actor actor : actors) {
			int currentAwardsNumber = actor.getAwards().size();
			if (maxAwardsNumber < currentAwardsNumber) {
				maxAwardsNumber = currentAwardsNumber;
				result = actor;
			}
		}
		return result;
	}

	@Override
	public Actor findTopActress(List<Actor> actors) {

		int maxAwardsNumber = 0;
		Actor result = actors.get(0);
		for (Actor actor : actors) {
			if (actor.getGender().equals(GenderEnum.FEMALE) && maxAwardsNumber < actor.getAwards().size()) {
				maxAwardsNumber = actor.getAwards().size();
				result = actor;
			}

// Do the same thing as the above code
//			if (actor.getGender().equals(GenderEnum.FEMALE)) {
//				int currentAwardsNumber = actor.getAwards().size();
//				if (maxAwardsNumber < currentAwardsNumber) {
//					maxAwardsNumber = currentAwardsNumber;
//					result = actor;
//				}
//			}

		}
		return result;

	}

}
