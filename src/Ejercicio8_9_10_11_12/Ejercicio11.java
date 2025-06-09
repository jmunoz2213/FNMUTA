package Ejercicio8_9_10_11_12;
import java.util.Scanner;

public class Ejercicio11 {
    // Método para leer 12 números del usuario
    public int[] leerVector() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[12];
        System.out.println("Ingrese 12 números:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        return vector;
    }

    // Método que encuentra el valor máximo y su posición
    public void encontrarMaximo(int[] vector) {
        int max = vector[0];
        int indice = 0;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
                indice = i;
            }
        }

        System.out.println("El valor máximo es: " + max);
        System.out.println("Se encuentra en la posición: " + indice);
    }

    public static void main(String[] args) {
        Ejercicio11 obj = new Ejercicio11();
        int[] vector = obj.leerVector();
        obj.encontrarMaximo(vector);
    }
}

