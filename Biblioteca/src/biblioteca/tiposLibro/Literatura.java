package biblioteca.tiposLibro;

import biblioteca.Libro;

/**
 * @author megin
 */
public class Literatura extends Libro {

	private String genero;

	/**
	 * Constructor
	 * 
	 * @param titulo          titulo del libro
	 * @param autor           nombre del autor del libro
	 * @param anyoPublicacion año de publicacion del libro
	 * @param genero          genero del comic
	 * @since 3.0
	 */
	public Literatura(String titulo, String autor, int añoPublicacion, String genero) {
		super(titulo, autor, añoPublicacion);
		this.genero = genero;
	}

	/**
	 * Getter del genero
	 * 
	 * @return El genero de literatura
	 * @since 3.0
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Setter del genero
	 * 
	 * @param genero genero de literatura
	 * @since 3.0
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Muestra toda la informacion del comic
	 * 
	 * @since 3.0
	 */
	public void mostrarInformacionLiteratura() {
		System.out.println("Título: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Año de publicación: " + getAnyoPublicacion());
		System.out.println("Género: " + genero);
	}

}
