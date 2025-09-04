/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lincoln
 */
public class MetOrdenShell {
    
    public static void OrdShell(int[] arr){
        int n = arr.length;
        // Inicializar la brecha/gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Hacer el ordenamiento por inserción para esta brecha
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] < temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Cuantos elementos tendra el arreglo?: ");
        int n = scn.nextInt();
        scn.nextLine();

        int[] a = new int[n];
        Random ran = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = ran.nextInt(100);
        }
        
        System.out.println("'Arreglo generado'");
        System.out.println(Arrays.toString(a));
        
        System.out.println("Arreglo Ordenado");
        OrdShell(a);
    }

}
