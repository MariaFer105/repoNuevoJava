
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("vero", "Castro", "vero@vero", "verito");
		Administrador adm1 = new Administrador ("alan", "naka", "alan@alan", "verito");
		
		adm1.crearProducto("producto1", 123, "primer producto", 50.00, 10, "mesas");
		adm1.login("vero@vero", "alan");
		adm1.login("alan@alan", "verito");
		
		Producto producto1 = adm1.crearProducto("producto1", 123, "primer producto", 50.00, 10, "mesas");
		Producto producto2 = adm1.crearProducto("producto2", 456, "segundo producto", 30.00, 15, "cuadros");
		Producto producto3 = adm1.crearProducto("producto3", 789, "tercer producto", 80.00, 20, "adornos");
		Producto producto4 = adm1.crearProducto("producto4", 101, "cuarto producto", 10.00, 10, "velas");

		//adm1.eliminarProducto(101);
		//adm1.cambiarPrecio(123, 44.0);
		///adm1.cambiarStock(123, 2);
		cliente1.login("vero@vero", "verito");
		cliente1.agregarUnProductoAlCarrito(producto1, 15);


	}

}
