package Metodos;

public class Iniciar {

	public static void main(String[] args) {
		//se crea un objeto de la clase Coche
		Coche miCoche = new Coche("Nisan","supra", 2003, 0);
		
		//esto es para mostrar los detalles del Coche
		
		miCoche.mostrarDetalles();
		System.out.println();
		//esto es para conducir el coche
		miCoche.conducir(150);
		System.out.println();
		
		//mostrar los detalles nuevamente para que se vean los kilometros agragados
		miCoche.mostrarDetalles();
		
		
		
	}

}
