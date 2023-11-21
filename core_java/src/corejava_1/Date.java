package corejava_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
public static void main(String[] args) {
	LocalDate l1=LocalDate.now(); ///date
	System.out.println(l1);
	
	LocalDateTime l2=LocalDateTime.now();
	System.out.println(l2);
	
	
	DateTimeFormatter d1=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String s1=l1.format(d1);
	System.out.println(d1);
	
	
	
	
}
}
