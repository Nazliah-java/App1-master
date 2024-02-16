package lesson8.Assignment15;

public class StreamingServicePlayer implements MusicPlayer{
    String[] showlist = { "Video1", "Video2", "Video3" };
    int currentIndex = 0;

    @Override
    public void play() {
        System.out.println("Playing: " + showlist[currentIndex]);
    }

    @Override
    public void pause() {
        System.out.println("Pausing: " + showlist[currentIndex]);
    }

    @Override
    public void next() {
        currentIndex++;
        if (currentIndex > showlist.length - 1) {
            System.out.println("Show ended.");
        } else {
            System.out.println("Playing next track on MP3 player.");
            System.out.println("Playing: " + showlist[currentIndex]);
        }
    }

    @Override
    public void previous() {
        currentIndex--;
        if (currentIndex < 0) {
            System.out.println("No previous episode.");
        } else {
            System.out.println("Playing previous track on MP3 player.");
            System.out.println("Playing: " + showlist[currentIndex]);
        }
    }
    
}