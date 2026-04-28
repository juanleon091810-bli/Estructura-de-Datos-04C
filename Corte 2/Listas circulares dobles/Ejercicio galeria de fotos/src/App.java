// Una app de galería muestra las fotos de un álbum de una en una. El usuario puede pasar a la foto 
// siguiente, volver a la anterior, y marcar cualquier foto como favorita. Al eliminar una foto, 
// la galería continúa desde la siguiente sin interrupciones.

// La Clase Foto (Nodo): Debe contener titulo (String), fecha (String) y esFavorita (boolean).
// El Problema: La galería mantiene un puntero actual a la foto que se está viendo. 
// Navegar con "siguiente" o "anterior" mueve ese puntero. Marcar como favorita simplemente alterna 
// el campo esFavorita de la foto actual. Eliminar la foto actual desconecta el nodo en O(1) y mueve 
// actual a la siguiente.
// Reto: Implementa los métodos siguiente(), anterior(), toggleFavorita(), eliminarActual() y 
// mostrarGaleria(). mostrarGaleria() recorre todas las fotos marcando con [★] las favoritas y 
// con [▶] la foto actual. Simula: carga 5 fotos, avanza dos veces, marca la actual como favorita, 
// retrocede una, elimina esa foto y muestra el estado final de la galería.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Galeria galeria = new Galeria();
        int opcion;

        System.out.println("\n====================");
        System.out.println("MENU DE LA GALERIA DE FOTOS");
        System.out.println("====================");
        do {
            System.out.println("\n1. Agregar Foto");
            System.out.println("2. Siguiente Foto");
            System.out.println("3. Anterior Foto");
            System.out.println("4. Marcar/Desmarcar Favorita");
            System.out.println("5. Eliminar Foto Actual");
            System.out.println("6. Mostrar Galería");
            System.out.println("0. Salir");
            System.out.println("\n====================");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            System.out.println("====================");
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título de la foto: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese la fecha de la foto (dd/mm/yyyy): ");
                    String fecha = sc.nextLine();
                    System.out.print("¿Es favorita? (true/false): ");
                    boolean esFavorita = sc.nextBoolean();
                    sc.nextLine(); 
                    galeria.agregarFoto(titulo, fecha, esFavorita);
                    break;

                case 2:
                    galeria.siguiente(galeria.actual);
                    break;

                case 3:
                    galeria.anterior(galeria.actual);
                    break;

                case 4:
                    galeria.toggleFavorita(galeria.actual);
                    break;

                case 5:
                    galeria.eliminarActual(galeria.actual);
                    break;

                case 6:
                    galeria.mostrarGaleria(galeria);
                    break;

                case 0:
                    System.out.println("Saliendo de la aplicación...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
