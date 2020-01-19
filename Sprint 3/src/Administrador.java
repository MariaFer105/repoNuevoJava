import java.util.ArrayList;
import java.util.List;


public class Administrador extends Usuario {
	
	

	public Administrador(String nombre, String apellido, String email, String password) {
		super(nombre, apellido, email, password);
		// TODO Auto-generated constructor stub
	}
	
	
	// Crear un nuevo producto en el ECOMMERCE
	public Producto crearProducto (String unNombre, Integer unCodigo, String unaDescripcion, Double unPrecio, Integer unaCantidadEnStock, String unaCategoria) {
		if(this.getEstadoDeConexion()==true) {
		Producto unProductoNuevo = new Producto (unNombre, unCodigo, unaDescripcion, unPrecio, unaCantidadEnStock, unaCategoria);
		System.out.println("Se creo el producto "+ unProductoNuevo.getNombre()+ " con un precio " + unProductoNuevo.getPrecio() + " Y una cantidad de " + unProductoNuevo.getCantidadEnStock());
		return unProductoNuevo;
		} else {
			System.out.println("Debe iniciar sesion para administrar stock");
			return null;
		}
	}
	
	
	//Buscar el producto en la lista de producto creados, esta funcion me va a servir para luego eliminar el producto, o modificarlo
	
	private Producto buscarProducto(Integer codigo) {
        Producto productoBuscado = null;
            if (productoBuscado.getCodigo().equals(codigo)) {
        }
        return productoBuscado;
    }
	
	
	//Eliminar el producto del ECOMMERCE
	//public void eliminarProducto (Integer codigo) {
		//if(this.getEstadoDeConexion() == true) {
		//Producto productoEncontrado = buscarProducto (codigo);
		//Producto productoAEliminar = productoEncontrado;
		//productosEnStock.remove(productoAEliminar);
		//System.out.println("Se elimino al producto " + productoAEliminar.getNombre());
		//}else {
		//	System.out.println("Debe iniciar sesion para administrar stock");
		//}
	//}
	
	//Cambiar el precio del producto
	public void cambiarPrecio(Producto unProducto,Double nuevoPrecio) {
		if(this.getEstadoDeConexion()==true) {
		System.out.println("Se modificara el precio del producto " + unProducto.getNombre() + " el precio a modificar es " + unProducto.getPrecio());
		unProducto.setPrecio(nuevoPrecio);
		System.out.println("El nuevo precio es "+ unProducto.getPrecio());
		}else {
			System.out.println("Debe iniciar sesion para administrar stock");
		}
	}
	
	//Cambiar el stock del producto
	
	public void cambiarStock (Producto unProducto, Integer nuevoStock) {
		if(this.getEstadoDeConexion()== true) {
		System.out.println("Se modificara la cantidad del producto " + unProducto.getNombre() + " la cantidad actual es " + unProducto.getCantidadEnStock());
		unProducto.setCantidadEnStock(nuevoStock);
		System.out.println("La nueva cantidad es "+ unProducto.getCantidadEnStock());
		}else {
			System.out.println("Debe iniciar sesion para administrar stock");
		}
	}
	
	
	
	
}

	

