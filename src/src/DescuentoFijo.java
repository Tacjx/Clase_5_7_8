package src;

public class DescuentoFijo extends Descuento {
private int descfijo;

	
	public DescuentoFijo() {}

	
	public int fijo(int precio) {
		int desc=precio-descfijo;
		return desc;
	}

}
