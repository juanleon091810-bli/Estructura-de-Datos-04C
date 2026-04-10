// Diseña un editor de texto muy simple que guarde el historial de cambios.

// La Clase Cambio (Nodo): Debe contener texto (String) y tipoOperacion (String - ej: "Escribir", "Borrar").
// El Problema: Cada vez que el usuario escribe algo, se agrega un nodo al final. El usuario puede deshacer 
// (retroceder al nodo anterior) y rehacer (avanzar al nodo siguiente).
// Reto: Implementa métodos deshacer() y rehacer() que muevan un puntero actual a través de la lista doble

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Historial newHistorial = new Historial();    
        Scanner sc = new Scanner(System.in);
        int opc;
        Cambio cambioActual = null;

        do {
            System.out.println("\nOPCIONES DISPINIBLES:");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("0. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    
                    System.out.println("Escribe el texto que deseas agregar (el texto se guardara hasta oprimir la tecla enter):\n ");
                    String texto = sc.nextLine();
                    newHistorial.agregarCambio(new Cambio(texto, "Escribir"));
                    break;
                
                    case 2:

                    if (cambioActual != null) {
                        System.out.println("Cambio actual: " + cambioActual.texto);
                        cambioActual = newHistorial.deshacer(cambioActual);
                        System.out.println("Cambio deshecho: " + cambioActual.texto);
                    } else {
                        System.out.println("No hay cambios para deshacer.");
                    }
                    break;

                case 3:
                    if (cambioActual != null) {
                        System.out.println("Cambio actual: " + cambioActual.texto);
                        cambioActual = newHistorial.rehacer(cambioActual);
                        System.out.println("Cambio rehecho: " + cambioActual.texto);
                    } else {
                        System.out.println("No hay cambios para rehacer.");
                    }
                    break;

                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Dobles!");
                    break;
            
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        }
        while(opc != 0);
        sc.close();
    }
}
