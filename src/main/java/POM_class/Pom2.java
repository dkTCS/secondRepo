package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	
	//step 1 declaration
	
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement ClickCTnBTn;

	//step 2 initialization
	
	public Pom2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//step 3 utilization
	
	public void enterPIN(String Pin) {
		PIN.sendKeys(Pin);
	}
	
	public void ContinueBtn() {
		ClickCTnBTn.click();
	}
	

}
