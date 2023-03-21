package src;

public class Descuento {
	public Descuento() {
	}

	public double descuento(int precio) {
		double desc=0.21;
		int d=(int) (precio*desc);
		int preciocondesc=precio-d;
		return preciocondesc;
	}


}
