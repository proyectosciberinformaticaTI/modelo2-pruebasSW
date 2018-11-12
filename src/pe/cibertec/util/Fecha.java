package pe.cibertec.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Fecha {

	// Evaluamos existencia de la fecha
	// La Fecha debe ser de la forma "dd/MM/yyyy"

	/*
	 * public boolean validarFecha(int dia, int mes, int anio) {
	 * 
	 * try { LocalDate today = LocalDate.of(dia, mes, anio); DateTimeFormatter
	 * formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 * System.out.println(formatter.format(today)); // 01/01/2016
	 * 
	 * return true; } catch (Exception e) { return false; }
	 * 
	 * }
	 */

	public boolean validarFecha(String fecha) { // La fecha tiene que ser del
												// formato "yyyy-mm-dd"
		LocalDate date = null;
		try {
			date = LocalDate.parse(fecha);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (date == null) ? false : true;
	}

	// Me devuelve true si la fecha1 es menor fecha2
	public boolean compararFechas(String fecha1, String fecha2) {

		boolean bandera = false;

		try {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

			Date date1 = sdf.parse(fecha1);
			Date date2 = sdf.parse(fecha2);

			if (date1.before(date2)) {
				bandera = true;
			} else if (date2.before(date1)) {
				bandera = false;
			} else {
				bandera = false;
			}

		} catch (Exception e) {
			//System.out.println("La fecha debe tener este formato (yyyy-mm-dd)");
			bandera = false;
		}

		return bandera;
	}
	
	/*
	 * El problema propuesto es:
	 * 
	 * -La entrada esta 100 soles.
	 * 
	 * -Si compro 30 dias antes a más dias una entrada, mi descuento es de 80%.
	 * -Si compro 7 dias antes(entre 7 y 30), mi descuento es de 60%.
	 * -Si lo compro el mismo dia, no obtengo ningun descuento.
	 * 
	 * */
	
	//Metodo clave
	public int numeroDiasEntreFechas(String fecha1, String fecha2){
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		int dias = 0;
		
		try {
			Date fechaInicial=dateFormat.parse(fecha1);
			Date fechaFinal=dateFormat.parse(fecha2);
			dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
		} catch (Exception e) { //Nunca entra aca, pues en otro metodo se validara la existencia de una fecha
			System.out.println(e);
		}
		return dias;	
	}
	
	public String obtenerMontoEntradas(String fecha1, String fecha2){
		
		String mensaje = "";
		int numDias = 0;
		
		if(!validarFecha(fecha1)){
			mensaje = "Ingreso Incorrecto de Fechas";
		}else if(!validarFecha(fecha2)){
			mensaje = "Ingreso Incorrecto de Fechas";
		}else{ //Las dos fechas son validas
			numDias = numeroDiasEntreFechas(fecha1, fecha2);
			
			if(numDias >= 30){
				mensaje = "Ud. pagara 20 soles";
			}else if(numDias < 30 && numDias >= 7){
				mensaje = "Ud. pagara 40 soles";
			}else if(numDias < 7 && numDias >0){ //6,5,4,3,2,1 [Requerimiento ambiguo]
				mensaje = "Requerimiento ambiguo";
			}else{ // 0
				mensaje = "Ud. pagara 100 soles";
			}
		}
		return mensaje;
	}
}

























