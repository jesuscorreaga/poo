package Mascota.Vista;

import Mascota.Modelo.Mascota;

public class Principal {
  public static void main(String[] args) {
    Mascota mas = new Mascota();
    mas.setNombre("Chundulu");
    mas.setEspecie("Perro");
    mas.setRaza("Bulldog Ingles");
    mas.setEdad("3 años");
    mas.setVacunas(false);

    System.out.println("La mascota con nombre " + mas.getNombre() + " especie: " + mas.getEspecie() + " y raza " + mas.getRaza() + " de " + mas.getEdad());

    mas.alimentar();
    mas.vacunar();
    mas.vacunar();
    mas.jugar();
  }
}
