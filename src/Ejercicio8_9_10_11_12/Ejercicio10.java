package Ejercicio8_9_10_11_12;
import java.util.Scanner;

public class Ejercicio10 {

    // Método para leer 8 números del usuario
    public int[] leerVector() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[8];
        System.out.println("Ingrese 8 números:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        return vector;
    }

    // Método que invierte los elementos del vector
    public void invertirVector(int[] vector) {
        int n = vector.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = vector[i];
            vector[i] = vector[n - 1 - i];
            vector[n - 1 - i] = temp;
        }
    }

    // Método para mostrar el vector
    public void mostrarVector(int[] vector) {
        System.out.print("Vector: ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ejercicio10 obj = new Ejercicio10();
        int[] vector = obj.leerVector();

        System.out.println("Vector original:");
        obj.mostrarVector(vector);

        obj.invertirVector(vector);

        System.out.println("Vector invertido:");
        obj.mostrarVector(vector);
    }
}
