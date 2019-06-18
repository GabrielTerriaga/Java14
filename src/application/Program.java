package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		System.out.println();
		
		//Adicionar 4h com o Calendar
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println("ADICIONADO 4H");
		System.out.println(sdf.format(d));
		System.out.println();
		
		//OBTENDO UNIDADE DE TEMPO
		System.out.println("PEGANDO UNIDADE DE TEMPO");
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);
		System.out.println();
		
		int month = 1 + cal.get(Calendar.MONTH); //O MES ME JAVA (CALENDAR) COMEÇA EM 0; É PRECISO ADICIONAR +1
		System.out.println("Month: " + month);
		
		
		
	}

}
