import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class ModuloPlacas
{
    
    public static void guardar(String n){
        File f = new File("Placas.txt");
        FileWriter writer = null;
        PrintWriter pw = null;
        
        // File creation
        if (!f.exists()) {
            try{
                f.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creando el archivo");
            }
        }
        try{
            writer = new FileWriter("Placas.txt",true);
            pw = new PrintWriter(writer);
            pw.println(n);
            
        }catch(IOException exception){
                System.err.println("Error abriendo el archivo");
        }finally {
           try {
               //Closing the file
           if (null != writer)
              writer.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
