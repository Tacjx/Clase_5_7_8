package src;

public class ItemCarrito {
	int cantidad;
	Producto producto;
	
	

	public ItemCarrito(int cantidad, Producto producto) {
		this.cantidad = cantidad;
		this.producto = producto;
	}

	
	
	public int precio() {
		return cantidad * producto.getPrecio();
	}
	
	public int  sumaitem() {
		int item=0;
		return item+1;
	}

}
