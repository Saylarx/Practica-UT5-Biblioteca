package biblioteca.tiposLibro;

import biblioteca.Libro;

/**
 * @author megin
 */
public class Comic extends Libro {
	
	//los comics tan bien

	private String ilustrador;

	/**
	 * Constructor
	 * 
	 * @param titulo titulo del libro
	 * @param autor nombre del autor del libro
	 * @param anyoPublicacion año de publicacion del libro
	 * @param ilustrador ilustrador del comic
	 * @since 3.0
	 */
    public Comic(String titulo, String autor, int añoPublicacion, String ilustrador) {
        super(titulo, autor, añoPublicacion);
        this.ilustrador = ilustrador;
    }

    /**
	 * Getter del ilustrador
	 * 
	 * @return El ilustrador del comic
	 * @since 3.0
	 */
    public String getIlustrador() {
        return ilustrador;
    }

    /**
	 * Setter del ilustrador
	 * 
	 * @param ilustrador ilustrador del comic
	 * @since 3.0
	 */
    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }

	/**
	 * Muestra toda la informacion del comic
	 * 
	 * @since 3.0
	 */
    public void mostrarInformacionComic() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año de publicación: " + getAnyoPublicacion());
        System.out.println("Ilustrador: " + ilustrador);
    }
}

