// SESLECTION VS INSERTION

// Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de 
// operaciones para un caso específico.
// Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. 
// El programa aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
// Lógica de Conteo:
// En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
// En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
// Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos 
// hizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado.

import java.util.Scanner;

public class Ejercicio_Ordenamiento_5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 6 numeros enteros desordenados:");
        int[] numeros = new int[6];
        for(int i = 0; i < 6; i++){
            numeros[i] = scanner.nextInt();
        }

        int[] copiaNumeros = numeros.clone();

        System.out.println("Arreglo original:");
        for (int numero: numeros) {
            System.out.println(numero);
        }
        System.out.println("Aplicando Selección...");
        selection(numeros);
        System.out.println("Aplicando Inserción...");
        insertion(copiaNumeros);

        scanner.close();
    }

    public static void selection(int[] arr){

        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int indMin = i;
            for(int j = i+1; j < n; j++){
                if (arr[j] < arr[indMin]) {
                 indMin = j;   
                }
            }

            int temp = arr[indMin];
            arr[indMin] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion(int[] arr){

        int n = arr.length;
        for(int i = 1; i < n; ++i){
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
                System.out.println(arr[j]);
            }
            
            arr[j+1] = key;
        }
    }
}
