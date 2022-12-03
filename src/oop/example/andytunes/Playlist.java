package oop.example.andytunes;

import java.util.ArrayList;

public class Playlist {
	private String name;
	private ArrayList<Song> songs;
	
	public Playlist(String name) {
		this.name = name;
		this.songs = new ArrayList<Song>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addSong(Song song) {
		this.songs.add(song);
	}
	
	public boolean removeSong(String songName) {
		Song song = findSongOrNull(songName);
		
		if (song == null) {
			return false;
		}
		
		this.songs.remove(song);
		return true;
	}
	
	public void play() {
		System.out.println(String.format("---Playing %s---", this.name));
		
		for (Song song : songs) {
			song.play();
		}
		
		System.out.println(String.format("---Done Playing %s---", this.name));
	}
	
	private Song findSongOrNull(String songName) {
		for (Song song : this.songs) {
			if (songName.equals(song.getName())) {
				return song;
			}
		}
		
		return null;
	}
}