package Ejercicio16_17_18_19_20;
import java.util.Scanner;

public class Ejercicio19 {

    public int encontrarModa(int[] vector) {
        int moda = vector[0];
        int maxConteo = 0;

        for (int i = 0; i < vector.length; i++) {
            int conteo = 0;
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == vector[i]) {
                    conteo++;
                }
            }
            if (conteo > maxConteo) {
                maxConteo = conteo;
                moda = vector[i];
            }
        }
        return moda;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio19 obj = new Ejercicio19();

        System.out.print("Ingresa el tamaño del vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        System.out.println("Ingresa los " + n + " números enteros:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        int moda = obj.encontrarModa(vector);
        System.out.println("Moda: " + moda);

        scanner.close();
    }
}

