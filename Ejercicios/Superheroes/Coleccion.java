package Superheroes;

import java.util.ArrayList;

public class Coleccion {

      private String nombreColeccion;
      ArrayList<Figura> listaFiguras;

      public Coleccion(String nombreColeccion) {

            this.nombreColeccion = nombreColeccion;
            this.listaFiguras = new ArrayList<>();
      }

      public String getNombreColeccion() {
            String resultado = this.nombreColeccion;
            return resultado;
      }

      public void setNombreColeccion(String nombreColeccion) {
            this.nombreColeccion = nombreColeccion;
      }

      public void anadirFigura(Figura fig) {
            this.listaFiguras.add(fig);
      }

      public void subirPrecio(double cantidad, String id) {
            for (Figura fig : listaFiguras) {
                  if (fig.getCodigo().equals(id)) {
                        fig.subirPrecio(cantidad);
                  }
            }
      }

      public String conCapa() {
            String devolver = "";
            for (Figura fig : listaFiguras) {
                  if (fig.getCaracteristicas().getCapa()) {
                        devolver += fig.toString() + "\n\n";
                  }
            }
            return devolver;
      }

      public Figura masValioso(){
            Figura masValiosa = null;

            if(listaFiguras.size() > 0){
                  masValiosa = listaFiguras.get(0);
            }
            for(Figura fig : listaFiguras){
                  if(fig.getPrecio() > masValiosa.getPrecio()){
                  masValiosa = fig;
                  }
            }
            return masValiosa;
      }
      public double getValorColeccion(){
            double suma = 0;
            for(Figura fig : listaFiguras){
                  suma += fig.getPrecio(); 
            }
            return suma;
      }
      public double getVolumenColeccion(){
            double volumen = 0;
            for(Figura fig : listaFiguras){
                  volumen =  volumen + fig.getDimensiones().getVolumen();                
            }            
            return volumen + 200;
      }

      @Override
      public String toString(){

            String resultado = 
            "Coleccion \n" + nombreColeccion;
            for(Figura fig : listaFiguras){
                  resultado += fig.toString() + "\n----------------------\n";
            }
            return resultado;
      }
}
