package src;

public class DescuentoTope extends Descuento {
	double porcentaje; //ejemplo 0.10=10 por ciento
	int tope;
	
	public DescuentoTope() {
		
	}
	public DescuentoTope(double porcentaje, int tope) {
		this.porcentaje=porcentaje;
		this.tope=tope;
	}

	
	public int desc(int precio) {
		if(precio-precio*porcentaje<tope) {
			return (int) (precio-precio*porcentaje);
		}else {
			return 0;
		}
		
	}
}
