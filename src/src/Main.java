package src;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
	
	public static void main(String[] args) throws IOException {
		String archivo = new File("C:\\Users\\Usuario\\Desktop\\Git\\productos.txt").getAbsolutePath();

		Carrito carrito1 = new Carrito();
		
		//no se como hacerlo -_-

		for (String linea : Files.readAllLines(Paths.get(archivo))) {

			String[] values = linea.split("\t");

			String cantidad = values[0];
			String precioUnitario = values[1];
			String nombre = values[2];
	}

	
}}
