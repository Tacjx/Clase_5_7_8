package src;

public class DescuentoPorcentaje extends Descuento {

	
	public DescuentoPorcentaje() {
		
	}
	
	public double descuento(int precio) {
		double desc=0.21;
		int d=(int) (precio*desc);
		int preciocondesc=precio-d;
		return preciocondesc;
	}

	
	

}
