package io.hexagon.auricular.base;

import java.util.List;

import io.hexagon.auricular.base.model.Audiobook;

public interface AudiobookCreator<T extends Audiobook> {

	List<T> getAvailableAudiobooks(int limit, int offset);
	
	T getAudiobook(int id);
	
	List<T> getProjectAudiobooks(int projectId);
	
}
