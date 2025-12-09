package Consola.Vista;

import Consola.Modelo.Consola;

public class Principa {
  public static void main(String[] args) {

  
    Consola consola = new Consola("Sony", "PS5", 825, 3, false);

    
    System.out.println("Marca: " + consola.getMarca());
    System.out.println("Modelo: " + consola.getModelo());
    System.out.println("Almacenamiento: " + consola.getAlmacenamiento() + " GB");
    System.out.println("Juegos Instalados: " + consola.getJuegosInstalados());
    System.out.println("¿Encendida? " + (consola.isEncendida() ? "Sí" : "No"));


    consola.encender();
    consola.instalarJuego();
    consola.instalarJuego();
    consola.eliminarJuego();
    consola.apagar();

    System.out.println("Juegos instalados finales: " + consola.getJuegosInstalados());
    System.out.println("¿Encendida? " + (consola.isEncendida() ? "Sí" : "No"));
  }
}
