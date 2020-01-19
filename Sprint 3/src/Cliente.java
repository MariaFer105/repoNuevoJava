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
			if( unProducto.getCantidadEnStock() >= cantidadAComprar) {
				Integer nuevoStock = unProducto.getCantidadEnStock()-cantidadAComprar;
				unProducto.setCantidadEnStock(nuevoStock);
				carrito.add(unProducto);
				System.out.println("Se agregaron "+ cantidadAComprar + " del producto " + unProducto.getNombre() + " a la lista de productos a comprar");
			}else {
			System.out.println("No hay suficiente stock del Producto");
			}
		}else {
			System.out.println("Debe iniciar sesion para comprar");
		}
	}
	

	
	

	
	

}
