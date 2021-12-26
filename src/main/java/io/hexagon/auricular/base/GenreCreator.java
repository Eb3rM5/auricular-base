package io.hexagon.auricular.base;

import java.util.List;

import io.hexagon.auricular.base.model.Genre;

public interface GenreCreator<G extends Genre> {

	List<G> getAvailableGenres(int page);
	
}
