
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class buscadorplacas
{
    public static String leerplacas(String n) throws java.io.IOException, FileNotFoundException  {
    String registro = "Placas.txt";
    
    String line = null;
    int acum =0;
     try {
      FileReader fileReader = new FileReader(registro);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      while ((line = bufferedReader.readLine()) != null) {
          if (line.contains(n)) {
          return ("Placa "+ n +" con denuncias");
        }
        
      }
      bufferedReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return ("Placa "+ n +" sin denuncias");
    }
}
