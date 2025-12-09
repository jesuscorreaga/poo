package Cancion.Modelo;

public class Cancion {
  private String titulo;
  private String artista;
  private String duracion;
  private String genero;
  private int reproducciones;
  private boolean reproducciendo;

  public Cancion() {
  };

  public Cancion(String tit, String art, String dur, String gen, int rep, boolean repro) {
    this.titulo = tit;
    this.artista = art;
    this.duracion = dur;
    this.genero = gen;
    this.reproducciones = rep;
    this.reproducciendo = repro;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String tit) {
    this.titulo = tit;
  }

  public String getArtista() {
    return this.artista;
  }

  public void setArtista(String art) {
    this.artista = art;
  }

  public String getDuracion() {
    // Puedo convertir esto o formatearlo?
    return this.duracion;
  }

  public void setDuracion(String dur) {
    this.duracion = dur;
  }

  public String getGenero() {
    return this.genero;
  }

  public void setGenero(String gen) {
    this.genero = gen;
  }

  public int getReproducciones() {
    return this.reproducciones;
  }

  public void setReproducciones(int rep) {
    this.reproducciones = rep;
  }

  public void reproducir() {
    this.reproducciendo = true;
    agregarReproducciones();
    System.out.println("Reproduciendo: " + this.titulo);
  }

  public void pausar() {
    if (reproducciendo) {
      reproducciendo = false;
      System.out.println("Pausando: " + this.titulo);
    } else {
      System.out.println("No hay nada reproduciendose.");
    }
  }

  public void agregarReproducciones() {
    this.reproducciones++;
  }

  
}
