package Servicios;

import java.time.LocalDate;

public class TrabajoPintura extends Servicios {

      private double superficie;
      private double precioPintura;

      TrabajoPintura(String trabajador, String cliente, LocalDate inicio, double superficie, double precioPintura){
            super( trabajador,  cliente, inicio);
            this.superficie = superficie;
            this.precioPintura = precioPintura;
      }

      public double getSuperficie() {
            return superficie;
      }
      public void setSuperficie(double superficie) {
            this.superficie = superficie;
      }
      public double getPrecioPintura() {
            return precioPintura;
      }
      public void setPrecioPintura(double precioPintura) {
            this.precioPintura = precioPintura;
      }

      @Override
      public double costeMaterial( ){
            double suma = (superficie / 7.8) * precioPintura;
            return suma;
      }

      @Override
      public double costeManoObra(){
            double suma = (superficie / 10) * 9.5;
            return suma; 
      }

      @Override
      public double costeTotal(){
            return costeManoObra() + costeMaterial();
      }

      @Override
      public String detalleServicio(){

            double adicional = 0;
            
            String devolver = 
                        "\n TRABAJO DE PINTURA " + 
                        "\n Cliente: " +getCliente()+
                        "\n Fecha de inicio: " +getInicio()+
                        "----------------------------------------" +
                        "\n Pintor: " + getTrabajador() +
                        "Coste Material..... " + costeMaterial()+
                        "\n Coste Mano Obra.... " +costeManoObra()+
                        "\n Coste Adicional .... " + adicional +
                        "\n TOTAL: ............ " +costeTotal()+
                        "----------------------------------------"
                        ;
                        return devolver;
      }
}
