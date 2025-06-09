package Ejercicio3_4_5_6_7;
import java.util.Random;

public class Ejercicio3 {

    public void simularProceso(int n, int m) {
        if (!validarSolicitudes(n, m)) {
            return;
        }

        boolean[] habitaciones = new boolean[n]; // false = libre, true = ocupada

        ocuparHabitacionesAleatorias(habitaciones, m);
        buscarPrimeraDisponible(habitaciones);

        System.out.println("-------------------------------");
        mostrarEstado(habitaciones);
    }

    // Validar si se pueden hacer las reservas solicitadas
    public boolean validarSolicitudes(int n, int m) {
        if (m > n) {
            System.out.println("Error: Se solicitaron " + m + " habitaciones pero solo hay " + n + " disponibles.");
            System.out.println("No se pueden realizar más ocupaciones que habitaciones disponibles.\n");
            return false;
        }
        return true;
    }

    // Ocupa habitaciones aleatoriamente
    public void ocuparHabitacionesAleatorias(boolean[] habitaciones, int m) {
        Random rand = new Random();
        int ocupadas = 0;

        while (ocupadas < m) {
            int habitacion = rand.nextInt(habitaciones.length);

            if (!habitaciones[habitacion]) {
                habitaciones[habitacion] = true;
                ocupadas++;
            }
        }
        System.out.println();
        System.out.println("--Sistema de hoteleria: reserva de habitaciones.--");
        System.out.println();
        System.out.println("Se han ocupado " + ocupadas + " habitaciones exitosamente.\n");
        System.out.println();
    }

    // Buscar la primera habitación libre después de las reservas
    public void buscarPrimeraDisponible(boolean[] habitaciones) {
        for (int i = 0; i < habitaciones.length; i++) {
            if (!habitaciones[i]) {
                System.out.println();
                System.out.println("La primera habitación libre encontrada tras las reservas es la: " + i + "\n");
                return;
            }
        }
        System.out.println();
        System.out.println("No quedan habitaciones libres tras las reservas.\n");
    }

    // Mostrar el estado final de ocupadas y cantidad de libres
    public void mostrarEstado(boolean[] habitaciones) {
        System.out.println();
        System.out.print("Habitaciones ocupadas: ");
        System.out.println();
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        int libres = 0;
        System.out.println();
        System.out.print("Habitaciones disponibles: ");
        System.out.println();
        for (int i = 0; i < habitaciones.length; i++) {
            if (!habitaciones[i]) {
                System.out.print(i + " ");
                libres++;
            }
        }

        if (libres == 0) {
            System.out.println();
            System.out.print("Ninguna");
            System.out.println();
        }
        System.out.println();
        System.out.println("\nHabitaciones disponibles tras las reservas: " + libres + "\n");
        System.out.println();
    }

    public static void main(String[] args) {
        Ejercicio3 obj = new Ejercicio3();
        /*Apartado donde el usuario puede elejir a su preferencia */
        int n = 13; // Total de habitaciones
        int m = 9;  // Número de ocupaciones solicitadas

        obj.simularProceso(n, m);
    }
}
