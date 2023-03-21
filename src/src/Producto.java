package src;

public class Producto {
	String nombre;
	int precio;

	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getPrecio() {
		return precio;
	}

}
