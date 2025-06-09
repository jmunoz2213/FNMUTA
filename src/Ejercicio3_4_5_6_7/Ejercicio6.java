package Ejercicio3_4_5_6_7;
public class Ejercicio6 {

    // Cambia el estado (true = desbloqueada, false = bloqueada)
    public void procesarCeldas(boolean[] celdas) {
        int n = celdas.length;

        // Se empieza con todas desbloqueadas, según el enunciado
        for (int i = 0; i < n; i++) {
            celdas[i] = true; // desbloqueada "Afortunado"
        }

        // Para cada pasada desde la 2 hasta n (inclusive)
        for (int paso = 2; paso <= n; paso++) {
            for (int celda = paso - 1; celda < n; celda += paso) {
                celdas[celda] = !celdas[celda]; // Cambiar estado
            }
        }
    }

    // Muestra las celdas desbloqueadas
    public void mostrarCeldasLibres(boolean[] celdas) {
        System.out.print("Prisioneros con celdas desbloqueadas: ");
        boolean primero = true;
        for (int i = 0; i < celdas.length; i++) {
            if (celdas[i]) {
                if (!primero) System.out.print(", ");
                System.out.print(i + 1);
                primero = false;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nCeldas = 10;
        boolean[] celdas = new boolean[nCeldas];

        Ejercicio6 ej = new Ejercicio6();
        ej.procesarCeldas(celdas);
        ej.mostrarCeldasLibres(celdas);
    }
}

