package Supers;

public class Detergente implements EsLiquido, ConDescuento{

      private String marca;
      private double precio;
      private double volumen;
      private String tipoEnvase;
      private double descuento;

      public Detergente(String marca, double precio){
            this.marca = marca;
            this.precio = precio;
            this.volumen = 0;
            this.tipoEnvase = "";
            this.descuento = 0;
      }

      public double getPrecio (){
            return precio;
      }
      public void setPrecio(double precio){
            this.precio = precio;
      }
      
      public String getMarca() {
            return marca;
      }

      public void setMarca(String marca) {
            this.marca = marca;
      }

      public void setVolumen(double v){
            this.volumen = v;
      }

      public double getVolumen(){
            return volumen;
      }

      public void setTipoEnvase(String env){
            this.tipoEnvase = env;
      }

      public String getTipoEnvase(){
            return tipoEnvase;
      }

      public void setDescuento(double desc){
            this.descuento = desc;
      }

      public double getDescuento(){
            return descuento;
      }

      public double getPrecioDescuento(){
            return this.precio - (this.precio*descuento/100);
      }

      @Override 
      public String toString(){
            String devolver = 
            "\n Volumen " + volumen +
            "\n Tipo " + tipoEnvase + 
            "\n Descuento " + descuento +
            "\n Marca " +marca +
            "\n Precio " +precio;
            return devolver;
      }


}
