package pe.cibertec.pension;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class PensionTest {

	@Test
	public void testValidaNumeroHijosValido() {
		System.out.println("validar numero de hijo valido");
		Pension instance = new Pension(360,"1");
		boolean expResult = true;
		boolean result = instance.validaNumeroHijos();
		assertEquals(expResult, result);

	}

	
	@Test
	public void testValidaNumeroHijosInvalido() {
		System.out.println("validar numero de hijo valido");
		Pension instance = new Pension(360,"0");
		boolean expResult = false;
		boolean result = instance.validaNumeroHijos();
		assertEquals(expResult, result);

	}
	
	@Test
	public void testValidaNumeroHijosInvalidoLetra() {
		System.out.println("validar numero de hijo valido");
		Pension instance = new Pension(360,"pepe");
		boolean expResult = false;
		boolean result = instance.validaNumeroHijos();
		assertEquals(expResult, result);

	}
	
	@Test
	public void testCalcularMontoPagar1() {
		System.out.println("Validar CalcularMontoPagar");
		Pension pension = new Pension(360,"1");
		String expResult = "El total a pagar es: 360.0";
		String result = pension.calcularMontoPagar();
		assertEquals(expResult, result);
	}
	
	@Test
	public void testCalcularMontoPagar2() {
		System.out.println("Validar CalcularMontoPagar");
		Pension pension = new Pension(360,"2");
		String expResult = "El total a pagar es: 576.0";
		String result = pension.calcularMontoPagar();
		assertEquals(expResult, result);
	}
	
	@Test
	public void testCalcularMontoPagar3() {
		System.out.println("Validar CalcularMontoPagar");
		Pension pension = new Pension(360,"3");
		String expResult = "El total a pagar es: 756.0";
		String result = pension.calcularMontoPagar();
		assertEquals(expResult, result);
	}
	
	@Test
	public void testCalcularMontoPagar5() {
		System.out.println("Validar CalcularMontoPagar");
		Pension pension = new Pension(360,"5");
		String expResult = "El total a pagar es: 1260.0";
		String result = pension.calcularMontoPagar();
		assertEquals(expResult, result);
	}
	
	@Test
	public void testCalcularMontoPagarCampoInvalido0() {
		System.out.println("Validar CalcularMontoPagar");
		Pension pension = new Pension(360,"0");
		String expResult = "Campo  numero de hijo errado";
		String result = pension.calcularMontoPagar();
		assertEquals(expResult, result);
	}
	@Test
	public void testCalcularMontoPagarCampoInvalidopp() {
		System.out.println("Validar CalcularMontoPagar");
		Pension pension = new Pension(360,"pp");
		String expResult = "Campo  numero de hijo errado";
		String result = pension.calcularMontoPagar();
		assertEquals(expResult, result);
	}
}
