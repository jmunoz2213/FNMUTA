package Ejercicio1_2;
public class Ejercicio_1 {

    // Método que recibe un array de cadenas y un carácter, y devuelve cuántas veces aparece ese carácter
    public int obtenerNumVecesCar(String[] arrayCadenas, char caracter) {
        int contador = 0; // Contador de apariciones del carácter

        // Recorremos cada cadena del array
        for (String cadena : arrayCadenas) {
            // Recorremos cada carácter de la cadena actual
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == caracter) {
                    contador++; // Si coincide con el carácter buscado, incrementamos el contador
                }
            }
        }
        return contador; // Devolvemos el total de apariciones
    }

    public static void main(String[] args) {
        // Instanciamos un objeto de la clase
        Ejercicio_1 obj = new Ejercicio_1();

        // Creamos un Strin[] de cadenas de ejemplo, este puede ser modificable
        String[] cadenas = {"hola", "mundo", "caracter", "java"};

        // Definimos el caracter de preferencia del usuario a buscar
        char caracterBuscado = 'a';

        // Llamamos al método y mostramos el resultado
        int resultado = obj.obtenerNumVecesCar(cadenas, caracterBuscado);
        System.out.println("El carácter '" + caracterBuscado + "' aparece " + resultado + " veces.");
    }
}

