package Ejercicio16_17_18_19_20;
public class Ejercicio18 {

    public void eliminarNumero(int[] vector, int num) {
        int indiceInsertar = 0; // Donde se colocan los números diferentes de num

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != num) {
                vector[indiceInsertar] = vector[i];
                indiceInsertar++;
            }
        }

        // Rellenar el resto con ceros
        for (int i = indiceInsertar; i < vector.length; i++) {
            vector[i] = 0;
        }
    }

    public void imprimirVector(int[] vector) {
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Ejercicio18 obj = new Ejercicio18();

        int[] vector = {2, 3, 5, 3, 7, 3, 9};
        System.out.print("Original: ");
        obj.imprimirVector(vector);

        int numAEliminar = 3;
        obj.eliminarNumero(vector, numAEliminar);

        System.out.print("Después de eliminar " + numAEliminar + ": ");
        obj.imprimirVector(vector);
    }
}


