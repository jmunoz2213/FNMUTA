package Ejercicio3_4_5_6_7;
import java.util.Scanner;

public class Ejercicio7 {

    // Verifica si dos palabras son anagramas
    public boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) return false;

        int[] letras = new int[26];

        for (int i = 0; i < palabra1.length(); i++) {
            letras[palabra1.charAt(i) - 'a']++;
            letras[palabra2.charAt(i) - 'a']--;
        }

        for (int c : letras) {
            if (c != 0) return false;
        }

        return true;
    }

    // Verifica si una palabra tiene solo letras minúsculas
    public boolean esMinuscula(String palabra) {
        for (char c : palabra.toCharArray()) {
            if (c < 'a' || c > 'z') return false;
        }
        return true;
    }

    // Procesa las entradas del usuario
    public void procesarEntrada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce líneas con dos palabras en minúsculas separadas por espacio. Escribe 'fin' para salir:");

        while (true) {
            String linea = sc.nextLine().trim();
            if (linea.equalsIgnoreCase("fin")) break;

            String[] partes = linea.split(" ");
            if (partes.length != 2) {
                System.out.println("Entrada inválida: debes escribir exactamente dos palabras.");
                continue;
            }

            String palabra1 = partes[0];
            String palabra2 = partes[1];

            if (!esMinuscula(palabra1) || !esMinuscula(palabra2)) {
                System.out.println("Error: Solo se permiten letras minúsculas.");
                continue;
            }

            if (palabra1.equals(palabra2)) {
                System.out.println("Error: No se puede ingresar dos veces la misma palabra.");
                continue;
            }

            System.out.print(palabra1 + " " + palabra2 + ": ");
            if (sonAnagramas(palabra1, palabra2)) {
                System.out.println("La segunda palabra es un anagrama de la primera.");
            } else {
                System.out.println("La segunda palabra no es un anagrama de la primera.");
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        Ejercicio7 ej = new Ejercicio7();
        ej.procesarEntrada();
    }
}
