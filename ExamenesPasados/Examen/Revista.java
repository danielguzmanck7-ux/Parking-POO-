package ExamenesPasados.Examen;

import java.time.LocalDate;

public class Revista extends RecursosB implements Prestable {

      private int numero;

      public Revista(String titulo,LocalDate anoPublicacion,boolean disponible,int numero){
            
            super(titulo,anoPublicacion,disponible);
            this.numero=numero;
      }

      public String getTitulo() {
            return titulo;
      }

      public boolean getDisponible() {
            return disponible;
      }

      public void setAnoPublicacion(LocalDate anoPublicacion) {
            this.anoPublicacion = anoPublicacion;
      }

      public void setDisponible(boolean disponible) {
            this.disponible = disponible;
      }

      public void setTitulo(String titulo) {
            this.titulo = titulo;
      }

      @Override
      public void prestar() throws BiblioException{
            if (this.disponible = true){
                  throw new BiblioException("No puede llevarlo no esta aqui ");
            }
            setDisponible(false);

      }

      @Override
      public void devolver() throws BiblioException{
            if (this.disponible = true){
                  throw new BiblioException("No puede devolverlo ya esta aqui ");
            }
            setDisponible(true);
      }

      @Override
      public void mostrarInformacion() {
            String devolver = "\n ----------------------" +
                        "\n El titulo " + titulo +
                        "\n El anoPublicacion " + anoPublicacion +
                        "\n Disponible- " + disponible +
                        "\n El numero " + numero +
                        "\n ----------------------";
            System.out.println(devolver);
      }
}
