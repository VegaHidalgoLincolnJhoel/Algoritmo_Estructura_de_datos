/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Arreglos_aleatorios {

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
        
        int contador = 0;
        for (int i = 0; i < n; i++) {
            boolean repetido = false;
            for (int j = 0; j < n; j++) {
                if(a[i] == a[j])contador++;
                if (i != j && a[i] == a[j]) {
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                System.out.println("El elemento " + a[i] + " esta repetido." + "veces: "+contador);
            } else {
                System.out.println("El elemento " + a[i] + " es unico.");
            }
        }

        System.out.println("'Arreglo generado'");
        System.out.println(Arrays.toString(a));
    }
}
