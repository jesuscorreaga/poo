package Lampara.Vista;

import Lampara.Modelo.Lampara;

public class Principal {
  public static void main(String[] args) {
    Lampara lamp = new Lampara();

    lamp.setTipo("Techo");
    lamp.setColor("Dorada");
    lamp.setPotencia("50hz");
    lamp.setEncendida(false);

    System.out.println("Lampara de: " + lamp.getTipo() + " de color: " + lamp.getColor() + " con potencia: " + lamp.getPotencia());
    lamp.apagar();
    lamp.encender();
    lamp.cambiarBombillo();
    lamp.apagar();
    lamp.cambiarBombillo();
  }
}
