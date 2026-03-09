package ExamenDanielGuzman.biblioteca.interfaces;

import ExamenDanielGuzman.biblioteca.excepciones.RecursoException;

public interface Prestable {
    // Métodos que deberán implementar o heredar las clases
    void prestar() throws RecursoException;
    void devolver() throws RecursoException;
}


