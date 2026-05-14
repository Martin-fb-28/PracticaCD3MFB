package repartoComida;

public abstract class Usuario {
	protected String nombre;
	protected String email;
	protected String telefono;
	
	public String getNombre() {
		return nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public Usuario(String nombreUsuario, String emailUsuario, String telefonoUsuario) {
		this.nombre = nombreUsuario;
		this.email = emailUsuario;
		this.telefono = telefonoUsuario;
	}
	

}
