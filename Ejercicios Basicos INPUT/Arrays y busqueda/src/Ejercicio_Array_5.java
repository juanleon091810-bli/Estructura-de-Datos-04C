// Un profesor tiene un arreglo con las notas finales de 30 estudiantes (ej: 3.5, 4.0, 2.8, 5.0, ...).

// El Problema: El profesor necesita saber exactamente cuántos estudiantes sacaron una nota de 5.0.
// Algoritmo a usar: Búsqueda Lineal con Contador. 
// Debes recorrer todo el arreglo y, cada vez que encuentres un 5.0, aumentar una variable contador.

public class Ejercicio_Array_5 {
    public static void main(String[] args) {
        int contadorCinco = 0;
        double[] notasFinales = { 3.5, 4.0, 2.8, 5.0, 4.5, 5.0, 3.0, 4.2, 5.0, 3.8,
                                  4.1, 2.9, 5.0, 3.6, 4.8, 5.0, 3.7, 4.3, 2.7, 5.0, 4.9,
                                  3.9, 4.6, 5.0, 3.4, 4.7, 2.6, 5.0, 3.2, 4.4, 5.0, 3.1 };
        for (int i = 0; i < notasFinales.length; i++) {
            if (notasFinales[i] == 5.0) {
                contadorCinco++;
            }
        }
        System.out.println("Número de estudiantes con nota 5.0: " + contadorCinco);
    }
}
