package ExamenDanielGuzman.biblioteca.modelos;

public class CD extends RecursoBibliografico {
    private Artista artista;

    public CD(String titulo, int anoPublicacion, Artista artista) {
        super(titulo, anoPublicacion);
        this.artista = artista;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("CD | Título: " + titulo + " | Año: " + anoPublicacion + 
                           " | Artista: " + artista.getNombre() + " | Disponible: " + disponible);
    }
}