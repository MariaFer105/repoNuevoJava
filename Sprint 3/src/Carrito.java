import java.util.Date;
import java.util.List;

public class Carrito {
	private Integer numero;
	private Cliente cliente;
	private Date fecha;
	private List <Producto> listaDeProductosAComprar;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public List<Producto> getListaDeProductosAComprar() {
		return listaDeProductosAComprar;
	}
	public void setListaDeProductosAComprar(List<Producto> listaDeProductosAComprar) {
		this.listaDeProductosAComprar = listaDeProductosAComprar;
	}
	
	
	public Double sumarCarrito (List<Producto> listaDeProductosAComprar) {
		Double suma = 0.0;
    	for (Integer i = 0 ; i < listaDeProductosAComprar.size(); i++) {
    		suma = suma + listaDeProductosAComprar.get(i).getPrecio();
    	}
        return suma;
    }
	
	public void agregarUnProductoAlCarrito (Producto unProducto, Integer cantidadAComprar) {
			if( unProducto.getCantidadEnStock() >= cantidadAComprar) {
				Integer nuevoStock = unProducto.getCantidadEnStock()-cantidadAComprar;
				unProducto.setCantidadEnStock(nuevoStock);
				listaDeProductosAComprar.add(unProducto);
				System.out.println("Se agregaron "+ cantidadAComprar + " del producto " + unProducto.getNombre() + " a la lista de productos a comprar");
			}else {
			System.out.println("No hay suficiente stock del Producto");
			}
		}
	
	
	
	}
	
	
	
	
	

