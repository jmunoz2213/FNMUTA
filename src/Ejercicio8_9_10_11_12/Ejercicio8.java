package Ejercicio8_9_10_11_12;
import java.util.Scanner;

public class Ejercicio8 {

    // Método para leer 10 números ingresados por el usuario
    public int[] leerNumeros() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Ingrese 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        return numeros;
        
    }

    // Método para calcular el promedio
    public double calcularPromedio(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma / 10.0;
    }

    // Método principal
    public static void main(String[] args) {
        Ejercicio8 obj = new Ejercicio8();
        int[] numeros = obj.leerNumeros();
        double promedio = obj.calcularPromedio(numeros);
        System.out.printf("El promedio es: %.2f\n", promedio);
        
    }
}
