package Pelota.Vista;

import Pelota.Modelo.Pelota;

public class Principal {
  public static void main(String[] args) {
    Pelota pel = new Pelota();

    pel.setTipo("Futbol");
    pel.setColor("Negro");
    pel.setDiametro(250);
    pel.setPeso(400);
    pel.setEUso("Nueva");

    System.out.println("Tipo: " + pel.getTipo());
    System.out.println("Color: " + pel.getColor());
    System.out.println("Diametro: " + pel.getDiametro());
    System.out.println("Peso: " + pel.getPeso());
    System.out.println("Estado: " + pel.getEUso());
    pel.inflar(100);
    pel.desinflar(400);
    pel.botar();
  }
}
