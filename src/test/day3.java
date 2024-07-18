package test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Parameters({"URL"})
	@Test
	public void DemoDay3(String urlName) {
		
		System.out.println("Hello Day3!");
		System.out.println(urlName);
	}
	
	@Test(groups= {"Smoke"})
	public void SecondTestDay3() {
		
		System.out.println("Goodbye Day3!");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before every method in day3!");
	}
	
	@Test(dataProvider="getData")
	public void MobileDay3(String username, String password) {

		System.out.println("Mobile Day3!");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData() 
	{
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
		
	}

}
