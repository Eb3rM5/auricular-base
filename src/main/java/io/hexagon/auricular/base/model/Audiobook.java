package io.hexagon.auricular.base.model;

import java.util.List;

public interface Audiobook {
	
	Integer id();

	String title();
	
	String description();
	
	Integer totalEpisodes();
	
	Integer year();
	
	List<? extends Genre> genres();
	
	List<? extends Author> authors();
	
	String coverUrl();
	
}
