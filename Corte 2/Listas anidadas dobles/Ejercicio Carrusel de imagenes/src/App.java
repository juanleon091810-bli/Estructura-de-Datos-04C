// Simula el comportamiento de una galería de fotos en una aplicación móvil.

// La Clase Fotografia (Nodo): Debe contener nombreArchivo (String), tamanoMB (double) y resolucion (String).
// El Problema: El usuario puede avanzar a la "Siguiente Foto" o retroceder a la "Foto Anterior". 
// Si llega al final, no puede avanzar más (a menos que sea circular, pero por ahora manténlo lineal).
// Reto: Crea un método reproducirGaleria() que recorra toda la lista hacia adelante y luego toda la lista 
// hacia atrás para mostrar todas las fotos.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Galeria galeria = new Galeria();
        int opcion;
        
        do {
            System.out.println("1. Siguiente Foto");
            System.out.println("2. Foto Anterior");
            System.out.println("3. Reproducir Galería");
            System.out.println("4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el nombre del archivo:");
                    String nombreArchivo = sc.next();
                    System.out.println("Ingrese el tamaño en MB:");
                    double tamanoMB = sc.nextDouble();
                    System.out.println("Ingrese la resolución:");
                    String resolucion = sc.next();

                    Fotografia foto = new Fotografia(nombreArchivo, tamanoMB, resolucion);
                    galeria.agergarFoto(foto);
                    
                    break;
                case 2:
                    galeria.adelantarFotos();
                    
                    break;
                case 3:
                    galeria.retorcederFotos();
                    break;
                case 4:
                    galeria.reproducirGaleria();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
}
