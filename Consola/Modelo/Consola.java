package Consola.Modelo;

public class Consola {

    private String marca;
    private String modelo;
    private int almacenamiento;
    private int juegosInstalados;
    private boolean encendida;

    
    public Consola() {

    }

  
    public Consola(String marca, String modelo, int almacenamiento, int juegosInstalados, boolean encendida) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.juegosInstalados = juegosInstalados;
        this.encendida = encendida;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAlmacenamiento() {
        return this.almacenamiento;
    }

    public int getJuegosInstalados() {
        return this.juegosInstalados;
    }

    public boolean isEncendida() {
        return this.encendida;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setJuegosInstalados(int juegosInstalados) {
        this.juegosInstalados = juegosInstalados;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }


    public void instalarJuego() {
        this.juegosInstalados++;
        System.out.println("Se instaló un nuevo juego. Total instalados: " + this.juegosInstalados);
    }

    public void eliminarJuego() {
        if (this.juegosInstalados > 0) {
            this.juegosInstalados--;
            System.out.println("Se eliminó un juego. Total restante: " + this.juegosInstalados);
        } else {
            System.out.println("No hay juegos instalados para eliminar.");
        }
    }

    public void encender() {
        if (!this.encendida) {
            this.encendida = true;
            System.out.println("La consola se encendió.");
        } else {
            System.out.println("La consola ya está encendida.");
        }
    }

   
    public void apagar() {
        if (this.encendida) {
            this.encendida = false;
            System.out.println("La consola se apagó.");
        } else {
            System.out.println("La consola ya está apagada.");
        }
    }
}
