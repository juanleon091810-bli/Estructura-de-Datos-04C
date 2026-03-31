// Diseña un sistema para gestionar los vagones de un tren de carga internacional.

// La Clase Vagon (Nodo): Debe contener contenido (String), pesoToneladas (double), origen (String) y destino (String).
// El Problema: El tren sale de una estación y se le van enganchando vagones al final.
// Reto: Implementa un método que recorra el tren y calcule el peso total de toda la carga transportada.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        ColaDelTren tren = new ColaDelTren();
        int opcion;

        do {
            System.out.println("\n==============================");
            System.out.println("MENU PRINCIPAL");
            System.out.println("==============================");
            System.out.println("1. Añadir vagon");
            System.out.println("2. Calcular peso total");
            System.out.println("0. Salir");
            System.out.println("==============================");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el contenido del vagon: ");
                    String contenido = sc.nextLine();
                    System.out.print("Ingrese el peso en toneladas: ");
                    double peso = sc.nextDouble();
                    System.out.print("Ingrese el origen: ");
                    String origen = sc.nextLine();
                    System.out.print("Ingrese el destino: ");
                    String destino = sc.nextLine();
                    Vagon newVagon = new Vagon(contenido, peso, origen, destino);
                    tren.añadirVagon(newVagon); 
                    sc.nextLine();
                    System.out.println("==============================");
                    System.out.println("Vagon añadido al tren.");
                    System.out.println("==============================");
                    
                    break;

                    case 2:
                    double pesoTotal = tren.pesoTotal();
                    System.out.println("==============================");
                    System.out.println("EL PESO TOTAL DELA CARGA ES DE " + pesoTotal + " TONELADAS");
                    System.out.println("==============================");

                    break;

                    case 0:
                    System.out.println("==============================");
                    System.out.println("SLIENDO DEL PROGRAMA...");
                    System.out.println("==============================");

                default:
                    System.out.println("¡Opción no válida! Por favor, seleccione una opción del menú.");
                    break;
            }
        } while (opcion != 0);
    sc.close();
    }
}
