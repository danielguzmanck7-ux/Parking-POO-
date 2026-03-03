package Servicios;

import java.time.LocalDate;

public abstract class Servicios {

      private String trabajador; 
      private LocalDate inicio;
      private String cliente;

      public Servicios (String trabajador, String cliente, LocalDate inicio){
            this.trabajador = trabajador;
            this.inicio = inicio;
            this.cliente = cliente;
      }

      public void setCliente(String cliente) {
            this.cliente = cliente;
      }
      public void setInicio(LocalDate inicio) {
            this.inicio = inicio;
      }
      public void setTrabajador(String trabajador) {
            this.trabajador = trabajador;
      }
      public String getCliente() {
            return cliente;
      }
      public LocalDate getInicio() {
            return inicio;
      }
      public String getTrabajador() {
            return trabajador;
      }

      public abstract double costeMaterial();
      
      public abstract double costeManoObra();

      public abstract double costeTotal();

      public abstract String detalleServicio();

}
