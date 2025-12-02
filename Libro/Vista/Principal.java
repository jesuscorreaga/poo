package Libro.Vista;

import Libro.Modelo.Libro;

public class Principal {
  public static void main(String[] args) {
    Libro lib = new Libro();
    lib.setTitulo("La casa en el confin de la tierra");
    lib.setAutor("William Hope Hodgson");
    lib.setEditorial("Valdemar");
    lib.setISBN("893");
    lib.setNPag(256);
    lib.setLeido(false);
    lib.setNPagXleer(0);
    lib.setPagMarcada(0);
    lib.setPrestado(false);
    lib.setEnPosesion(false);

    System.out.println("El libro: " + lib.getTitulo());
    System.out.println("Escrito por: " + lib.getAutor());
    System.out.println("De la editorial: " + lib.getEditorial());
    System.out.println("Con el ISBN: " + lib.getEditorial());
    System.out.println("Con un total de páginas de: " + lib.getEditorial());
    lib.leer(100);
    System.out.println("Páginas por leidas: " + lib.getPagXLeer());
    lib.marcarPagina(99);
    System.out.println("Pagína marcada: " + lib.getPagMarcada());
    lib.prestar();
    lib.leer(156);
    System.out.println("Páginas por leidas: " + lib.getPagXLeer());
    lib.devolver();

  }
}
