package ej.constructor.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class VectorHora {
	/*List<Integer> ListHour = new ArrayList<Integer>();*/
	int [] vectorHours = new int[5]; 
	static Date d = new Date();
	static Calendar c = new GregorianCalendar(); 
	
	static String dia;
	static String mes;
	static String annio;
	static String hora;
	static String minuto;
	static String segundo;
	public VectorHora() {
		

	}
	
	public static void solicitaHora(){
		c.setTime(d);
		dia = Integer.toString(c.get(Calendar.DATE));
		mes = Integer.toString(c.get(Calendar.MONTH));
		annio = Integer.toString(c.get(Calendar.YEAR));
		hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
		minuto = Integer.toString(c.get(Calendar.MINUTE));
		segundo = Integer.toString(c.get(Calendar.SECOND));
		
	}
	
	
	

	
	public static void main(String[] args) {
		solicitaHora();
		System.out.println (hora + ":" + minuto + ":" + segundo + " " + dia + "/" + mes +"/" + annio);
	}

}
