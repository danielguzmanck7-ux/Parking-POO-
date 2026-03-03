package Superheroes;

public class SuperHero {

      private String nombre;
      private String descripcion;
      private boolean capa;

      public SuperHero(String nombre) {
            this.nombre = nombre;
            this.descripcion = "";
            this.capa = false;
      }

      public String getNombre() {
            return nombre;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public String getDescripcion() {
            return descripcion;
      }

      public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
      }

      public boolean getCapa() {
            boolean capa = this.capa;
            return capa;
      }

      public void setCapa(boolean capa) {
            this.capa = capa;
      }

      @Override
      public String toString() {

            String resultado = "SuperHeroe " + nombre +
                        "\n Descripcion " + descripcion +
                        "\n Tiene capa " + capa;
            return resultado;
      }
}
