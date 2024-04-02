package biblioteca;

/**
 * @author megin
 */
public class Usuario {
	private String nombre;
	private String apellido;
	private String correoElectronico;

	/**
	 * Constructor
	 * 
	 * @param nombre            nombre del usuario
	 * @param apellido          apellido del usuario
	 * @param correoElectronico correo electronico del usuario
	 * @since 2.0
	 */
	public Usuario(String nombre, String apellido, String correoElectronico) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
	}

	// Métodos getter y setter

	/**
	 * Getter del nombre
	 * 
	 * @return El nombre del usuario
	 * @since 2.0
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre
	 * 
	 * @param nombre nombre del usuario
	 * @since 2.0
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del apellido
	 * 
	 * @return El apellido del usuario
	 * @since 2.0
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Setter del apellido
	 * 
	 * @param apellido apellido del usuario
	 * @since 2.0
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Getter del correo electronico
	 * 
	 * @return El correo electronico del usuario
	 * @since 2.0
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * Setter del apellido
	 * 
	 * @param correoElectronico correo electronico del usuario
	 * @since 2.0
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * Método para solicitar un libro de la biblioteca
	 * 
	 * @param biblioteca ArrayList de la biblioteca con los libros
	 * @param titulo     titulo del libro
	 * @since 2.0
	 */
	public void solicitarLibro(Biblioteca biblioteca, String titulo) {
		Libro libro = biblioteca.buscarPorTitulo(titulo);
		if (libro != null) {
			System.out.println("El libro '" + titulo + "' ha sido solicitado por " + nombre + " " + apellido + ".");
		} else {
			System.out.println("El libro '" + titulo + "' no se encuentra disponible en la biblioteca.");
		}
	}
}
