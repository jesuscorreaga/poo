package Factura.Vista;

import Factura.Modelo.Factura;

public class Principal {
  public static void main(String[] args) {
    Factura fact = new Factura();
    fact.setNumero("1");
    fact.setCliente("Jesús Correa");
    fact.setFecha("8/12/2025");
    fact.setTotal(180000);

    System.out.println("La factura es la # " + fact.getNumero());
    System.out.println("El cliente es: " + fact.getCliente());
    System.out.println("La fecha de pago es: " + fact.getFecha());
    fact.pagar(180000);
  }
}
