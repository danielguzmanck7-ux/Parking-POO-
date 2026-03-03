package ExamenesPasados.Examen;

import java.time.LocalDate;

public abstract class RecursosB implements Prestable{

      protected String titulo;
      protected LocalDate anoPublicacion;
      protected boolean disponible;

      public RecursosB(String titulo,LocalDate anoPublicacion,boolean disponible){

            this.titulo=titulo;
            this.anoPublicacion=anoPublicacion;
            this.disponible=disponible;

      }

      @Override
      public void prestar() throws BiblioException{
            if (this.disponible = false){
                  throw new BiblioException("No puede llevarlo no ta ");
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

      public abstract void mostrarInformacion();

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
