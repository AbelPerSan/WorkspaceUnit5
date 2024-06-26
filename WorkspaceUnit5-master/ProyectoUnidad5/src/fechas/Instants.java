package fechas;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Instants {

	public static void main(String[] args) {
	ZoneId zoneDefault=ZoneId.systemDefault();
	

	// Parsing a string sequence to Instant
    Instant instant1 = Instant.parse("2021-02-09T11:19:42.12Z");
    System.out.println("Parseado el instante: " + instant1);

	
	Clock myClock = Clock.systemDefaultZone();
	
	Instant instant2 = myClock.instant();
	   
	System.out.println("Parseado el instante: " + instant2);


	
	LocalDateTime local = LocalDateTime.now();
	
	
	Instant instant3 = local.toInstant(zoneDefault.getRules().getOffset(local));
	
	System.out.println(instant3.toEpochMilli());	

	
	System.out.println(instant3);
	
	LocalDateTime locFromInstant = LocalDateTime.ofInstant(instant3, zoneDefault);
	
	System.out.println(locFromInstant);
	
	
	ZoneId zoneCalcutta = ZoneId.of("Asia/Calcutta");
	
	ZonedDateTime zdatetime = ZonedDateTime.now(zoneCalcutta);
	

	System.out.println(zdatetime);
	
	Instant instant5 = zdatetime.toInstant();	
	
	
	System.out.println(instant5);
	
	System.out.println(instant5.atZone(zoneCalcutta));
	


	}
}
