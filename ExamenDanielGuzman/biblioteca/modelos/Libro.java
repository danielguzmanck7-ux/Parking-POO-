package ExamenDanielGuzman.biblioteca.modelos;

public class Libro extends RecursoBibliografico {
    private Autor autor;

    public Libro(String titulo, int anoPublicacion, Autor autor) {
        super(titulo, anoPublicacion);
        this.autor = autor;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("LIBRO | Título: " + titulo + " | Año: " + anoPublicacion + 
                           " | Autor: " + autor.getNombre() + " | Disponible: " + disponible);
    }


}
