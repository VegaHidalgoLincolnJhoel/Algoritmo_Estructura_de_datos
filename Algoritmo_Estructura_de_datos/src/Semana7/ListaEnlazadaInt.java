package Semana7;

import java.util.Scanner;

// Nodo para enteros
class NodoInt {
    int dato;
    NodoInt siguiente;
    public NodoInt(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class ListaEnlazadaInt {

    // Crear lista enlazada de n elementos enteros
    public static NodoInt crearLista(int n, Scanner sc) {
        NodoInt cabeza = null, actual = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un numero: ");
            int valor = sc.nextInt();
            NodoInt nuevo = new NodoInt(valor);
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                actual.siguiente = nuevo;
            }
            actual = nuevo;
        }
        return cabeza;
    }

    // Buscar un elemento en la lista
    public static boolean buscarElemento(NodoInt cabeza, int valor) {
        while (cabeza != null) {
            if (cabeza.dato == valor)
                return true;
            cabeza = cabeza.siguiente;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos elementos para la lista de enteros?: ");
        int n = sc.nextInt();
        NodoInt lista = crearLista(n, sc);

        System.out.print("Elemento a buscar en la lista de enteros: ");
        int buscarValor = sc.nextInt();
        System.out.println(
            buscarElemento(lista, buscarValor)
            ? "Elemento encontrado."
            : "Elemento no encontrado."
        );
        sc.close();
    }
}