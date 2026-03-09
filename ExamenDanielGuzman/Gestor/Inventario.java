package ExamenDanielGuzman.Gestor;

import ExamenDanielGuzman.biblioteca.modelos.*;
import java.util.*;

public class Inventario {

      ArrayList<RecursoBibliografico> recurso;

      public Inventario(){
            recurso = new ArrayList<>();
      }

      public ArrayList<RecursoBibliografico> anadirR(RecursoBibliografico re){
            System.out.println("LLego");
 ArrayList<RecursoBibliografico> recurso = new ArrayList<>();
            for(RecursoBibliografico r:recurso){
                  recurso.add(re);
            }
            return recurso;
      }

      public void mostrarR(){
            ArrayList<RecursoBibliografico> recursos= new ArrayList<>();
            for(RecursoBibliografico r:recursos){
                  r.mostrarInformacion();
            }
      }

      public String buscarR(String re){
            String d = " ";
            for(RecursoBibliografico r:recurso){
                  if(r.getTitulo().equals(re))d+=r.toString();
                  else d = "null";
            }
            return d;
      }


}
