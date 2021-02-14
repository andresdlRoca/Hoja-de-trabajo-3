import org.junit.jupiter.api.Test;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {


    @Test
    public void TestGnomeSort() {
        Sorting ob = new Sorting();

        ArrayList<Integer> numList = new ArrayList<Integer>();
        NumGenerator.generate(numList);
        int cont = 0;

        Numeros[] data = new Numeros[10];
        Numeros[] comparable = new Numeros[10];

        for (int i = 0; i < 10; i++) {
            data[i] = new Numeros(numList.get(i));
            comparable[i] = data[i];
        }

        String res = Sorting.gnomeSort(data);
        Sorting.gnomeSort(comparable);
        System.out.println(res);
        for (Numeros ordenado : data) {
            System.out.println(ordenado);
            cont++;
        }
        cont = 0;

        assertEquals(true, Arrays.equals(comparable, data));
    }



    @Test
    public void TestMergeSort() {
        Sorting ob = new Sorting();

        ArrayList<Integer> numList = new ArrayList<Integer>();
        NumGenerator.generate(numList);
        int cont = 0;

        Numeros[] data = new Numeros[10];
        Numeros[] comparable = new Numeros[10];

        for (int i = 0; i < 10; i++) {
            data[i] = new Numeros(numList.get(i));
            comparable[i] = data[i];
        }

        Comparable[] ordenado = Sorting.mergeSort(data);
        Sorting.mergeSort(comparable);
        System.out.println("Datos ordenados:");
        for(Comparable orden : ordenado){
            System.out.println(orden);
            cont++;
        }
        cont = 0;

        assertEquals(true, Arrays.equals(comparable, data));

    }

    @Test
    public void TestQuickSort() {

        Sorting ob = new Sorting();

        ArrayList<Integer> numList = new ArrayList<Integer>();
        NumGenerator.generate(numList);
        int cont = 0;

        Numeros[] data = new Numeros[10];
        Numeros[] comparable = new Numeros[10];

        for (int i = 0; i < 10; i++) {
            data[i] = new Numeros(numList.get(i));
            comparable[i] = data[i];
        }


        String res = Sorting.quickSort(data,0, data.length-1);
        Sorting.quickSort(comparable, 0, comparable.length-1);
        System.out.println(res);
        for(Numeros ordenado : data){
            System.out.println(ordenado);
            cont++;
        }
        cont = 0;
        assertEquals(true, Arrays.equals(comparable, data));
    }

    @Test
    public void TestRadixSort() {

        Sorting ob = new Sorting();

        ArrayList<Integer> numList = new ArrayList<Integer>();
        NumGenerator.generate(numList);
        int cont = 0;

        Numeros[] data = new Numeros[10];
        Numeros[] comparable = new Numeros[10];

        for (int i = 0; i < 10; i++) {
            data[i] = new Numeros(numList.get(i));
            comparable[i] = data[i];
        }

        String res = Sorting.radixSort(data, data.length);
        Sorting.radixSort(comparable, comparable.length);
        System.out.println(res);
        for(Numeros ordenado : data){
            System.out.println(ordenado);
            cont++;
        }
        cont = 0;
        assertEquals(true, Arrays.equals(comparable, data));
    }

    @Test
    public void TestBubbleSort() {

        Sorting ob = new Sorting();

        ArrayList<Integer> numList = new ArrayList<Integer>();
        NumGenerator.generate(numList);
        int cont = 0;

        Numeros[] data = new Numeros[10];
        Numeros[] comparable = new Numeros[10];

        for (int i = 0; i < 10; i++) {
            data[i] = new Numeros(numList.get(i));
            comparable[i] = data[i];
        }

        String res = Sorting.bubbleSort(data);
        Sorting.bubbleSort(comparable);
        System.out.println(res);
        for(Numeros ordenado : data){
            System.out.println(ordenado);
            cont++;
        }
        cont = 0;

    }


}
