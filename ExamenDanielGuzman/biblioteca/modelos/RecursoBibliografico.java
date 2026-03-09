package ExamenDanielGuzman.biblioteca.modelos;

import ExamenDanielGuzman.biblioteca.excepciones.*;
import ExamenDanielGuzman.biblioteca.interfaces.*;

public abstract class RecursoBibliografico implements Prestable {
    protected String titulo;
    protected int anoPublicacion;
    protected boolean disponible;

    public RecursoBibliografico(String titulo, int anoPublicacion) {
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.disponible = true; // Por defecto, al crearlo está disponible
    }
    public String getTitulo() {
          return titulo;
    }

    // Método abstracto que cada hijo debe personalizar
    public abstract void mostrarInformacion();

    // Implementación de la interfaz Prestable
    @Override
    public void prestar() throws RecursoException {
        if (!disponible) {
            throw new RecursoException("El recurso '" + titulo + "' no está disponible para préstamo en este momento.");
        }
        disponible = false;
        System.out.println("Se ha prestado con éxito: " + titulo);
    }

    @Override
    public void devolver() throws RecursoException {
        if (disponible) {
            throw new RecursoException("El recurso '" + titulo + "' ya se encuentra en la biblioteca (no estaba prestado).");
        }
        disponible = true;
        System.out.println("✅ Se ha devuelto con éxito: " + titulo);
    }
}
