package Superheroes;

public class Figura {
      private String codigo;
      private double precio;
      private Dimension dimensiones;
      private SuperHero caracteristicas;

      public Figura(String codigo, double precio, Dimension dimensiones, SuperHero caracteristicas) {
            this.codigo = codigo;
            this.precio = precio;
            this.dimensiones = dimensiones;
            this.caracteristicas = caracteristicas;
      }

      public String getCodigo() {
            return codigo;
      }

      public void setCodigo(String codigo) {
            this.codigo = codigo;
      }

      public double getPrecio() {
            return precio;
      }

      public void setPrecio(double precio) {
            this.precio = precio;
      }

      public Dimension getDimensiones() {
            Dimension resultado = this.dimensiones;
            return resultado;
      }

      public void setDimensiones(Dimension dimensiones) {
            this.dimensiones = dimensiones;
      }

      public SuperHero getCaracteristicas() {
            return caracteristicas;
      }

      public void setCaracteristicas(SuperHero caracteristicas) {
            this.caracteristicas = caracteristicas;
      }

      public void comprobarCodigo(String codigo) throws FiguraException {
            if (this.codigo.equals(codigo)) {
                  throw new FiguraException(" Codigo repetido ", codigo);
            }
      }

      public void subirPrecio(double cantidad) {
            cantidad += this.precio;
      }

      @Override
      public String toString() {
            String devolver = "\n Codigo " + codigo +
                        " \n Precio " + precio +
                        " \n Dimensiones " + dimensiones.toString() +
                        " \n Caracteristicas " + caracteristicas.toString();

            return devolver;
      }
}
