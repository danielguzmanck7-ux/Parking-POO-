package Supers;

import java.time.LocalDate;

public class Vino implements EsLiquido, EsAlimento, ConDescuento {

      private String marca;
      private String tipo;
      private double precio;
      private double grados;
      private LocalDate caducidad;
      private double volumen;
      private String tipoEnvase;
      private double descuento;
      private int calorias;

      public Vino (String marca,  String tipo,  double precio, double grados){     
      this.marca = marca;
      this.tipo = tipo;
      this.precio = precio;
      this.grados = grados;
      }

      public String getMarca (){
            return marca;
      }
      public void setMarca(String marca){
            this.marca = marca;
      }
      
      public String getTipo() {
            return tipo;
      }
      
      public void setTipo(String tipo) {
            this.tipo = tipo;
      }

      public double getPrecio() {
            return precio;
      }
      
      public void setPrecio(double precio) {
            this.precio = precio;
      }

      public double getGrados() {
            return grados;
      }
      
      public void setGrados(double grados) {
            this.grados = grados;
      }

      public void setVolumen(double v) {
            this.volumen = v;
      }

      public double getVolumen() {
            return volumen;
      }

      public void setTipoEnvase(String env) {
            this.tipoEnvase = env;
      }

      public String getTipoEnvase() {
            return tipoEnvase;
      }

      public void setDescuento(double desc) {
            this.descuento = desc;
      }

      public double getDescuento() {
            return descuento;
      }

      public double getPrecioDescuento() {
            return this.precio - (this.precio * descuento / 100);
      }

      public void setCaducidad(LocalDate fc) {
            this.caducidad = fc;
      }

      public LocalDate getCaducidad() {
            return caducidad;
      }

      public int getCalorias() {
            return calorias;
      }
      public void setCalorias(int grados){
            this.calorias = grados*10;
      }
      
      @Override
      public String toString() {
            String devolver = 
                  "\n Marca " + marca +
                  "\n Precio " + precio +
                  "\n Tipo " + tipo +
                  "\n Caducidad " + caducidad +
                  "\n calorias " + getCalorias()+
                  "\n Volumen " + volumen +
                  "\n Tipo " + tipoEnvase +
                  "\n Descuento " + descuento +          
                  "\n Marca " + marca +
                 "\n Precio " + precio;
            return devolver;
      }
      

}
