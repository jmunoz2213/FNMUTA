package Ejercicio16_17_18_19_20;
import java.util.Scanner;

public class Ejercicio17 {

    // Método que hace merge de dos vectores ordenados
    public int[] mergeVectores(int[] v1, int[] v2) {
        int n1 = v1.length;
        int n2 = v2.length;
        int[] resultado = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (v1[i] <= v2[j]) {
                resultado[k++] = v1[i++];
            } else {
                resultado[k++] = v2[j++];
            }
        }

        // Copiar el resto de v1 si hay
        while (i < n1) {
            resultado[k++] = v1[i++];
        }

        // Copiar el resto de v2 si hay
        while (j < n2) {
            resultado[k++] = v2[j++];
        }

        // Ordenar el resultado para asegurar orden ascendente
        ordenarBurbuja(resultado);

        return resultado;
    }

    // Método burbuja para ordenar un vector de enteros
    public void ordenarBurbuja(int[] vector) {
        int n = vector.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }

    // Método para leer vector desde usuario
    public int[] leerVector(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int n = sc.nextInt();
        int[] vector = new int[n];
        System.out.println("Ingrese los elementos: ");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
        }
        return vector;
    }

    // Método para imprimir vector
    public void imprimirVector(int[] vector) {
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Ejercicio17 obj = new Ejercicio17();

        int[] v1 = obj.leerVector("Ingrese tamaño del primer vector:");
        int[] v2 = obj.leerVector("Ingrese tamaño del segundo vector:");

        int[] resultado = obj.mergeVectores(v1, v2);

        System.out.println("Vector resultado del merge ordenado:");
        obj.imprimirVector(resultado);
    }
}

