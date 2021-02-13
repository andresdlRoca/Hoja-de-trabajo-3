
/**
*@author Pedro Arriola 20188
*@author Esteban Aldana 20591
*@author Andrés de la Roca 20332
*/
import java.util.Random;
import java.io.FileWriter;
import java.io.IOExeption;
import java.util.Scanner;

public class Main {
  
  /**
  *
  *@param String[] args
  */
  public static void main(String[] args) {

    Sorting ob = new Sorting();

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
    int op = 0;
    boolean salir = false;

    Scanner scan = new Scanner(System.in);

    while (!salir){
      
      //Menu para escoger el sort a trabajar
      System.out.println("\nBienvenido Seleccione el sorting que desea realizar ");
              System.out.println("1. Gnome sort");
              System.out.println("2. Merge sort");
              System.out.println("3. Quick sort");
              System.out.println("4. Radix Sort");
              System.out.println("5. Bubble sort");
              System.out.println("6. Salir\n");
              
              op = scan.nextInt();

              if(op == 1){ //Gnome Sort
                int arr[] = { 34, 2, 10, -9 }; 
  
                gnomeSort(arr, arr.length); 
  
                System.out.print("Secuencia despues de aplicar Gnome sort "); 
                 System.out.println(Arrays.toString(arr)); 
                 
              } else if (op == 2) { //Merge Sort

                 int arr[] = { 12, 11, 13, 5, 6, 7 };
        
                System.out.println("Array ");
                printArray(arr);
        
                //Sorting ob = new Sorting();
                ob.sort(arr, 0, arr.length - 1);
        
                System.out.println("\nArray ordenado ");
                printArray(arr);

              } else if (op == 3) { //Quick Sort
                int arr[] = {10, 7, 8, 9, 1, 5}; 
                int n = arr.length; 
          
                Sorting ob = new Sorting(); 
                ob.sort(arr, 0, n-1); 
          
                System.out.println("Array Ordenado"); 
                printArray(arr); 
                

              } else if (op == 4) { //Radix Sort

                int arr[] = {14, 8, 9, 20, 99, 50, 6, 2, 1}

                System.out.println("Array (Radix)");
                printArray(arr);

                int length = arr.length;
                ob.radixSort(arr, length);

                System.out.println("\nArray Ordenado (Radix)");
                printArray(arr);

              } else if (op == 5) { //Bubble Sort

                int arr[] = {9, 5, 18, 22, 30, 1, 12, 4}

                System.out.println("Array (Bubble)");
                printArray(arr);

                ob.bubbleSort(arr);

                System.out.println("\nArray ordenado (Bubble)");
                printArray(arr);

              } else if (op == 6) { //Salida
                salir = true;
              } else { //Opcion invalida
                System.out.println("Ingrese una opcion valida");
              }
    }
    
    
  }

}