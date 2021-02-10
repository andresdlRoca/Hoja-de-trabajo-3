
/**
*@author Pedro Arriola 20188
*@author Esteban Aldana 20591
*@author Andrés de la Roca 20332
*/
import java.util.Random;
import java.io.FileWriter;
import java.io.IOExeption;

public class Main {
  
  /**
  *
  *@param String[] args
  */
  public static void main(String[] args) {

    try {
    Random rand = new Random();
    FileWriter writer = new FileWriter("data.txt");
    int[] array = new int[10];

    for(int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt();
      System.out.println(array[i]);
      writer.write(array[i] + " ");
    }
    writer.close();
    } catch (IOException e) {
      System.err.println("El archivo no se ha encontrado")
    }
    
    
  }

}