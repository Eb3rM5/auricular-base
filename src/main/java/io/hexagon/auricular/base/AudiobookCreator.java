package io.hexagon.auricular.base;

import java.util.List;

import io.hexagon.auricular.base.model.Audiobook;
import io.hexagon.auricular.base.model.Chapter;

public interface AudiobookCreator<T extends Audiobook, C extends Chapter> {

	List<T> getAvailableAudiobooks(int limit, int offset, String title, String genre, String authorLastName);
	
	T getAudiobook(int id);
	
	List<C> getAudiobookChapters(int audiobookId);
	
}
