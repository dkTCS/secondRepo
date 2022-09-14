package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_Class {
	
	public WebDriver driver;
	
	public void initializebrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dk209\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		ChromeOptions c= new ChromeOptions();
		c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		
		driver= new ChromeDriver(c);
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
