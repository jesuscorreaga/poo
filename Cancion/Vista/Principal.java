package Cancion.Vista;

import Cancion.Modelo.Cancion;

public class Principal {
  public static void main(String[] args) {
    Cancion tema = new Cancion();

    tema.setTitulo("Dec 11th.");
    tema.setArtista("Giveon");
    tema.setDuracion("1:14");
    tema.setGenero("R&B");

    System.out.println("El titulo de la canción es: " + tema.getTitulo());
    System.out.println("El artista  es: " + tema.getArtista());
    System.out.println("La duración de la canción  es: " + tema.getDuracion() + " segundos");
    System.out.println("La genero de la canción  es: " + tema.getGenero() + " segundos");
    tema.reproducir();
    System.out.println("La canción se ha reproducido: " + tema.getReproducciones() + " veces");
    tema.pausar();
  

    
  }
}
