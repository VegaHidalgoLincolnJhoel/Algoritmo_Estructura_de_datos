/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosDeOrdenamiento;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class OrdSeleccion {
    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar el valor mínimo encontrado con el valor en la posición i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Arreglo ordenado con Selección:");
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        Random ran = new Random();

        // Definir tamaño del arreglo
        System.out.print("Indicar tamano del arreglo: ");
        n = sc.nextInt();
        sc.nextLine();

        //Creacion del arreglo aleatorio
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ran.nextInt(100);
        }
        
        //Mostrar Arreglo
       System.out.println(Arrays.toString(a));
       
       //Ordenar arreglo
        String opcion = "";
        System.out.println("¿Desea ordenar la lista? s/n");
        opcion = sc.nextLine();
        
        if(opcion.equals("s")){
            SelectionSort(a);
        }else{
            System.out.println("Saliendo del Programa...");
            sc.close();
            System.exit(0);
        }

    }
}
