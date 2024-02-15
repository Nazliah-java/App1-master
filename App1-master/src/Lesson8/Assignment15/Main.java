package lesson8.Assignment15;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> mp3Playlist = List.of("Song1.mp3", "Song2.mp3", "Song3.mp3");

        MusicPlayer mp3Player = new MP3Player("aku", 0, false);
        mp3Player.play();
        mp3Player.next();
        mp3Player.previous();
        mp3Player.pause();

        MusicPlayer streamingServicePlayer = new StreamingServicePlayer(null, false);
        streamingServicePlayer.next();
        streamingServicePlayer.play();
        streamingServicePlayer.pause();
    }
}
