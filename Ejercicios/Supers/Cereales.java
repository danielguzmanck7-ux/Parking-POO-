package Supers;

import java.time.LocalDate;

public class Cereales implements EsAlimento{

      private String marca;
      private double precio;
      private String tipo;
      private LocalDate caducidad;

      public Cereales(String marca, double precio, String tipo){
            this.marca = marca;
            this.precio = precio;
            this.tipo = tipo;
      }

      public void setMarca(String marca) {
            this.marca = marca;
      }
      public String getMarca(){
            return marca;
      }
      public void setPrecio(double precio){
            this.precio = precio;
      }
      public double getPrecio(){
            return precio;
      }
      public void setTipo(String tipo){
            this.tipo = tipo;
      }
      public String getTipo(){
            return tipo;
      }

      public void setCaducidad(LocalDate fc){
            this.caducidad = fc;
      }
      
      public LocalDate getCaducidad(){
            return caducidad;
      }
      
      public int getCalorias() {
            return switch (tipo.toLowerCase()) {

                  /*esta seria la formaen laque realmente lo haria pero la otra esta mas guay 

                   * case "espelta" -> calorias = 5;
                   * case "maiz" -> calorias = 8;
                   * case "trigo" -> calorias = 12;
                   * default -> calorias = 15;
                   * 
                   * return calorias
                   */
                  case "espelta" -> 5;
                  case "maiz" -> 8;
                  case "trigo" -> 12;
                  default -> 15;
            };
      }

      @Override
      public String toString(){
            String devolver = 
      "\n Marca " + marca + 
      "\n Precio " + precio +
      "\n Tipo " + tipo +
      "\n Caducidad " + caducidad +
      "\n calorias "+ getCalorias();
            return devolver;
      }
}
