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
public class OrdInserccion {
    
    public static void BubleSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        // Iterar sobre todos los elementos del arreglo
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Comparar elementos adyacentes
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar si están en el orden incorrecto
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!swapped) break;
        }
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
            BubleSort(a);
        }else{
            System.out.println("Saliendo del Programa...");
            sc.close();
            System.exit(0);
        }

    }
}
