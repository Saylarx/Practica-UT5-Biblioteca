package biblioteca;

public class Usuario {
	private String nombre;
	private String apellido;
	private String correoElectronico;

	// Constructor
	public Usuario(String nombre, String apellido, String correoElectronico) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
	}

	// Métodos getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	// Método para solicitar un libro de la biblioteca
	public void solicitarLibro(Biblioteca biblioteca, String titulo) {
		Libro libro = biblioteca.buscarPorTitulo(titulo);
		// Por terminar
	}
}
