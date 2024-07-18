package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void lastExecution()

	{

		System.out.println("I will run last!!!!!!!");
	}

	@Test(groups= {"Smoke"})
	public void Demo()

	{

		System.out.println("Hello Day1!");
	}

	@Test(enabled=false)
	public void SecondTest() {

		System.out.println("Goodbye Day1!");
	}
	
	@AfterSuite
	public void afterSuite() {

		System.out.println("After Suite!");
	}
	
	@Test(dependsOnMethods= {"Demo"})
	public void MobileDay1() {

		System.out.println("Mobile Day1!");
	}
}
