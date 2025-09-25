package Semana7;

import java.util.Scanner;

// Nodo para cadenas
class NodoStr {
    String valor;
    NodoStr siguiente;
    public NodoStr(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

public class ListaEnlazadaStr {

    // Insertar al final
    public static NodoStr insertarFinal(NodoStr cabeza, String valor) {
        NodoStr nuevo = new NodoStr(valor);
        if (cabeza == null) {
            return nuevo;
        }
        NodoStr actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
        return cabeza;
    }

    // Recorrido
    public static void recorrer(NodoStr cabeza) {
        while (cabeza != null) {
            System.out.print(cabeza.valor + " -> ");
            cabeza = cabeza.siguiente;
        }
        System.out.println("NULL");
    }

    // Búsqueda
    public static boolean buscar(NodoStr cabeza, String valor) {
        while (cabeza != null) {
            if (cabeza.valor.equals(valor))
                return true;
            cabeza = cabeza.siguiente;
        }
        return false;
    }

    // Eliminación
    public static NodoStr eliminar(NodoStr cabeza, String valor) {
        NodoStr actual = cabeza, anterior = null;
        while (actual != null) {
            if (actual.valor.equals(valor)) {
                if (anterior == null) {
                    cabeza = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                break;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        return cabeza;
    }

    // Ordenación (burbuja)
    public static void ordenar(NodoStr cabeza) {
        if (cabeza == null) return;
        boolean cambiado;
        do {
            cambiado = false;
            NodoStr actual = cabeza;
            while (actual.siguiente != null) {
                if (actual.valor.compareTo(actual.siguiente.valor) > 0) {
                    String temp = actual.valor;
                    actual.valor = actual.siguiente.valor;
                    actual.siguiente.valor = temp;
                    cambiado = true;
                }
                actual = actual.siguiente;
            }
        } while (cambiado);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NodoStr lista = null;
        System.out.println("Ingrese valores tipo cadena (escriba 'fin' para terminar):");
        while (true) {
            String valor = sc.next();
            if (valor.equals("fin")) break;
            lista = insertarFinal(lista, valor);
        }

        System.out.println("Recorrido de la lista de cadenas:");
        recorrer(lista);

        System.out.print("Buscar cadena en la lista: ");
        String buscarStr = sc.next();
        System.out.println(
            buscar(lista, buscarStr)
            ? "Cadena encontrada."
            : "Cadena no encontrada."
        );

        System.out.print("Eliminar cadena de la lista: ");
        String eliminarStr = sc.next();
        lista = eliminar(lista, eliminarStr);
        System.out.println("Lista despues de eliminar:");
        recorrer(lista);

        System.out.println("Lista ordenada:");
        ordenar(lista);
        recorrer(lista);

        sc.close();
    }
}