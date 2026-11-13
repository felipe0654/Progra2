package inicio;

public class Main {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria("2206482510", "Felipe Osorio", 106.35);
		System.out.println("Banco: "+ CuentaBancaria.getNombreBanco());
		
		cuenta.informacion();
		cuenta.depositar(482.16);
		cuenta.retirar(100.50);
		

	}

}
