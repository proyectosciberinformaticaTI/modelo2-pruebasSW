package pe.cibertec.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FechaTest {

	@Test
	public void testValidarFecha1() {
		Fecha fecha = new Fecha();
		boolean expectResult = true;
		boolean result = fecha.validarFecha("2017-02-28");
		//boolean result = fecha.validarFecha("28/02/2017");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void testValidarFecha2() {
		Fecha fecha = new Fecha();
		boolean expectResult = true;
		boolean result = fecha.validarFecha("2017-10-30");
		//boolean result = fecha.validarFecha("30/10/2017");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void testValidarFecha_invalida() {
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.validarFecha("2017-02-31"); //31 de febrero
		//boolean result = fecha.validarFecha("30/10/2017");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void testValidarFecha3() {
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.validarFecha("Holi");
		//boolean result = fecha.validarFecha("30/10/2017");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void compararFechas_valida_menor_mayor(){
		Fecha fecha = new Fecha();
		boolean expectResult = true;
		boolean result = fecha.compararFechas("2017-04-10","2017-04-12");
		//boolean result = fecha.validarFecha("30/10/2017");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void compararFechas_valida_iguales(){
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.compararFechas("2017-04-10","2017-04-10");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void compararFechas_valida_mayor_menor(){
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.compararFechas("2017-04-15","2017-04-12");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void compararFechas_primer_invalido(){
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.compararFechas("207/05/07","2017-04-12");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void compararFechas_segundo_invalido(){
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.compararFechas("207/05/07","okis");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void numeroDiasEntreFechasIguales(){
		Fecha fecha = new Fecha();
		int expectResult = 0;
		int result = fecha.numeroDiasEntreFechas("2017-10-10", "2017-10-10");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void numeroDiasEntreFechas2(){
		Fecha fecha = new Fecha();
		int expectResult = 2;
		int result = fecha.numeroDiasEntreFechas("2017-10-10", "2017-10-12");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void numeroDiasEntreFechas7(){
		Fecha fecha = new Fecha();
		int expectResult = 7;
		int result = fecha.numeroDiasEntreFechas("2017-10-10", "2017-10-17");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void obtenerResultadoEntrada_Fecha1_Invalido(){
		Fecha fecha = new Fecha();
		String expectResult = "Ingreso Incorrecto de Fechas";
		String result = fecha.obtenerMontoEntradas("2017-02-31", "2017-10-17");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void obtenerResultadoEntrada_Fecha2_Invalido(){
		Fecha fecha = new Fecha();
		String expectResult = "Ingreso Incorrecto de Fechas";
		String result = fecha.obtenerMontoEntradas("2017-02-10", "2017-02-30");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void obtenerResultadoEntrada_Fechas_Invalidas(){
		Fecha fecha = new Fecha();
		String expectResult = "Ingreso Incorrecto de Fechas";
		String result = fecha.obtenerMontoEntradas("2017-02-31", "2017-02-30");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void obtenerResultadoEntrada_Mismo_Dia(){
		Fecha fecha = new Fecha();
		String expectResult = "Ud. pagara 100 soles";
		String result = fecha.obtenerMontoEntradas("2017-02-20", "2017-02-20");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void obtenerResultadoEntrada_Mas_7__Menos_30_Dias(){
		Fecha fecha = new Fecha();
		String expectResult = "Ud. pagara 40 soles";
		String result = fecha.obtenerMontoEntradas("2017-02-01", "2017-02-08");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void obtenerResultadoEntrada_Mas_7__Menos_30_Dias_2(){
		Fecha fecha = new Fecha();
		String expectResult = "Ud. pagara 40 soles";
		String result = fecha.obtenerMontoEntradas("2017-02-01", "2017-02-11");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void obtenerResultadoEntrada_Mas_7__Menos_30_Dias_3(){
		Fecha fecha = new Fecha();
		String expectResult = "Ud. pagara 40 soles";
		String result = fecha.obtenerMontoEntradas("2017-02-01", "2017-02-16");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void obtenerResultadoEntrada_Mas_30_Dias(){
		Fecha fecha = new Fecha();
		String expectResult = "Ud. pagara 20 soles";
		String result = fecha.obtenerMontoEntradas("2017-02-01", "2017-03-16");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void obtenerResultadoEntrada_Mas_30_Dias_2(){
		Fecha fecha = new Fecha();
		String expectResult = "Ud. pagara 20 soles";
		String result = fecha.obtenerMontoEntradas("2017-10-01", "2017-10-31");
		assertEquals(expectResult, result);
	}
}


























