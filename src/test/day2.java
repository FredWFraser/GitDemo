package test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void DemoDay2() {
		
		System.out.println("Hello Day2!");
	}
	
	@Test(groups= {"Smoke"})
	public void SecondTestDay2() {
		
		System.out.println("Goodbye Day2!");
	}
	
	@Test
	public void MobileDay2() {

		System.out.println("Mobile Day2!");
	}
	
	@BeforeTest
	public void Prerequisite() {

		System.out.println("I will execute first!!!!");
	}

}
