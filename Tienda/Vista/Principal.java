package Tienda.Vista;

import Tienda.Modelo.Tienda;

public class Principal {
  public static void main(String[] args) {
    Tienda ara = new Tienda();
    ara.setNombre("Ara");
    ara.setDireccion("Calle 8 # 9-10");
    ara.setCategorias("Abarrotes");
    ara.setProductosDisponibles(100);
    ara.setAbierta(false);

    System.out.println("La tienda: " + ara.getNombre() +  " en la dirección: " + ara.getDireccion() + " en la categoría: " + ara.getCategorias() );
    ara.apertura();
    ara.cierre();
    ara.agregarProducto(10);
    ara.venderProducto(90);
    ara.apertura();
    ara.venderProducto(90);
  }
}
