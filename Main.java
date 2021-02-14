import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
*@author Pedro Arriola 20188
*@author Esteban Aldana 20591
*@author Andrés de la Roca 20332
*/

public class Main {

    /**
     *Metodo main del programa
     *@param String[] args
     */
    public static void main(String[] args) {

        Sorting ob = new Sorting();

        ArrayList<Integer> numList = new ArrayList<Integer>();

        NumGenerator.generate(numList);

        int op = 0;
        boolean salir = false;

        Scanner scan = new Scanner(System.in);

        int cont =0;

        Numeros[] data = new Numeros[10];
        for(int i=0;i<10;i++){
            //String numCadena = String.valueOf(numeros.get(i));
            data[i] = new Numeros (numList.get(i));
        }

        while (!salir){

            //Menu para escoger el sort a trabajar
            System.out.println("\nBienvenido, Seleccione el sorting que desea realizar ");
            System.out.println("1. Gnome sort");
            System.out.println("2. Merge sort");
            System.out.println("3. Quick sort");
            System.out.println("4. Radix Sort");
            System.out.println("5. Bubble sort");
            System.out.println("6. Salir\n");

            op = scan.nextInt();

            if(op == 1){ //Gnome Sort
                String res = Sorting.gnomeSort(data);
                System.out.println(res);
                for(Numeros ordenado : data){
                    System.out.println(ordenado);
                    cont++;
                }
                System.out.println("Gnome sort");
                System.out.println("Cantidad de datos: " + cont);
                cont = 0;

            } else if (op == 2) { //Merge Sort
                Comparable[] ordenado = Sorting.mergeSort(data);
                for(Comparable orden : ordenado){
                    System.out.println(orden);
                    cont++;
                }
                System.out.println("Merge Sort");
                System.out.println("Cantidad de datos: " + cont);
                cont = 0;

            } else if (op == 3) { //Quick Sort
                String res = Sorting.quickSort(data,0, data.length-1);
                System.out.println(res);
                for(Numeros ordenado : data){
                    System.out.println(ordenado);
                    cont++;
                }
                System.out.println("Quick Sort");
                System.out.println("Cantidad de datos: " + cont);
                cont = 0;

            } else if (op == 4) { //Radix Sort
                String res = Sorting.radixSort(data, data.length);
                System.out.println(res);
                for(Numeros ordenado : data){
                    System.out.println(ordenado);
                    cont++;
                }
                System.out.println("Radix sort");
                System.out.println("Cantidad de datos: " + cont);
                cont = 0;


            } else if (op == 5) { //Bubble Sort
                String res = Sorting.bubbleSort(data);
                System.out.println(res);
                for(Numeros ordenado : data){
                    System.out.println(ordenado);
                    cont++;
                }
                System.out.println("Bubble Sort");
                System.out.println("Cantidad de datos: " + cont);
                cont = 0;

            } else if (op == 6) { //Salida
                System.out.println("Gracias por usar nuestro Programa");
                salir = true;

            } else { //Opcion invalida
                System.out.println("Ingrese una opcion valida");
            }
        }


    }

}
