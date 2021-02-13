/**
*@author Pedro Arriola 20188
*@author Esteban Aldana 20591
*@author Andrés de la Roca 20332
*/
import java.util.Arrays;
import java.io.*;
import java.util.*;

public class Sorting{

  /**
  *
  *@param arr[]
  *@param n
  */
    public static void gnomeSort(int arr[], int n)
    {
        int index = 0;
  
        while (index < n) {

            if (index == 0) {
              index++;
            }
                
            if (arr[index] >= arr[index - 1]) {
              index++;
            } else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return;
    }
    

  

  /**
  *
  *@param arr[]
  *@param l
  *@param m
  *@param r
  */
  public void merge(int arr[], int l, int m, int r)
    {
        // Encontrar los tamaños de los dos subarray
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Crear Arrays*/
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copiar data a Arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Partir Arrays*/
 
        // IInicializar index de ambos subarrays
        int i = 0, j = 0;
 
        // IInicializar index de array partido
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copiar elementos de L[] si es que hay */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copiar elementos de R[] si es que hay */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
     static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
    *
    *@param arr[]
    *@param l
    *@param r
    */
    int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 


  /**
  * Funcion que se utiliza para obtener el valor mas grande de un array
  *@param arr[] Array del que se quiere sacar el valor maximo
  *@param n Longitud del array
  */
  public static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
  
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    /**
    * Funcion que se utiliza para 
    *@param arr[]
    *@param n
    *@param exp
    */
    public static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
  
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
  
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
  
        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
  
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
     static void print(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    // The main function to that sorts arr[] of size n using
    // Radix Sort
    /**
    *
    *@param arr[]
    *@param n
    */
    public static void radixsort(int arr[], int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);
  
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
  


  /**
  *
  *@param arr[]
  */
  public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    /* Prints the array */
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

  
}