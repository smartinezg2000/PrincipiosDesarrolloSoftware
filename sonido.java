
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.Scanner;

public class sonido
{
    public static void alerta() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        
        Scanner scanner = new Scanner(System.in);
        
        File file = new File("audiohelp.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        String repuesta = "";
            
        while(!repuesta.equals("p")) {
            System.out.println("p = Pause");
            
            
            repuesta = scanner.nextLine();
            
            
            
         }
         clip.stop();
        System.out.println("Pausado");    
        scanner.close();
       }
}
