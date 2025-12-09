package Helado.Vista;

import Helado.Modelo.Helado;

public class Principal {
  public static void main(String[] args) {
    Helado hel = new Helado("Vainilla", "Grande", 9000, "Congelado"){};
    System.out.println(hel.getSabor());
    System.out.println(hel.getTamano());
    System.out.println(hel.getPrecio());
    System.out.println(hel.getEstado());

    hel.cambiarSabor("Chocolate");
    
  }
}
