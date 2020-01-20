

public class Cliente extends Usuario{
	private Carrito carrito;
	
	

	public Cliente(String nombre, String apellido, String email, String password, Carrito carrito) {
		super(nombre, apellido, email, password);
		this.carrito = carrito;
	}



	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}







	

	
	

	
	

}
