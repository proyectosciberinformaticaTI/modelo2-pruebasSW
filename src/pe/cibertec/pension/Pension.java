package pe.cibertec.pension;

public class Pension {

	private int monto;
	private String numHijos;

	public Pension() {
		// TODO Auto-generated constructor stub
	}

	public Pension(int monto, String numHijos) {
		this.monto = monto;
		this.numHijos = numHijos;
	}

	// Los metodos para validar

	// Literal para evaluar que sea numero el numero de hijos
	//String literalNumero = "\\d{1,}";
	String literalNumero = "[123456789]{1,}";

	public boolean validaNumeroHijos() {
		return numHijos.matches(literalNumero);
	}

	public String calcularMontoPagar() {

		String mensaje = "";

		if (!validaNumeroHijos()) { // Con esto nos aseguramos que es un numero entero mayor que uno
			mensaje = "Campo  numero de hijo errado";
		} else {
			int numero = Integer.parseInt(numHijos);
			double subTotal = 0;
			double montoPagar = 0;
			double descuento = 0;

			switch (numero) {
			case 1:
				descuento = 1;
				break;
			case 2:
				descuento = 0.8;
				break;
			default:
				descuento = 0.7;
				break;
			}

			subTotal = monto * numero;
			montoPagar = subTotal * descuento;
			
			mensaje = "El total a pagar es: " + montoPagar;
		}
		
		return mensaje;

	}
}
