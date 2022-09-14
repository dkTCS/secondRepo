package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	
	//step 1 declaration
	
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement ClickLoginbtn;

	//step 2 initialization
	
	public Pom1 (WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//step 3 utilization
	
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		ClickLoginbtn.click();
	}
}
