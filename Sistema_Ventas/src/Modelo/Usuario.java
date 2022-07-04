package Modelo;

public class Usuario {
	
	// Atributos
	private int idUsuario;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String usuario;
	private String password;
	private int telefono;
	private int estado_activacion;
	private int tipo_usuario;
	private String correo_electronico;
	
	//Constructor
	public Usuario () {
		this.setIdUsuario(0);
		this.setNombre("");
		this.setApellido_paterno("");
		this.setApellido_materno("");
		this.setUsuario("");
		this.setPassword("");
		this.setTelefono(0);
		this.setCorreo_electronico("");
		this.setTipo_usuario(0);
		this.setEstado(0);
	}
	
	//setters and getters
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	
	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getEstado() {
		return estado_activacion;
	}

	public void setEstado(int estado) {
		this.estado_activacion = estado;
	}
	
	public int getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}


	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	
}
