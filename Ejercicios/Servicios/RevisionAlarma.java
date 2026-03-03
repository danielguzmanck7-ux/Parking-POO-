package Servicios;

import java.time.LocalDate;

public class RevisionAlarma extends Servicios{

      private int nAlarmas;

      public RevisionAlarma(String cliente, LocalDate inicio, int nAlarmas){

            super("Revisor especialista Incendios", cliente, inicio);
            this.nAlarmas = nAlarmas;
      }

      public void setnAlarmas(int nAlarmas) {
            this.nAlarmas = nAlarmas;
      }
      public int getnAlarmas() {
            return nAlarmas;
      }

      @Override
      public  double costeMaterial(){
            return 0;
      }

      @Override
      public  double costeManoObra(){
            return (this.nAlarmas / 3) * 40;
      }

      @Override
      public  double costeTotal(){
            return costeManoObra();
      }

      @Override
      public  String detalleServicio(){

            String resultado = 
            "\nREVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS" +
            "\nCliente: "  +getCliente()+
            "\nFecha revisión: " +getInicio()+
            "----------------------------------------" +
            "\nTOTAL: ......." + costeTotal()+
            "--------------------------------------";
            return resultado;
      }

}
