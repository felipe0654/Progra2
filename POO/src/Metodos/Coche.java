package Metodos;

public class Coche {
	public String marca;
	public String modelo;
	public int año;
	public int kilometros;
	
	
	
	

	public Coche(String marca, String modelo, int año, int kilometros) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.kilometros = 0;
	}

	

	public void mostrarDetalles() {
		System.out.println("Detalles del coche");
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Año: "+año);
		System.out.println("Kilometros: "+kilometros);
		
		
	}
	
	public void conducir(int km) {
		this.kilometros += km;
		System.out.println("Conduciendo a "+ km + " kilómetros...");
		
	}

	public int getKilometros() {
		return kilometros;
	}

	
	
	

}
