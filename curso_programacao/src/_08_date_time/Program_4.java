package _08_date_time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d01 = LocalDate.parse("2024-01-29");
		LocalDateTime d02 = LocalDateTime.parse("2024-08-27T05:38");
		Instant d03 = Instant.parse("2023-07-27T01:30:26Z");
		
		LocalDate pastWeekDate = d01.minusDays(7);
		LocalDate nextWeekDate = d01.plusDays(7);
		
		System.out.println("pastWeek = " + pastWeekDate);
		System.out.println("nextWeek = " + nextWeekDate);
		
		LocalDateTime pastWeekDateTime = d02.minusDays(7);
		LocalDateTime nextWeekDateTime = d02.plusDays(7);
		
		System.out.println("pastWeek(time) = " + pastWeekDateTime);
		System.out.println("nextWeek(time) = " + nextWeekDateTime);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);

		Duration t1 = Duration.between(pastWeekDateTime, d02);
		Duration t2 = Duration.between(pastWeekDate.atStartOfDay(), d01.atTime(0, 0)); // atStartOfDay() and atTime(0, 0)
		Duration t3 = Duration.between(pastWeekInstant, d03);
		
		System.out.println("t1 dias = " + t1.toDays());  /// *******************
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
	} 
}
