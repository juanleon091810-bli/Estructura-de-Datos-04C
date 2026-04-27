// Los terminales guardan un historial de comandos. Al presionar flecha arriba el usuario retrocede al comando anterior; 
// flecha abajo avanza al más reciente. El historial es circular: después del más antiguo vuelve al más nuevo.

// La Clase Comando (Nodo): Debe contener texto (String), exitoso (boolean — si ejecutó sin errores) y directorio 
// (String — el path desde donde se ejecutó).
// El Problema: El historial mantiene un puntero cursor al comando que se está consultando. Navegar con "arriba" 
// mueve el cursor al anterior (anterior); "abajo" lo mueve al siguiente (siguiente). El usuario puede eliminar el 
// comando actual (para borrar contraseñas escritas por error), y el cursor pasa automáticamente al siguiente.
// Reto: Implementa los métodos arriba(), abajo(), mostrarCursor() y eliminarActual(). Simula: agrega 5 comandos, 
// navega 3 veces hacia arriba, elimina el comando actual, navega una vez hacia abajo y muestra el historial completo 
// con el cursor marcado.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Historial historial = new Historial();
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n=== Historial de Comandos ===");
            System.out.println("\n1. Agregar comando");
            System.out.println("2. Navegar hacia arriba");
            System.out.println("3. Navegar hacia abajo");
            System.out.println("4. Eliminar comando actual");
            System.out.println("5. Mostrar historial completo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el texto del comando: ");
                    String texto = sc.nextLine();
                    System.out.print("¿El comando fue exitoso? (true/false): ");
                    boolean exitoso = sc.nextBoolean();
                    sc.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese el directorio desde donde se ejecutó: ");
                    String directorio = sc.nextLine();
                    Comando nuevoComando = new Comando(texto, exitoso, directorio);
                    historial.agregarComando(nuevoComando);
                    break;
                case 2:
                    historial.arriba(historial.head); // Navegar hacia arriba
                    break;
                case 3:
                    historial.abajo(historial.head); // Navegar hacia abajo
                    break;
                case 4:
                    historial.eliminarActual(historial.head); // Eliminar comando actual
                    break;
                case 5:
                    historial.mostrarCursor(); // Mostrar historial completo
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
