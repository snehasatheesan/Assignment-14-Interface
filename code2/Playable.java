 //2. Define an interface named Playable with methods like play() , pause() , and stop() .
    // Implement this interface in classes representing different types of music players such as
    // MP3Player , CDPlayer , and StreamingPlayer .
    // Allow the user to control the playback of these players through the implemented interface.
package Interface;
public interface Playable {
   
    void play();
    void pause();
    void stop();
}
