// Una planta química registra lecturas de sus tanques cada hora en una lista enlazada para auditoría.

// La Clase Lectura (Nodo): Debe contener idSensor (int), temperatura (double), presion (double) y hora (String).
// El Problema: Las lecturas se van agregando al inicio para que la más reciente sea siempre la primera que vea el supervisor.
// Reto: Implementa un método que busque y muestre la lectura con la temperatura más alta registrada en el historial.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Registro registro = new Registro();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n====================");
            System.out.println("Menú");
            System.out.println("====================");
            System.out.println("1. Agregar lectura");
            System.out.println("2. Mostrar lectura con temperatura más alta");
            System.out.println("0. Salir");
            System.out.println("\n====================");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            System.out.println("====================");
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el id del sensor: ");
                    int idSensor = sc.nextInt();
                    System.out.println("Ingrese la temperatura: ");
                    Double temperatura = sc.nextDouble();
                    System.out.println("Ingrese la presión: ");
                    double presion = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese la hora: ");
                    String hora = sc.nextLine();
                    Lectura newLectura = new Lectura(idSensor, temperatura, presion, hora);
                    registro.agregarLectura(newLectura);
                    System.out.println("\n====================");
                    System.out.println("Lectura agregada exitosamente");

                    break;
                case 2:
                    registro.showHighLectura();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion !=0);
        sc.close();
    }
}
