
public abstract class Usuario {
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	private Boolean estadoDeConexion = false;
	
	//Constructor	
	public Usuario(String nombre, String apellido, String email, String password) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
	}

	//Getters y Setters
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getEstadoDeConexion() {
		return estadoDeConexion;
	}
	public void setEstadoDeConexion(Boolean estadoDeConexion) {
		this.estadoDeConexion = estadoDeConexion;
	}

	
	
	public boolean equals(Object usuarioAcomparar)
	{
		Boolean sonIguales = false;
		
		Usuario usuarioAComparar = (Usuario) usuarioAcomparar;
		
		if(this.email.equals(usuarioAComparar.email)) {
			sonIguales = true;
		}
		
		return sonIguales;
	}
	
	
	//Loguearse
	
	public void login (String unEmail, String unaPassword) {
		if (this.email.equals(unEmail)&& this.password.equals(unaPassword)){
			this.estadoDeConexion = true;
			System.out.println("Se inició sesion");
		}else {
			System.out.println("Usuario y/o constraseña incorrectas");
		}
	}
	
	//Desloguearse
	public void logout () {
		if(this.estadoDeConexion == true) {
			this.estadoDeConexion = false;
		System.out.println("Sesion finalizada");
		}
	}
	

	

}
