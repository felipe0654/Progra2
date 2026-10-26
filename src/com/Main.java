package com;

public class Main {

	public static void main(String[] args) {

		Usuario us1 = new Usuario();

		us1.ingresarDatos(null, null, null);
		us1.generarServicios("Atencion al cliente");
		us1.imprimirInfo();
		us1.asignarCubiculo(2);

	}

}
