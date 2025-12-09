package Videojuego.Modelo;

public class Videojuego {
  private String titulo;
  private String genero;
  private String plataforma;
  private int puntaje;
  private String jugadores;
  private int progreso;

  public Videojuego() {

  }

  public Videojuego(String tit, String gen, String plat, int punt, String jug, int progreso) {

    this.titulo = tit;
    this.genero = gen;
    this.plataforma = plat;
    this.puntaje = punt;
    this.jugadores = jug;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String tit) {
    this.titulo = tit;
  }

  public String getGenero() {
    return this.genero;
  }

  public void setGenero(String gen) {
    this.genero = gen;
  }

  public String getPlataforma() {
    return this.plataforma;
  }

  public void setPlataforma(String plat) {
    this.plataforma = plat;
  }

  public int getPuntaje() {
    return this.puntaje;
  }

  public void setPuntaje(int punt) {
    this.puntaje = punt;
  }

  public int getProgreso() {
    return this.progreso;
  }

  public void setProgreso(int progreso) {
    this.progreso = progreso;
  }

  public String getJugadores() {
    return this.jugadores;
  }

  public void setJugadores(String jug) {
    this.jugadores = jug;
  }

  public void jugar() {
    System.out.println("Jugando: " + this.titulo + " en la plataforma: " + this.plataforma);
  }

  public void guardarProgreso() {
    if (this.progreso < 100) {
      this.progreso += 20;
      if (this.progreso > 100) {
        this.progreso = 100;
      }
      System.out.println("Progreso guardado: " + this.progreso + "% en el juego " + this.titulo);
    } else {
      System.out.println("El progreso ya está completado al 100%.");
    }
  }

  public void actualizarPuntaje( int nuevoPuntaje){
    if ( nuevoPuntaje > this.puntaje) {
      this.puntaje = nuevoPuntaje;
      System.out.println("El nuevo puntaje es: " + this.puntaje);
    } else {
      System.out.println("El puntaje no supera al actual. Se mantiene en: " + this.puntaje);
    }
  }

}
