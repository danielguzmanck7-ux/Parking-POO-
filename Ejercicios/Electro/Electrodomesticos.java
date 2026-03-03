package Electro;
public class Electrodomesticos {

      private String tipo;
      private String marca;
      private double potencia;

      public Electrodomesticos(String tipo, String marca, double potencia){
            this.tipo = tipo;
            this.marca = marca;
            this.potencia = potencia;
      }

      public double getPotencia(){
            return potencia;
      }
      public void setPotencia(double potencia){
            this.potencia = potencia;
      }
      
      public String getMarca() {
            return marca;
      }

      public void setMarca(String marca) {
            this.marca = marca;
      }
      
      public String getTipo() {
            return tipo;
      }

      public void setTipo(String tipo) {
            this.tipo = tipo;
      }

      @Override
      public String toString(){
            String devolver = 
            "\n El tipo " + tipo +
            "\n la marca "+ marca +
            "\n la potencia " + potencia +
            " en kw \n"
            ;
            return devolver;
      }

      public int getConsumo(int horas){
            return horas *= (int)this.potencia;
      }

      public int getCosteConsumo(int horas, double costeHoras){
            horas = getConsumo(horas);
            return horas *= (int)costeHoras;
      }



}
