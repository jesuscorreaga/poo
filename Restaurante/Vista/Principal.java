package Restaurante.Vista;

import Restaurante.Modelo.Restaurante;

public class Principal {
  public static void main(String[] args) {
    Restaurante res = new Restaurante();
    res.setNombre("Mi tierra querida");
    res.setEspecialidad("Comida rapida");
    res.setUbicacion("Barrio la estrella");
    res.setCalificacion(1);

    res.actualizarCalificacion(5);
    res.atenderCliente();
    res.atenderCliente();
    res.cambiarMenu("Hamburguesa");
  }
}
