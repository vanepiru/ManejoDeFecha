package projectTime;

import java.time.LocalDate;

public class ACFecha {

	
	public static void main(String[] args) throws Exception {
		
		//Un LocalDate representa una fecha en formato ISO (yyyy-MM-dd) sin tiempo. Veamos algunos ejemplos
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		///Manipulaci�n de fechas (Sumar o restar d�as, meses, a�os, etc )
		
		LocalDate date2 = LocalDate.parse("2018-10-10");
		LocalDate newDate = date.plusDays(10);
		System.out.println(date2);
		System.out.println(newDate);
	}
}
