package Impresora.Vista;

import Impresora.Modelo.Impresora;

public class Principal {
  public static void main(String[] args) {
    Impresora imp = new Impresora();

    imp.setMarca("Toshiba");
    imp.setModelo("919-V");
    imp.setPapel(false);
    imp.setTinta(false);

    System.out.println("La impresora de la marca: " + imp.getMarca());
    System.out.println("Modelo:" + imp.getModelo());
    imp.imprimir();
    imp.cargarPapel();
    imp.recargarTinta();
    imp.imprimir();
  }
}
