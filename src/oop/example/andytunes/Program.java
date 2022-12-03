package oop.example.andytunes;

public class Program {
	public static void main(String[] args) {
		Song stopTime = new Song("Dynamic Duo", "Stop time", 180100);
		Song trip = new Song("Leellammarz", "Trip", 172100);
		Song romanticWinter = new Song("jin pyo", "Romantic Winter", 182200);
		Song gone = new Song("Leellammarz", "Gone", 166220);
		Song panorama = new Song("chan hyeok", "Panorama", 175220);
		Song fox = new Song("JOY", "Fox", 193000);
		Song soLove = new Song("Davichi", "So Love", 18301);
		
		System.out.printf("%s by %s. Playtime is %d.%s", stopTime.getName(), stopTime.getArtist(), stopTime.getPlayTimeInMilliSeconds(), System.lineSeparator());
		
		Playlist playlist1 = new Playlist("Hiphop");
		playlist1.addSong(stopTime);
		playlist1.addSong(trip);
		playlist1.addSong(romanticWinter);
		
		Playlist playlist2 = new Playlist("Feeling");
		playlist2.addSong(gone);
		playlist2.addSong(panorama);
		
		AndyTunes tunes = new AndyTunes();
		
		tunes.addSong(soLove);
		tunes.addSong(fox);
		tunes.addSong(panorama);
		tunes.addSong(gone);
		tunes.addSong(romanticWinter);
		tunes.addSong(trip);
		tunes.addSong(stopTime);
		
		System.out.printf("Song count %d%s", tunes.getSongCount(), System.lineSeparator());
		tunes.addPlaylist(playlist1);
		tunes.addPlaylist(playlist2);
		
		tunes.playSong("Stop Time");
		tunes.playSong("Trip");
		
		tunes.playSong("Romantic Winter");
		
		tunes.playPlaylist("Hiphop");
		tunes.playPlaylist("Feeling");
		
		playlist2.setName("Feeling2");
		playlist2.removeSong("gone");
		playlist2.addSong(fox);
		
		tunes.playPlaylist("Feeling2");
		
		tunes.removeSong("soLove");
		tunes.playPlaylist("Feeling2");
		tunes.playSong("soLove");
		
		tunes.removePlaylist("Feeling2");
		
		System.out.printf("Song count %d.%s", tunes.getSongCount(), System.lineSeparator());
		tunes.playPlaylist("Feeling2");
		
		
	}
}