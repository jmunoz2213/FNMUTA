package Ejercicio8_9_10_11_12;
import java.util.Scanner;

public class Ejercicio12 {

    // Leer 10 números del usuario
    public int[] leerVector() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        return vector;
    }

    // Detectar y mostrar números duplicados
    public void mostrarDuplicados(int[] vector) {
        boolean hayDuplicados = false;
        boolean[] marcados = new boolean[vector.length];

        System.out.println("Números duplicados encontrados:");
        for (int i = 0; i < vector.length; i++) {
            if (marcados[i]) continue; 
            boolean duplicado = false;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    duplicado = true;
                    marcados[j] = true; 
                }
            }
            if (duplicado) {
                System.out.println(": " + vector[i]);
                hayDuplicados = true;
            }
        }

        if (!hayDuplicados) {
            System.out.println("No hay elementos duplicados.");
        }
    }

    public static void main(String[] args) {
        Ejercicio12 obj = new Ejercicio12();
        int[] vector = obj.leerVector();
        obj.mostrarDuplicados(vector);
    }
}

