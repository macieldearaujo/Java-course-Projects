package _08_date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d01 = LocalDate.parse("2024-08-27");
		LocalDateTime d02 = LocalDateTime.parse("2024-08-27T05:38");
		Instant d03 = Instant.parse("2023-07-27T05:38:21Z");
		
		LocalDate d04 = LocalDate.now();
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // You cannot use Instant without declare the zone
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d01 - " + d01.format(fmt1));
		System.out.println("d01 - " + fmt1.format(d01));
		System.out.println("d01 - " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d02 - " + d02.format(fmt1));
		System.out.println("d02 - " + d02.format(fmt2));
		System.out.println("d02 - " + d02.format(fmt4));
		
		System.out.println("d03 - " + fmt3.format(d03));
		System.out.println("d03 - " + fmt5.format(d03));
		System.out.println("d03 - " + d03.toString());
		
	}

}
