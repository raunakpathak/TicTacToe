import java.io.*;

import sun.audio.*;

public class MakeSound {

    public void makeSound(String filename)
            throws Exception
    {
        // open the sound file as a Java input stream
        InputStream File = this.getClass().getResource(filename).openStream();
        //InputStream in =
        //new FileInputStream(gongFile);

        // create an audiostream from the inputstream
        AudioStream audioStream = new AudioStream(File);

        // play the audio clip with the audioplayer class
        AudioPlayer.player.start(audioStream);
    }

}