/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana6;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class listaEnlazadaSimple {
    private static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;

    public listaEnlazadaSimple() {
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

    // Mostrar la lista
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        listaEnlazadaSimple lista = new listaEnlazadaSimple();

        // Agregar elementos
        lista.agregar(5);
        lista.agregar(10);
        lista.agregar(15);

        // Mostrar la lista
        System.out.println("Lista enlazada (Ejercicio 1):");
        lista.mostrar();
    }
}
