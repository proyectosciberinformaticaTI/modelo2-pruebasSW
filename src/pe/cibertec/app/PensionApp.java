package pe.cibertec.app;

import java.util.Scanner;

import pe.cibertec.pension.Pension;

public class PensionApp {

	/*
	 * Monto de pension 360
	Si tienes 1 pagas el 100%
	Si tienes 2 pagas el 80 % de la pension
	Si tienes 3 o mas pagas el 70% de la pensión.
	 * */
	
	public static void main(String[] args) {
		
		//Sabemos que el monto es 360 , raw data
		String numHijos;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el numero de hijos: ");
		numHijos = scanner.nextLine();
		
		Pension pension = new Pension(360, numHijos);
		System.out.println(pension.calcularMontoPagar());
		
	}
}
