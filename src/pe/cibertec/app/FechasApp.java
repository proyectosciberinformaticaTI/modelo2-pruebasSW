package pe.cibertec.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechasApp {
	public static void main(String[] args) {

		int year = 2016; // a�o
		int month = 9; // mes [1,...,12]
		int dayOfMonth = 31; // d�a [1,...,31]

		if (year < 1900) {
			throw new IllegalArgumentException("A�o inv�lido.");
		}

		LocalDate today = LocalDate.of(year, month, dayOfMonth);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatter.format(today)); // 01/01/2016
	}
}
