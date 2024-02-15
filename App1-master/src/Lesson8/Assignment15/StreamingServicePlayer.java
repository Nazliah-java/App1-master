package lesson8.Assignment15;

public class StreamingServicePlayer implements MusicPlayer{

    private String currentTrack;
    private boolean isPlaying;

    public StreamingServicePlayer(String currentTrack, boolean isPlaying){
        this.currentTrack = currentTrack;
        this.isPlaying = isPlaying;
    }

    @Override
    public void play() {
       if(currentTrack != null && !isPlaying){
        System.out.println("Playing: " + currentTrack);
    }else{
        System.out.println("Track is already playing or no track is selected.");
    }

    }

    @Override
    public void pause() {
        if(!isPlaying){
            System.out.println("Paused: " + currentTrack);
            isPlaying = false;
        }else{
            System.out.println("Track is already paused.");
        }
    }

    @Override
    public void next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }

    @Override
    public void previous() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'previous'");
    }
    
}
