
/**
*@author Pedro Arriola 20188
*@author Esteban Aldana 20591
*@author Andrés de la Roca 20332
*/
import java.util.Random;
import java.io.FileWriter;

public class Main {
  
  /**
  *
  *@param String[] args
  */
  public static void main(String[] args) {

    Random rand = new Random();
    FileWriter writer = new FileWriter("data.txt");
    int[] array = new int[10];

    for(int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt();
      system.out.println(array[i])
      writer.write(array[i] + " ");
    }
    writer.close();

    
    
  }

}