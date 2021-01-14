package Project.Sample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTest extends sampleHelloWorld {

	
	@BeforeTest
	public void BeforeTest(){
		System.out.println("Before");
	}
	
	@Test
	public void Test(){
		System.out.println("Test");
		display();
	}
	
	@AfterTest
	public void AfterTest(){
		System.out.println("After");
	}
	
	
}
