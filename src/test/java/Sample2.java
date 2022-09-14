import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	public static void main(String[] args) {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("htpps://www.redbus.com/");
	}

}
