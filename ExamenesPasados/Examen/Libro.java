package ExamenesPasados.Examen;

import java.time.LocalDate;

public class Libro extends RecursosB {

      private String autor;

      public Libro(String titulo,LocalDate anoPublicacion,boolean disponible,String autor){
            
            super(titulo,anoPublicacion,disponible);
            this.autor=autor;
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
      public void mostrarInformacion(){
                  String devolver = 
                  "\n ----------------------" +
                  "\n El titulo " +titulo+
                  "\n El anoPublicacion " +anoPublicacion+
                  "\n Disponible- " +disponible+
                  "\n El autor "  +autor+
                  "\n ----------------------"
                              ;
                              System.out.println(devolver); 
            }

      

}
