package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Libro> catalogo;
	private String nombre;
	private int anyoApertura;

	// Constructor
	public Biblioteca(String nombre, int anyoApertura) {
		this.catalogo = new ArrayList<>();
		this.anyoApertura = anyoApertura;
		this.nombre = nombre;
	}

	// Método para añadir un libro al catálogo
	public void agregarLibro(Libro libro) {
		catalogo.add(libro);
	}

	// Método para buscar un libro por título
	public Libro buscarPorTitulo(String titulo) {
		boolean libroEncontrado = false;
		// A completar
		return null; // Si no se encuentra el libro
	}

	// Método para buscar libros por autor
	public ArrayList<Libro> buscarPorAutor(String autor) {
		ArrayList<Libro> librosDelAutor = new ArrayList<>();
		// Se completara proximamente
		return librosDelAutor;
	}

	// Método para obtener todos los libros en la biblioteca
	public ArrayList<Libro> obtenerTodosLosLibros() {
		return catalogo;
	}

	// Muestra la informacion de la Biblioteca
	public void infoBoblioteca() {
		System.out.println("Nombre de la biblioteca: " + nombre + " , año de apertura: " + anyoApertura);
	}

	public String getNombre() {
		return nombre;
	}

	public int getAnyoApertura() {
		return anyoApertura;
	}
}
