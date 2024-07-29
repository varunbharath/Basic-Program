package ccc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CCC {
	public static WebDriver driver=null;
	@BeforeSuite
	public void aa() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\kumar\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to("https://cholahost.in:2083/?locale=en");
	}
@Test 
public void vv() {
	
	
}
}
