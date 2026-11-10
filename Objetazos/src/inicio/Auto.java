package inicio;

import java.util.Scanner;

public class Auto {
	String color;
	String marca;
	String modelo;
	String matricula;
	String combustible;

	void menu() {
		Scanner sc = new Scanner(System.in);

		int opcion;
		do {
			System.out.println("Seleccione una opcion");
			System.out.println("1. Limpiar Auto \n2. Limpiar Persona \n3. Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Su auto esta siendo limpiado ");
				break;
			case 2:
				System.out.println("Su persona esta siendo limpiada");
				break;
			case 3:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Ingrese una opcion correcta");
			}

		} while (opcion != 3);
		// System.out.println("SIga");

	}

	public Auto(String color, String marca, String modelo, String matricula, String combustible) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.combustible = combustible;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula
				+ ", combustible=" + combustible + "]";
	}

}
