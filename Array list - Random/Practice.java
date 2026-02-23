import java.util.ArrayList;
import java.util.Random;

public class Practice {

    public static void main(String[] args) {

        ArrayList<Integer> lista = crearListaAleatoria();

        // Mostrar el contenido del ArrayList
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posición " + i + ": " + lista.get(i));
        }
    }

    public static ArrayList<Integer> crearListaAleatoria() {

        Random random = new Random();

        // Generar longitud aleatoria entre 6 y 100 (ambos incluidos)
        int longitud = random.nextInt(95) + 6;

        ArrayList<Integer> lista = new ArrayList<Integer>();

        // Rellenar el ArrayList con valores entre -10 y 10
        for (int i = 0; i < longitud; i++) {
            int numero = random.nextInt(21) - 10;
            lista.add(numero);
        }

        return lista;
    }
}

