// Imagina un navegador donde puedes moverte entre pestañas abiertas.

// La Clase Pestana (Nodo): Debe contener tituloPagina (String), url (String) 
// y horaApertura (String).
// El Problema: Las pestañas se abren una tras otra. A veces el usuario quiere 
// cerrar la pestaña actual y el foco debe pasar a la pestaña anterior.
// Reto: Implementar el método cerrarPestanaActual(String url) que busque la pestaña 
// por URL, la elimine de la lista y reconecte el nodo anterior con el siguiente correctamente 
// (¡Cuidado con la Cabeza y la Cola!).

import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Navegador navegador = new Navegador();
        int opcion;

        do {
            System.out.println("SISTEMA DE NAVEGADOR DE PESTAÑAS");
            System.out.println("\n1. Abrir Pestaña");
            System.out.println("2. Cerrar Pestaña Actual");
            System.out.println("0. Salir");
            System.out.println("================================");
            System.out.println("Seleccione una opcoin: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("================================");

            switch (opcion) {
                case 1:
                    
                    System.out.println("ingrese el titulo de la pagina: ");
                    String tituloPagina = sc.nextLine();
                    System.out.println("ingrese la url de la pagina: ");
                    String url = sc.nextLine();
                    System.out.println("ingrese la hora de apertura de la pagina: ");
                    String horaApertura = sc.nextLine();
                    Pestana pestana = new Pestana(tituloPagina, url, horaApertura);
                    navegador.nuevaPestana(pestana);
                    break;

                    case 2:
                    System.out.println("ingrese la url de la pestaña a cerrar: ");
                    String urlCerrar = sc.nextLine();
                    navegador.cerrarPestanaActual(urlCerrar);
                    break;
                    
                    case 0:
                        System.out.println("Saliendo del programa...");
            
                default:
                    System.out.println("Opcion invalida, por favor intente de nuevo.");
                    break;
            }
            
        } while (opcion != 0);
        sc.close();
    }
}
