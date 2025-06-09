package Ejercicio16_17_18_19_20;
import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();

        int[] vector = new int[n];

        // Pedir elementos al usuario
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            vector[i] = sc.nextInt();
        }

        // Calcular subvector suma máxima
        int[] resultado = subvectorSumaMaxima(vector);

        // Mostrar resultados
        System.out.println("\nSuma máxima: " + resultado[0]);
        System.out.println("Inicio del subvector: " + resultado[1]);
        System.out.println("Fin del subvector: " + resultado[2]);

        sc.close();
    }

    public static int[] subvectorSumaMaxima(int[] v) {
        int maxActual = v[0];
        int maxGlobal = v[0];
        int inicio = 0;
        int inicioTemp = 0;
        int fin = 0;

        for (int i = 1; i < v.length; i++) {
            if (v[i] > maxActual + v[i]) {
                maxActual = v[i];
                inicioTemp = i;
            } else {
                maxActual += v[i];
            }

            if (maxActual > maxGlobal) {
                maxGlobal = maxActual;
                inicio = inicioTemp;
                fin = i;
            }
        }

        return new int[] {maxGlobal, inicio, fin};
    }
}
