// Un gimnasio tiene una lista de códigos de acceso de los 
// socios que pagaron la mensualidad. La lista está ordenada de menor a mayor.

// El Problema: Cuando un socio digita su código, el sistema debe validar si 
// el código está en la lista de "pagos al día". Si no está, se le niega la entrada.
// Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos 
// en una lista que ya está organizada.

import java.util.Scanner;

public class Ejercicio_Array_4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] codigosPagados = { 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010 };
        int codigoIngresado = 0;

        System.out.print("Ingrese su código de acceso: ");
        codigoIngresado = scanner.nextInt();

        boolean encontrado = false;
        int inicio = 0;
        int fin = codigosPagados.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (codigosPagados[medio] == codigoIngresado) {
                encontrado = true;
                break;
            } else if (codigosPagados[medio] < codigoIngresado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        if (encontrado) {
            System.out.println("Acceso permitido. El código está en la lista de pagos al día.");
        } else {
            System.out.println("Acceso denegado. El código no está en la lista de pagos al día.");
        }
        scanner.close();
    }
}