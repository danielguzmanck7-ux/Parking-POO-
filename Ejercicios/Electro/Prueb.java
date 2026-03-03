package Electro;

public class Prueb {

      public static void main(String[] args) {
            
            Electrodomesticos objeto = new Electrodomesticos("", "", 0);
            objeto.setMarca("rasd");
            objeto.setTipo("sef");
            objeto.setPotencia(18.3);

            Electrodomesticos objeto1 = new Electrodomesticos("", "", 0);
            objeto1.setMarca("rasd");
            objeto1.setTipo("sef");
            objeto1.setPotencia(26.5);

            Lavadora rick = new Lavadora(null, 0);
            rick.setAguaCaliente(false);
            rick.setMarca("xs");
            rick.setPotencia(43);
            rick.setPrecio(55.8);
            rick.setTipo("lavadora");

            Lavadora este = new Lavadora(null, 0, 0, false);
            este.setAguaCaliente(true);
            este.setMarca("gap");
            este.setPotencia(46.7);
            este.setPrecio(200);
            este.setTipo("lavadora");

            System.out.print(objeto.toString() + "\n consumo cada 5 horas " + objeto.getConsumo(5) + "\n El coste consumo " + objeto.getCosteConsumo(5, 3.5) + "\n--------siguiente-------");

            System.out.print(objeto1.toString() + "\n consumo cada 5 horas " + objeto1.getConsumo(5) + "\n El coste consumo " + objeto1.getCosteConsumo(5, 2.7) +"\n--------siguiente-------");

            System.out.print(rick.toString() + "\n consumo cada 5 horas " + rick.getConsumo(5)+ "\n El coste consumo " + rick.getCosteConsumo(5, 2.7) + "\n--------siguiente-------");

            System.out.print(este.toString() + "\n consumo cada 5 horas " + este.getConsumo(5)+ "\n El coste consumo " + este.getCosteConsumo(5, 2.7));




      }
}
