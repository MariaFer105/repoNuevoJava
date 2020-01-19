import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{
	private List<Producto> carrito;
	
	public Cliente(String nombre, String apellido, String email, String password) {
		super(nombre, apellido, email, password);
		carrito = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	


	public void agregarUnProductoAlCarrito (Producto unProducto, Integer cantidadAComprar) {
		if (this.getEstadoDeConexion() == true) {
		unProducto.venderUnProducto(cantidadAComprar);
		carrito.add(unProducto);
		System.out.println("Se agregaron "+ cantidadAComprar + " del producto " + unProducto + " a la lista de productos a comprar");
		}else {
			System.out.println("Debe iniciar sesion para comenzar a comprar");
		}
	}

	
	

	
	

}
