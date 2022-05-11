// © 2022 Anna Vasileva. All rights reserved.

package com.netit.movietask;

import java.util.List;

public interface MovieAppService {

	Movie findThisYearTheMostAwaredMovie(List<Movie> movies);

	Movie findTopRatedMovie(List<Movie> movies);

	Actor findTopActor(List<Actor> actors);

	Actor findTopActress(List<Actor> actors);

}
