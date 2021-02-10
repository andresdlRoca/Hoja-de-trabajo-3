/**
*@author Pedro Arriola 20188
*@author Esteban Aldana 20591
*@author Andrés de la Roca 20332
*/
import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.util.Comparable;


public class Sorting implements Comparable<T>{

  /**
  *
  *@param arr[]
  *@param n
  */
    public static void gnomeSort(int arr[], int n)
    {
        int index = 0;
  
        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return;
    }

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

    /**
    *
    *@param arr[]
    *@param l
    *@param r
    */
    public void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Encontrar punto medio
            int m =l+ (r-l)/2;
 
            // Ordenar primera y segunda mitad
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // partir los arrays ordenados
            merge(arr, l, m, r);
        }
    }
    
  /**
  *
  *@param A[]
  *@param izq
  *@param der
  */
 public static void quicksort(int A[], int izq, int der) {
  // tomamos primer elemento como pivote
  int pivote=A[izq]; 
  // i realiza la búsqueda de izquierda a derecha
  int i=izq;
  // j realiza la búsqueda de derecha a izquierda        
  int j=der;         
  int aux;
 
 // mientras no se crucen las búsquedas
  while(i < j){     
     // busca elemento mayor que pivote                     
     while(A[i] <= pivote && i < j) i++;
     // busca elemento menor que pivote
     while(A[j] > pivote) j--;   
     //si no se han cruzado        
     if (i < j) { 
         // los intercambia
         aux= A[i];                    
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   // se coloca el pivote en su lugar de forma que tendremos
   A[izq]=A[j];   
    // los menores a su izquierda y los mayores a su derecha   
   A[j]=pivote;     
   
   if(izq < j-1)
      // ordenamos subarray izquierdo
      quicksort(A,izq,j-1);         
   if(j+1 < der)
      // ordenamos subarray derecho
      quicksort(A,j+1,der);          
   
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

  
}