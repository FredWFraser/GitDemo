package test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void DemoDay4() {
		
		System.out.println("Hello Day4!");
	}
	
	@Test(groups= {"Smoke"})
	public void SecondTestDay4() {
		
		System.out.println("Goodbye Day4!");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Before Suite!");
	}
	
	@Test
	public void MobileDay4() {

		System.out.println("Mobile Day4!");
	}

}
