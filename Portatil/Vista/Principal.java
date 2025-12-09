package Portatil.Vista;

import Portatil.Modelo.Portatil;

public class Principal {
  public static void main(String[] args) {
    Portatil asus = new Portatil();

    asus.setMarca("Asus");
    asus.setMemoria("Memoria RAM 32 GB DDR4");
    asus.setBateria(20);
    asus.setAlmacenamiento("16 gb");
    asus.setEncendido(false);

    System.out.println("Portatil marca: " + asus.getMarca() + " almacenamiento: " + asus.getAlmacenamiento() + " "
        + asus.getMemoria() + " bateria actual: " + asus.getBateria());


    asus.apagar();
    asus.encender();
    asus.cargarBateria(-99);
    asus.cargarBateria(100);
    asus.cargarBateria(20);

  }
}
