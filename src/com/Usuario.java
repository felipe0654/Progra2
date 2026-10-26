package com;

import java.util.Random;

public class Usuario {
	//variables de instancia
	public String nombre;
	public String apellido;
	public String cedula;
	public String servicio;
	public int turnoAsignado;
	
	//variables de clase
	
	public static int turnoSecuencial =0;
	

	//Metodo para ingresar los datos
	public  String ingresarDatos(String nombre, String apellido, String cedula) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		
		turnoSecuencial ++;
		this.turnoAsignado = turnoSecuencial;
		
		 return nombre + apellido + cedula; 
	}
	
	//Metodo para generar servicio
	public String generarServicios (String servicio) {
		
		System.out.println("Seleccione el servicio que requiere: ");
		
		return servicio;
	}
	
	//Metodo para Imprimir la informacion
	public void imprimirInfo() {
		System.out.println("Nombre del cliente: "+ nombre);
		System.out.println("Apellido del cliente: "+ apellido);
		System.out.println("Cedula del cliente: "+ cedula);
		System.out.println("turno asignado del cliente: "+ turnoAsignado);
		System.out.println("Cubiculo asignado del cliente" );
	}
	
	//Metodo para asignar un cubiculo
	public int asignarCubiculo(int cubiculoDesocupado) {
		
		Random random = new Random();
		cubiculoDesocupado = random.nextInt(10);
		
		System.out.println("Su cubiculo designado es: "+ cubiculoDesocupado);
		
		return cubiculoDesocupado;
	}
	
	
	
	
	
	
	

}
