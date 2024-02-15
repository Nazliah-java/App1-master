package lesson8.Assignment15;

public class MP3Player implements MusicPlayer{

    private String[] playlist;
    private int currentTrackIndex;
    private boolean isPlaying;

    public MP3Player(String[] playlist, int currentTrackIndex, boolean isPlaying){
        this.playlist = playlist;
        this.currentTrackIndex = currentTrackIndex;
        this.isPlaying = isPlaying;
    }

    @Override
    public void play() {
        if(!isPlaying){
            System.out.println("Playing: " + playlist[currentTrackIndex]);
            isPlaying = true;
        }else{
            System.out.println("Track is already playing.");
        }
    }

    @Override
    public void pause() {
        if(!isPlaying){
            System.out.println("Playing: " + playlist[currentTrackIndex]);
            isPlaying = false;
        }else{
            System.out.println("Track is already paused.");
        }
    }

    @Override
    public void next() {
        if(currentTrackIndex < playlist.length - 1){
            currentTrackIndex++;
            play();
        }else{
            System.out.println("End of playlist reached.");
        }
    }

    @Override
    public void previous() {
        if(currentTrackIndex > 0){
            currentTrackIndex--;
            play();
        }else{
            System.out.println("This is the first track in the playlist.");
        }
    }
    
}
