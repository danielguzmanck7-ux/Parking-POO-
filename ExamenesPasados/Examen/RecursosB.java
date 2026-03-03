package ExamenesPasados.Examen;

import java.time.LocalDate;

public abstract class RecursosB {

      protected String titulo;
      protected LocalDate anoPublicacion;
      protected boolean disponible;

      public RecursosB(String titulo,LocalDate anoPublicacion,boolean disponible){

            this.titulo=titulo;
            this.anoPublicacion=anoPublicacion;
            this.disponible=disponible;

      }

      public abstract  void mostrarInformacion();

      public LocalDate getAnoPublicacion() {
            return anoPublicacion;
      }
      public String getTitulo() {
            return titulo;
      }
      public boolean getDisponible(){
            return disponible;
      }
      public void setAnoPublicacion(LocalDate anoPublicacion) {
            this.anoPublicacion = anoPublicacion;
      }public void setDisponible(boolean disponible) {
            this.disponible = disponible;
      }public void setTitulo(String titulo) {
            this.titulo = titulo;
      }

}
