package Interface;
public class CDPlayer implements Playable{
        public void play() {
        System.out.println("CDPlayer has started playing.");
    }
    public void pause() {
        System.out.println("CDPlayer has been paused.");
    }

    public void stop() {
        System.out.println("CDPlayer has been stopped.");
    }
}
