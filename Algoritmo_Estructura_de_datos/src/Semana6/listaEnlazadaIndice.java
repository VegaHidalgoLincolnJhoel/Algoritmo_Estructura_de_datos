/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana6;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class listaEnlazadaIndice {

    private static class Nodo {

        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;

    public listaEnlazadaIndice() {
        cabeza = null;
    }

    // Agregar elemento al final de la lista
    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Buscar un elemento en la lista y devolver el índice (-1 si no existe)
    public int buscarIndice(int valor) {
        Nodo actual = cabeza;
        int indice = 0;
        while (actual != null) {
            if (actual.dato == valor) {
                return indice;
            }
            actual = actual.siguiente;
            indice++;
        }
        return -1;
    }

    // Acceder a un elemento por su índice (no es acceso directo)
    public int obtenerPorIndice(int indice) {
        Nodo actual = cabeza;
        int contador = 0;
        while (actual != null) {
            if (contador == indice) {
                return actual.dato;
            }
            actual = actual.siguiente;
            contador++;
        }
        throw new IndexOutOfBoundsException("Indice fuera de rango");
    }

    // Mostrar la lista
    public void mostrar() {
        Nodo actual = cabeza;
        int indice = 0;
        while (actual != null) {
            System.out.print("[" + indice + "] " + actual.dato + " -> ");
            actual = actual.siguiente;
            indice++;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listaEnlazadaIndice lista = new listaEnlazadaIndice();

        // Agregar elementos
        lista.agregar(3);
        lista.agregar(6);
        lista.agregar(9);
        lista.agregar(8);
        lista.agregar(4);
        lista.agregar(7);
        lista.agregar(1);

        // Mostrar la lista con índices
        System.out.println("Lista enlazada:");
        lista.mostrar();

        // Buscar elementos
        System.out.println("Buscar por valor|(v) o Indice|(i):");
        String opcion = sc.nextLine().trim();

        if (opcion.equals("v")) {
            System.out.println("Indique valor a buscar");
            int valorBuscado = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            int indiceEncontrado = lista.buscarIndice(valorBuscado);
            if (indiceEncontrado != -1) {
                System.out.println("Elemento " + valorBuscado + " encontrado en el Indice: " + "'" + indiceEncontrado + "' .");
            } else {
                System.out.println("Elemento " + valorBuscado + " NO encontrado en la lista.");
            }
        } else if (opcion.equals("i")) {
            // Acceder por índice
            System.out.println("Indique Indice a buscar");
            int indice = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            try {
                int dato = lista.obtenerPorIndice(indice);
                System.out.println("Elemento en el Indice " + indice + ": " + "'" + dato + "'");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Opción no válida. Escribe 'v' para buscar por valor o 'i' para buscar por índice.");
        }
        sc.close();
    }
}