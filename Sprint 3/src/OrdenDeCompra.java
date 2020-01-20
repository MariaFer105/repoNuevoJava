import java.util.Date;
import java.util.List;

public class OrdenDeCompra {
	private Integer numeroDeOrden;
	private Cliente cliente;
	private Date fecha;
	private Double totalFactura;
	private List<Producto> listaDeProductos;
	public Integer getNumeroDeOrden() {
		return numeroDeOrden;
	}
	public void setNumeroDeOrden(Integer numeroDeOrden) {
		this.numeroDeOrden = numeroDeOrden;
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
	public Double getTotalFactura() {
		return totalFactura;
	}
	public void setTotalFactura(Double totalFactura) {
		this.totalFactura = totalFactura;
	}
	public List<Producto> getListaDeProductos() {
		return listaDeProductos;
	}
	public void setListaDeProductos(List<Producto> listaDeProductos) {
		this.listaDeProductos = listaDeProductos;
	}
	
	
	
	
}
