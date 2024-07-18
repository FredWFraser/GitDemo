package MavenFun;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SelIntroduction {
	
	@Test
	public void selDemo( ) {

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[value='radio3']")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("[value='radio3']")).isSelected());

		driver.quit();
		
	}

}
