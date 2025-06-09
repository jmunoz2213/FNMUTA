package Ejercicio3_4_5_6_7;
import java.util.Random;

public class Ejercicio5 {
    // Simula un grupo de 23 personas y devuelve true si hay cumpleaños repetido
    public boolean hayCumpleaniosRepetido(int nPersonas, int diasAno, Random rand) {
        boolean[] dias = new boolean[diasAno]; // Marca días ocupados
        for (int i = 0; i < nPersonas; i++) {
            int dia = rand.nextInt(diasAno); // Día aleatorio entre 0 y 364
            if (dias[dia]) {
                return true; // Ya había alguien con ese día
            }
            dias[dia] = true;
        }
        return false; // No hubo repetidos
    }

    // Simula 500 grupos y cuenta cuántos tienen cumpleaños repetidos, se puede cambiar a preferencia del usuario
    public void simularGrupos(int nGrupos, int nPersonas, int diasAno) {
        Random rand = new Random();
        int gruposConRepetidos = 0;

        for (int i = 0; i < nGrupos; i++) {
            if (hayCumpleaniosRepetido(nPersonas, diasAno, rand)) {
                gruposConRepetidos++;
            }
        }
        double probabilidad = (gruposConRepetidos * 100.0) / nGrupos;

        System.out.println("De " + nGrupos + " grupos de " + nPersonas + " personas:");
        System.out.println("Grupos con al menos 2 personas con el mismo cumpleaños: " + gruposConRepetidos);
        System.out.printf("Probabilidad estimada: %.2f%%\n", probabilidad);
    }

    public static void main(String[] args) {
        Ejercicio5 ej = new Ejercicio5();
        //Datos modificables por parte del usuario y sus preferencias
        int nGrupos = 500;
        int nPersonas = 23;
        int diasAno = 365;
        ej.simularGrupos(nGrupos, nPersonas, diasAno);
    }
}

