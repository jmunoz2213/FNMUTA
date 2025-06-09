package Ejercicio3_4_5_6_7;
import java.util.Scanner;

public class Ejercicio4 {

    // Contar letras de un texto dado
    public int[] contarLetras(String texto) {
        int[] contador = new int[26]; // Para letras a-z
        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                contador[ch - 'a']++;
            }
        }
        return contador;
    }

    // Calcular frecuencia relativa en porcentaje
    public double[] calcularFrecuenciaRelativa(int[] conteo) {
        double[] frecuencia = new double[26];
        int total = 0;
        for (int c : conteo) {
            total += c;
        }
        if (total == 0) return frecuencia;

        for (int i = 0; i < 26; i++) {
            frecuencia[i] = (conteo[i] * 100.0) / total;
        }
        return frecuencia;
    }

    // Mostrar los resultados
    public void mostrarFrecuencias(double[] frecuencia) {
        for (int i = 0; i < frecuencia.length; i++) {
            char letra = (char) (i + 'a');
            System.out.printf("Letra %c: %.2f%%\n", letra, frecuencia[i]);
        }
    }

    // Main para leer frase del usuario y procesar
    public static void main(String[] args) {
        Ejercicio4 obj = new Ejercicio4();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe cualquier frase:");
        String texto = scanner.nextLine();

        int[] conteo = obj.contarLetras(texto);
        double[] frecuencia = obj.calcularFrecuenciaRelativa(conteo);
        obj.mostrarFrecuencias(frecuencia);

        scanner.close();
    }
}


