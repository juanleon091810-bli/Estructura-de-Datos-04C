// INSERTION SORT

// Contexto: El profesor necesita pasar asistencia y requiere que la lista de nombres 
// ingresada en el sistema se ordene alfabéticamente de la A a la Z.
// Detalle del ejercicio: El programa debe preguntar cuántos alumnos hay en clase y 
// solicitar sus nombres (cadenas de texto).
// Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
// Requisito técnico: El estudiante debe investigar y aplicar el método nombre1.compareToIgnoreCase(nombre2). 
// Es vital explicar que si el resultado es mayor a 0, el primer nombre es alfabéticamente "mayor" que el segundo.
// Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto.

import java.util.Scanner;

public class Ejercicio_Ordenamiento_4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos en clase:");
        int alumnos = scanner.nextInt();
        String []nombresAlumnos = new String[alumnos];
        for(int i = 0; i < alumnos; i++){
            System.out.println("Ingrese el nombre del alumno " +(i+1) + ":");
            nombresAlumnos[i] = scanner.next();
        }

        sort(nombresAlumnos);

        System.out.println("Lista de asistencia ordenada alfabéticamente:");
        for (String nombre : nombresAlumnos) {
            System.out.println(nombre);
        }
        scanner.close();
    }

    public static void sort(String[] arr) {

        int n = arr.length;
        for(int i = 1; i < n; ++i){
            String key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
