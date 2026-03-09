package ExamenesPasados.Ejercicios.Examen;

import java.time.LocalDate;

public class Revista extends RecursosB {

      private int numero;

      public Revista(String titulo,LocalDate anoPublicacion,boolean disponible,int numero){
            
            super(titulo,anoPublicacion,disponible);
            this.numero=numero;
      }

      public Revista(String string, int i, int j) {
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

      public void setTitulo(String titulo) {
            this.titulo = titulo;
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
