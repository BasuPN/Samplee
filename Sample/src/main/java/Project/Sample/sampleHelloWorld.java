package Project.Sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class sampleHelloWorld {

	
	
	public void display(){
		
		System.out.println("Hello World");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
				
	}
	
	
}
