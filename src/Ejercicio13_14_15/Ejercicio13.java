package Ejercicio13_14_15;
import java.util.Random;

public class Ejercicio13 {

    public static void main(String[] args) {
        int[] vector = new int[10];
        Random rand = new Random();

        // Llenar el vector con números aleatorios entre 0 y 99
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100);
        }

        System.out.println("Vector original:");
        imprimirVector(vector);

        // Ordenar el vector usando Bubble Sort
        bubbleSort(vector);

        System.out.println("\nVector ordenado:");
        imprimirVector(vector);
    }

    // Método para imprimir el vector
    public static void imprimirVector(int[] v) {
        for (int num : v) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método que implementa el algoritmo Bubble Sort
    public static void bubbleSort(int[] v) {
        int n = v.length;
        boolean intercambio;

        // Recorremos el vector tantas veces como elementos tiene
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;  // Variable para detectar si hubo intercambio en esta pasada

            // Comparamos elementos adyacentes y los intercambiamos si están en el orden incorrecto
            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    // Intercambiar elementos
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    intercambio = true;
                }
            }

            // Si no hubo intercambios en la pasada, el vector ya está ordenado
            if (!intercambio) {
                break;
            }
        }
    }
}
