


public class Producto {
	private String nombre;
	private Integer codigo;
	private String descripcion;
	private Double precio;
	private Integer cantidadEnStock;
	private String categoria;

	
	
	//Constructor

	public Producto(String nombre, Integer codigo, String descripcion, Double precio, Integer cantidadEnStock,
			String categoria) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidadEnStock = cantidadEnStock;
		this.categoria = categoria;
	}
	//Getters
	
	public String getNombre() {
		return nombre;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public Integer getCantidadEnStock() {
		return cantidadEnStock;
	}
	public String getCategoria() {
		return categoria;
	}
	
	
// Setters
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public void setCantidadEnStock(Integer cantidadEnStock) {
		this.cantidadEnStock = cantidadEnStock;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	public boolean equals(Object productoAcomparar)
	{
		Boolean sonIguales = false;
		
		Producto productoAComparar = (Producto) productoAcomparar;
		
		if(this.codigo.equals(productoAComparar.codigo)) {
			sonIguales = true;
		}
		
		return sonIguales;
	}
	
	

	// Metodo que consulta si el Producto tiene Stock disponible
	public Boolean tieneStockDisponible(Integer cantidadAVender) {
		return cantidadAVender <= cantidadEnStock;
	}
	

	

}
