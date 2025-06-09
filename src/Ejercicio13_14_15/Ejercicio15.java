package Ejercicio13_14_15;
import java.util.Scanner;

public class Ejercicio15 {

    // Método para verificar si un vector es "pico"
    public boolean esPico(int[] vector) {
        if (vector.length < 3) return false; // Necesita al menos 3 elementos para ser pico

        int i = 0;

        // Subir estrictamente
        while (i + 1 < vector.length && vector[i] < vector[i + 1]) {
            i++;
        }

        // El pico no puede estar ni al inicio ni al final
        if (i == 0 || i == vector.length - 1) {
            return false;
        }

        // Bajar estrictamente
        while (i + 1 < vector.length && vector[i] > vector[i + 1]) {
            i++;
        }

        // Si llegamos al final, es pico
        return i == vector.length - 1;
    }

    // Leer vector desde el usuario
    public int[] leerVector() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int n = sc.nextInt();
        int[] vector = new int[n];
        System.out.println("Ingrese los números del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        return vector;
    }

    public static void main(String[] args) {
        Ejercicio15 obj = new Ejercicio15();
        int[] vector = obj.leerVector();

        if (obj.esPico(vector)) {
            System.out.println("El vector es un pico.");
        } else {
            System.out.println("El vector no es un pico.");
        }
    }
}

