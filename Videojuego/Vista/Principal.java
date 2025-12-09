package Videojuego.Vista;

import Videojuego.Modelo.Videojuego;

public class Principal {
  public static void main(String[] args) {
    Videojuego juego = new Videojuego();
    juego.setTitulo("Final Fantasy VII");
    juego.setGenero("RPG");
    juego.setPlataforma("PS1");
    juego.setProgreso(0);
    juego.jugar();
    juego.guardarProgreso();
    juego.actualizarPuntaje(100);
  }
}
