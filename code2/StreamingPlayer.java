package Interface;
public class StreamingPlayer implements Playable{
   
    public void play() {
        System.out.println("StreamingPlayer has started playing.");
    }

    public void pause() {
        System.out.println("StreamingPlayer has been paused.");
    }
    public void stop() {
        System.out.println("StreamingPlayerr has been stopped.");
    }
}


