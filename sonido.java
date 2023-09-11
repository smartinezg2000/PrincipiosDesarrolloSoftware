
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.Scanner;

public class sonido
{
public static void alerta() throws LineUnavailableException, UnsupportedAudioFileException, IOException{
   
      Scanner scanner = new Scanner(System.in);
  
  File file = new File("audiohelp.wav");
  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
  Clip clip = AudioSystem.getClip();
  clip.open(audioStream);
  
  String response = "";
 
  clip.start();
  
     while(!response.equals("P")) {
      System.out.println("Ingresa P para parar el audio");
      response = scanner.nextLine();
   
   
      response = scanner.next();
      response = response.toUpperCase();
   

}
clip.stop();
}


}
