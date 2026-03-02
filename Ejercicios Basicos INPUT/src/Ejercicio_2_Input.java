// Pide al usuario una temperatura en Celsius y 
// conviértela a Fahrenheit y Kelvin.
// Fórmulas:
// F = (C × 9/5) + 32
// K = C + 273.15
// Dato de entrada: double temperatura en Celsius

import java.util.Scanner;

public class Ejercicio_2_Input {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("La temperatura inicial dada es: " + celsius + " °C");
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura en Kelvin: " + kelvin);

        scanner.close();
    }  
}
