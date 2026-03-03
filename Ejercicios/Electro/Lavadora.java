package Electro;
public class Lavadora extends Electrodomesticos{

      private double precio;
      private boolean aguaCaliente;

      public Lavadora (String marca, double potencia){
            
            super("lavadora", marca,potencia);
            this.precio = 0;
            this.aguaCaliente = false;
      }

      public Lavadora (String marca, double potencia, double precio, boolean aguaCaliente){
            super("lavadora", marca,potencia);
            this.precio = precio;
            this.aguaCaliente = aguaCaliente;
      }

      public boolean getAguaCaliente(){
            return aguaCaliente;
      }
      public void setAguaCaliente(boolean aguaCaliente){
            this.aguaCaliente = aguaCaliente;
      }
      
      public double getPrecio() {
            return precio;
      }

      public void setPrecio(double precio) {
            this.precio = precio;
      }
      @Override 
      public int getConsumo(int horas){
            int modo;

            if (aguaCaliente = true) {
                  modo = horas * (int)getPotencia();
            } else {
                  modo = horas * (int)(getPotencia()*1.20);
            }
            return modo;
      }


      @Override

      public String toString(){

            String modo;

            if (aguaCaliente=true){
                  modo = " si ";
            }else{
                  modo = "no";
            };

            String devolver = 
            "\n Precio" + precio +
            "\n AguaCaliente" + modo;
            return devolver;
      }





}
