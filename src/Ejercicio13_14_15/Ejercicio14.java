package Ejercicio13_14_15;
import java.util.Scanner;

public class Ejercicio14 {

    // Método para encontrar la suma máxima de un subvector contiguo
    public int sumaMaximaSubvector(int[] vector) {
        int maxActual = vector[0];
        int maxGlobal = vector[0];

        for (int i = 1; i < vector.length; i++) {
            maxActual = Math.max(vector[i], maxActual + vector[i]);
            if (maxActual > maxGlobal) {
                maxGlobal = maxActual;
            }
        }
        return maxGlobal;
    }

    // Leer vector del usuario
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
        Ejercicio14 obj = new Ejercicio14();
        int[] vector = obj.leerVector();
        int resultado = obj.sumaMaximaSubvector(vector);
        System.out.println("La suma máxima de un subvector contiguo es: " + resultado);
    }
}
