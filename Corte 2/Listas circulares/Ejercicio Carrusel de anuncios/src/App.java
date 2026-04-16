// Una tienda tiene una pantalla que muestra anuncios en rotación continua. 
// Cuando termina el último anuncio, vuelve automáticamente al primero.

// La Clase Anuncio (Nodo): Debe contener titulo (String), duracionSegundos (int), 
// vecesRepetido (int) y categoria (String - ej: "Oferta", "Marca", "Evento").
// El Problema: La pantalla necesita saber cuánto tiempo total lleva encendida y 
// cuál es el anuncio que más veces se ha repetido.
// Reto: Implementa el método reproducir(int ciclos) que simule ciclos pasadas 
// completas por todos los anuncios, incrementando vecesRepetido en cada paso e 
// imprimiendo qué anuncio está en pantalla. Al finalizar, muestra el anuncio más 
// repetido y el tiempo total acumulado en pantalla.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Carrusel carrusel = new Carrusel();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            
            System.out.println("\nMENU DE anuncios:");
            System.out.println("========================");
            System.out.println("1. Agregar anuncio");
            System.out.println("2. Reproducir carrusel");
            System.out.println("0. Salir");
            System.out.println("========================");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("========================");

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese el titulo del anuncio: ");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese la duracion del anuncio en segundos: ");
                    int duracion = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la categoria del anuncio: ");
                    String categoria = sc.nextLine();
                    Anuncio anuncio = new Anuncio(titulo, duracion,0,  categoria);
                    carrusel.agregarAnuncio(anuncio);
                    System.out.println("\nAnuncio registrado exitosamente al carrusel.");

                    break;
                
                case 2:

                    System.out.println("Ingrese la cantidad de veces que se va a reproducir los anuncios dentro del carrusel: ");
                    int ciclos = sc.nextInt();
                    carrusel.reproducir(ciclos);

                    break;

                case 0:
                    System.out.println("Saliendo del programa...");

                    break;

                default:
                    System.out.println("Opcion no valida, intentelo nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }
}
