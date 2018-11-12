package pe.cibertec.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TiempoTest {

	/*
	@Test
	public void testValidarfechita() {
		
		Tiempo tiempo = new Tiempo();
		String hora = "22:10";
		boolean esperado = true;
		boolean resultado = tiempo.validarfechita(hora);
		assertEquals(esperado, resultado);
	}*/
	
	@Test
	public void testValidarTiempo_valido() {
		
		Tiempo tiempo = new Tiempo();
		String hora = "22:10";
		boolean esperado = true;
		boolean resultado = tiempo.validarHora(hora);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testValidarTiempo_invalido() {
		
		Tiempo tiempo = new Tiempo();
		String hora = "25:10";
		boolean esperado = false;
		boolean resultado = tiempo.validarHora(hora);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testValidarTiempo_invalido_2() {
		
		Tiempo tiempo = new Tiempo();
		String hora = "11:60";
		boolean esperado = false;
		boolean resultado = tiempo.validarHora(hora);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testValidarTiempo_invalido_3() {
		
		Tiempo tiempo = new Tiempo();
		String hora = "11:99";
		boolean esperado = false;
		boolean resultado = tiempo.validarHora(hora);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testValidarTiempo_valido_formato() {
		
		Tiempo tiempo = new Tiempo();
		String hora = "01:13";
		boolean esperado = true;
		boolean resultado = tiempo.validarHora(hora);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testValidarTiempo_valido_formato_2() {
		
		Tiempo tiempo = new Tiempo();
		String hora = "01:01";
		boolean esperado = true;
		boolean resultado = tiempo.validarHora(hora);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testValidarTiempo_invalido_formato() {
		
		Tiempo tiempo = new Tiempo();
		String hora = "1:13";
		boolean esperado = false;
		boolean resultado = tiempo.validarHora(hora);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testValidarTiempo_invalido_formato_2() {
		
		Tiempo tiempo = new Tiempo();
		String hora = "01:1";
		boolean esperado = false;
		boolean resultado = tiempo.validarHora(hora);
		assertEquals(esperado, resultado);
	}
	
	//compararTiempo
	@Test
	public void testCompararTiempo_Valido() {
		
		Tiempo tiempo = new Tiempo();
		boolean esperado = true;
		boolean resultado = tiempo.compararTiempo("12:01:01", "13:01:01");
		assertEquals(esperado, resultado);
	}
}
