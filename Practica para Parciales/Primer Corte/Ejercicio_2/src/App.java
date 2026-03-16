// Objetivo: Ingresar puntajes y organizarlos de mayor a menor para determinar el podio.
// ¿Qué debes hacer?
// 1. Entrada: Pide al usuario que ingrese 6 puntajes (números enteros) por teclado.
// 2. Ordenamiento: Usa Inserción (Insertion Sort) para ordenar los puntajes de mayor a menor.
// 3. Búsqueda: Pide un puntaje al usuario y búscalo usando Búsqueda Lineal. 
// Indica en qué posición (lugar) de la tabla quedó.

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        int[] puntajes = new int[6];
        Scanner scanner = new Scanner(System.in);

        // Entrada de puntajes
        System.out.println("Ingrese 6 puntajes:");
        for (int i = 0; i < puntajes.length; i++) {
            System.out.print("Puntaje " + (i + 1) + ": ");
            puntajes[i] = scanner.nextInt();
        }

        // Ordenamiento por inserción (Insertion Sort) de mayor a menor
        for (int i = 1; i < puntajes.length; i++) {
            int key = puntajes[i];
            int j = i - 1;
            while (j >= 0 && puntajes[j] < key) {
                puntajes[j + 1] = puntajes[j];
                j--;
            }
            puntajes[j + 1] = key;
        }

        // Mostrar los puntajes ordenados
        System.out.println("\nPuntajes ordenados de mayor a menor:");
        for (int i = 0; i < puntajes.length; i++) {
            System.out.println((i + 1) + "° lugar: " + puntajes[i]);
        }

        // Búsqueda lineal
        System.out.print("\nIngrese un puntaje para buscar: ");
        int busqueda = scanner.nextInt();
        int posicion = -1;
        for (int i = 0; i < puntajes.length; i++) {
            if (puntajes[i] == busqueda) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("El puntaje " + busqueda + " se encuentra en el lugar: " + (posicion + 1));
        } else {
            System.out.println("El puntaje " + busqueda + " no se encuentra en la tabla.");
        }

        scanner.close();
    }
}
