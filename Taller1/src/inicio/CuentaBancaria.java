package inicio;

public class CuentaBancaria {
	
	private static String nombreBanco;
	private static int totalCuentasCreadas;
	
	private String numeroCuenta;
	private String titular;
	private double saldo;
	
	public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
		
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
		totalCuentasCreadas++;
	}
	
	public static String getNombreBanco() {
		return "Banco Guayaquil";
	}



	public static void setNombreBanco(String nombreBanco) {
		CuentaBancaria.nombreBanco = nombreBanco;
	}



	public static int getTotalCuentasCreadas() {
		return totalCuentasCreadas;
	}



	public static void setTotalCuentasCreadas(int totalCuentasCreadas) {
		CuentaBancaria.totalCuentasCreadas = totalCuentasCreadas;
	}



	public String getNumeroCuenta() {
		return numeroCuenta;
	}



	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
		if(titular!= null) {
			
		}else {
			System.out.println("No valido, el titular no puede estar vacio");
		}
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
		if(saldo<0) {
			System.out.println("Saldo no valido");
		}
	}



	public double depositar(double monto) {
		
		monto = monto;
		double bonificacion= 0.5;
		double deposito = monto + bonificacion;
		double saldoTotal = saldo + deposito;
		if(monto >0) {
			System.out.println("El monto a depositar es valido:$ " + monto);
		}else {
			System.out.println("El monto a depositar es no es valido");
		}
		
		System.out.println("El saldo total de su cuenta es de: $" + saldoTotal);
		
		return saldoTotal;
	}
	
	public boolean retirar(double monto) {
		double comision= 0.41;
		double montoRetiro = monto + comision;
		double saldoTotal = saldo - montoRetiro;
		
		if(saldo >= montoRetiro) {
			System.out.println("Trasaccion exitosa");
			
		}else {
			System.out.println("Fondos insuficientes");
			System.out.println("Transaccion denegada");
			
		}
		System.out.println("Saldo total de su cuenta es: $ "+ saldoTotal);
		
		return true;
	}
	
	public void informacion() {
		System.out.println("Numero de cuenta: "+ numeroCuenta);
		System.out.println("El titular de esta cuenta es: "+ titular);
		System.out.println("Saldo de su cuenta es $: "+ getSaldo());
		System.out.println("Numero de cuentas creadas: "+ getTotalCuentasCreadas());
	}
	
	
	
	
	
	
	

}
