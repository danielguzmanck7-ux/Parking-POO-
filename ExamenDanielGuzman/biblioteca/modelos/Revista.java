package ExamenDanielGuzman.biblioteca.modelos;

public class Revista extends RecursoBibliografico {
    private int numero;

    public Revista(String titulo, int anoPublicacion, int numero) {
        super(titulo, anoPublicacion);
        this.numero = numero;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("REVISTA | Título: " + titulo + " | Año: " + anoPublicacion + 
                           " | Número: " + numero + " | Disponible: " + disponible);
    }
}
