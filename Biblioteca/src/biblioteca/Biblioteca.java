package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * @author megino
 */
public class Biblioteca {

	private ArrayList<Libro> catalogo;
	private String nombre;
	private int anyoApertura;

	/**
	 * Constructor
	 * 
	 * @param nombre       Nombre de la bibliotecas
	 * @param anyoApertura Año en el que abrio la biblioteca
	 * @since 1.0
	 */
	public Biblioteca(String nombre, int anyoApertura) {
		this.catalogo = new ArrayList<>();
		this.anyoApertura = anyoApertura;
		this.nombre = nombre;
	}

	// Método para añadir un libro al catálogo
	public void agregarLibro(Libro libro) {
		catalogo.add(libro);
	}

	/**
	 * Este metodo está incompleto
	 * 
	 * @param titulo Nombre del libro
	 * @deprecated Este metodo deberia dejar de usarse ya que eciste una version mas
	 *             reciente
	 * @version 1.0
	 */
	public Libro buscarPorTitulo1(String titulo) {
		return null;
	}

	/**
	 * El usuario introduce el titulo de un libro y si existe le devuelve este, si
	 * no imprime un mensaje.
	 * 
	 * @param titulo Nombre del libro
	 * @return Devuelve el libro según el titulo que hayan introducido, si no lo
	 *         encuentra imprime un mensaje.
	 * @version 2.0
	 */
	public Libro buscarPorTitulo(String titulo) {
		boolean libroEncontrado = false;
		if (libroEncontrado) {

			for (Libro libro : catalogo) {
				if (libro.getTitulo().equalsIgnoreCase(titulo)) {
					return libro;
				}
				libroEncontrado = true;
				System.out.println("Libro encontrado");
			}
		} else {
			System.out.println("El libro que buscas no existe.");
		}
		return null;
	}

	/**
	 * El usuario introduce el nombre de un autor y si existe le devuelve un libro.
	 * 
	 * @param autor Nombre del autor de un libro
	 * @return Devuelve el libro según el autor que se haya introducido.
	 * @since 1.0
	 */

	public List<Libro> buscarPorAutor(String autor) {
		List<Libro> librosDelAutor = new ArrayList<>();
		for (Libro libro : catalogo) {
			if (libro.getAutor().equalsIgnoreCase(autor)) {
				librosDelAutor.add(libro);
			}
		}
		return librosDelAutor;
	}

	/**
	 * Método para obtener todos los libros en la biblioteca
	 * 
	 * @return Devuelve el catalogo con todos los libros
	 * @version 2.0
	 */
	public ArrayList<Libro> obtenerTodosLosLibros() {
		return catalogo;
	}

	/**
	 * Muestra la informacion de la Biblioteca
	 * 
	 * @param autor Nombre del autor de un libro
	 * @return Devuelve toda la informacion de la biblioteca
	 * @since 1.0
	 */
	public void infoBoblioteca() {
		System.out.println("Nombre de la biblioteca: " + nombre + " , año de apertura: " + anyoApertura);
	}

	/**
	 * Getter del nombre
	 * 
	 * @return El nombre de la biblioteca
	 * @since 1.0
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Getter del año de apertura
	 * 
	 * @return El año de apertura
	 * @since 1.0
	 */
	public int getAnyoApertura() {
		return anyoApertura;
	}
}
