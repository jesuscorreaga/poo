package Botella.Vista;

import Botella.Modelo.Botella;

public class Principal {
  public static void main(String[] args) {
    Botella vino = new Botella();

    vino.setCapacidad(1000);
    vino.setAbierta(false);
    vino.setContenido("Vino blanco");
    vino.setNivel(1000);

    System.out.println("La botella es de: " + vino.getContenido() + " tiene una capacidad de " + vino.getCapacidad()
        + " ml y un nivel actual de: " + vino.getNivel());

    vino.abrir();
    vino.cerrar();
    vino.servir();
    vino.abrir();
    vino.servir();
    vino.llenar(100);
  }
}
