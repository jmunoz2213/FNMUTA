package Ejercicio16_17_18_19_20;
import java.util.Scanner;

public class Ejercicio16 {

    // Método para compactar vector moviendo ceros al final
    public void compactarVector(int[] vector) {
        int indice = 0; // Índice para colocar números distintos de cero

        // Recorre y copia los elementos distintos de cero al principio
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != 0) {
                vector[indice] = vector[i];
                indice++;
            }
        }

        // Rellena el resto del vector con ceros
        while (indice < vector.length) {
            vector[indice] = 0;
            indice++;
        }
    }

    // Leer vector desde usuario
    public int[] leerVector() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector:");
        int n = sc.nextInt();
        int[] vector = new int[n];
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
        }
        return vector;
    }

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
        Ejercicio16 obj = new Ejercicio16();
        int[] vector = obj.leerVector();

        obj.compactarVector(vector);

        System.out.println("Vector compactado: ");
        obj.imprimirVector(vector);
    }
}

