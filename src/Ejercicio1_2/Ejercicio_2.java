package Ejercicio1_2;
public class Ejercicio_2 {

    // Método que ordena un array de cadenas alfabéticamente ignorando mayúsculas y minúsculas
    public String[] obtenerArrayOrdAlfab(String[] arrayCadenas) {
        int n = arrayCadenas.length;

        // Algoritmo de burbuja para ordenar
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparamos ignorando mayúsculas/minúsculas
                if (arrayCadenas[j].compareToIgnoreCase(arrayCadenas[j + 1]) > 0) {
                    // Intercambiamos si están en el orden incorrecto
                    String temp = arrayCadenas[j];
                    arrayCadenas[j] = arrayCadenas[j + 1];
                    arrayCadenas[j + 1] = temp;
                }
            }
        }

        return arrayCadenas; // Retornamos el array ya ordenado
    }

    public static void main(String[] args) {
        // Instanciamos un objeto de la clase
        Ejercicio_2 obj = new Ejercicio_2();

        // Creamos un array de cadenas de ejemplo, modificable por el usuario
        String[] ciudades = {"ALBACETE", "antonio", "BURGOS", "Sandro", "MIGUEL"};

        // Ordenamos el array
        String[] ordenadas = obj.obtenerArrayOrdAlfab(ciudades);

        // Mostramos el resultado
        System.out.println("Cadenas ordenadas alfabéticamente:");
        for (String ciudad : ordenadas) {
            System.out.println(ciudad);
        }}}

