package biblioteca;

/**
 * @author megino
 */
public class Libro {
	private String titulo;
	private String autor;
	private int anyoPublicacion;

	/**
	 * Constructor
	 * 
	 * @param titulo          titulo del libro
	 * @param autor           nombre del autor del libro
	 * @param anyoPublicacion año de publicacion del libro
	 * @since 1.0
	 */
	public Libro(String titulo, String autor, int anyoPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anyoPublicacion = anyoPublicacion;
	}

	/**
	 * Este metodo actualiza el año de la publicacion de un libro y enseña un
	 * mensaje con esta nueva fecha
	 * 
	 * @param nuevoAnyo El nuevo año introducido por el usuario
	 * @since 2.0
	 */
	public void actualizarAñoPublicacion(int nuevoAnyo) {
		anyoPublicacion = nuevoAnyo;
		System.out.println("El año de publicación del libro '" + titulo + "' ha sido actualizado a " + anyoPublicacion);
	}

	// Métodos getter y setter

	/**
	 * Getter del titulo
	 * 
	 * @return El titulo del libro
	 * @since 1.0
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Setter del titulo
	 * 
	 * @param titulo titulo del libro
	 * @since 1.0
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Getter del autor
	 * 
	 * @return El nombre del autor del libro
	 * @since 1.0
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Setter del autor
	 * 
	 * @param autor nombre del autor del libro
	 * @since 1.0
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Getter del titulo
	 * 
	 * @return La feca de la publicacion del libro
	 * @since 1.0
	 */
	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	/**
	 * Setter del año de publicacion
	 * 
	 * @param anyoPublicacion Año de publicacion del libro
	 * @since 1.0
	 */
	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}
}
