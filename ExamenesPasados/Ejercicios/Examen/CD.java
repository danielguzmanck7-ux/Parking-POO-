package ExamenesPasados.Ejercicios.Examen;

import java.time.LocalDate;

public class CD extends RecursosB{

      private String artista;

      public CD(String titulo,LocalDate anoPublicacion,boolean disponible,String artista){
            
            super(titulo,anoPublicacion,disponible);
            this.artista=artista;
      }

      public CD(String string, int i, Artista theBeatles) {
            //TODO Auto-generated constructor stub
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

      @Override
      public void setTitulo(String titulo) {
            this.titulo = titulo;
      }

      @Override
      public void prestar() throws BiblioException{
            if (disponible = false){
                  throw new BiblioException("No puede llevarlo no ta ");
            }

            setDisponible(false);
            

      }

      public void devolver() throws BiblioException{
            if (this.disponible = true){
                  throw new BiblioException("No puede devolverlo ya esta aqui ");
            }
            setDisponible(true);
      }

      @Override
      public void mostrarInformacion() {
            String devolver = 
                        "\n ----------------------" +
                        "\n El titulo " + titulo +
                        "\n El anoPublicacion " + anoPublicacion +
                        "\n Disponible- " + disponible +
                        "\n El artista " + artista +
                        "\n ----------------------";
            System.out.println(devolver);
      }

}
