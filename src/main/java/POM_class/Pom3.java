package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
	//step 1 declaration
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement verifyID;
	@FindBy(xpath="//span[@class='icon icon-exit']")private WebElement logout;
	
	
	//step 2 initialization
	
	public Pom3 (WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	//step3 utilization
	
	public String verifyUserID() {// method with return type
		String actID=verifyID.getText();
		return actID;
		
	}
	
	public void clickOnID() {
		verifyID.click();
		
	}
	
	public void LogOut() {
		logout.click();
		
	}
	
	
}
