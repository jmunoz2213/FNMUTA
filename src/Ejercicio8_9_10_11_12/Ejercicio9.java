package Ejercicio8_9_10_11_12;
import java.util.Scanner;

public class Ejercicio9 {

    // Método para leer 15 números del usuario
    public int[] leerNumeros() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];
        System.out.println("Ingrese 15 números enteros:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        return numeros;
    }

    // Método para contar cuántas veces aparece un número en el vector
    public int contarOcurrencias(int[] vector, int numeroBuscado) {
        int contador = 0;
        for (int num : vector) {
            if (num == numeroBuscado) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Ejercicio9 obj = new Ejercicio9();
        Scanner sc = new Scanner(System.in);

        int[] vector = obj.leerNumeros();

        System.out.print("Ingrese un número para buscar cuántas veces aparece: ");
        int buscado = sc.nextInt();

        int ocurrencias = obj.contarOcurrencias(vector, buscado);
        System.out.println("El número " + buscado + " aparece " + ocurrencias + " veces.");
    }
}

