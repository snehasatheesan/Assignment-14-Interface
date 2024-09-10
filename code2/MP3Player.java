package Interface;
public class MP3Player implements Playable{
   
    public void play() {
        System.out.println("MP3Player has started playing.");
    }

    public void pause() {
        System.out.println("MP3Player has been paused.");
    }

    public void stop() {
        System.out.println("MP3Player has been stopped.");
    }
}
