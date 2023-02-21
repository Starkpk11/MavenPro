package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin
{
	static WebDriver driver;
	
	@BeforeSuite
	public static void Setup()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
	}
	@Parameters({"username","password"})
	@Test
	public static void Login(String username,String password)
	{
		WebElement login = driver.findElement(By.id("username"));
		login.sendKeys(username);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);
		WebElement logbtn = driver.findElement(By.id("login"));
		logbtn.click();
	}
	

}
