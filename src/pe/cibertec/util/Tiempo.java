package pe.cibertec.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tiempo {

	 private String expresionregular="^[0-2][0-4]{2}:[0-9]{2}$";
	 
	 private String myexpresionregular="[0-2][0-4]:[0-5][0-9]";
	 
	public boolean validarfechita(String patronsd) {
		Pattern pat = Pattern.compile(expresionregular);
		// pat.matcher(tiempo1)
		Matcher mat = pat.matcher(patronsd);
		if (mat.matches()) {
			return true;
		}
		return false;
	}
	
	public boolean validarHora(String hora) {
		return hora.matches(myexpresionregular);
	}
	
	public boolean compararTiempo(String hora1, String hora2){

        SimpleDateFormat dffd=new SimpleDateFormat("HH:mm");        
        
        try {
        	Date tiempo1 = dffd.parse(hora1);
            Date tiempo2 = dffd.parse(hora2);//22:00
            
            if(tiempo1.before(tiempo2)){
            	return true;
            }else{
            	return false;
            }
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * public String calcularmontopagar() throws ParseException{
        String resultado="";
        Date obj=new Date();
        //long time = obj.getTime();         
        SimpleDateFormat dffd=new SimpleDateFormat("HH:mm");        
        Date time1=dffd.parse(tiempo1);
        Date tiemp2=dffd.parse(tiempox1);//22:00
        Date tiem3=dffd.parse(tiempox2);//23:00
        Date tiem4=dffd.parse(tiempox3);//00:00
        Date tiem5=dffd.parse(timepoextra);
        Date tiem6=dffd.parse(tiempoextra2);
        
       
        
        if(time1.before(tiemp2) && time1.after(tiem5) ){
            resultado="paga el 70% del monto de 50 soles";
        }
        else if(time1.before(tiem3) && time1.after(tiemp2) ){
            resultado="paga el 90% del monto de 50 soles";
        }
        else if(time1.after(tiem4) && time1.before(tiem5) ){
            resultado="para el 100% del monto de 50 soles";
        }
        else if(time1.after(tiem3) && time1.before(tiem6) ){
            resultado="en este horario no hay descuento";
        }      
        else{
            resultado="no es una hora valida";
        }
        return resultado;
    }

	 */

}
