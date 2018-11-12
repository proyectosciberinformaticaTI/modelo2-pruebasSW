package pe.cibertec.app;

import java.util.Scanner;

import pe.cibertec.util.Fecha;

public class EntradasApp {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Fecha fecha = new Fecha();
		
		System.out.print("Ingrese Fecha de Concierto: ");
		String fechaConcierto = scanner.nextLine();
		
		System.out.print("Ingrese Fecha de Compra Entrada: ");
		String fechaCompra = scanner.nextLine();
		
		System.out.println(fecha.obtenerMontoEntradas(fechaCompra, fechaConcierto));
	}
}
