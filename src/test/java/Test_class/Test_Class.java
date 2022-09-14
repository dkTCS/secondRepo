package Test_class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_Class;
import POM_class.Pom1;
import POM_class.Pom2;
import POM_class.Pom3;
import Utility.Utility_class;

public class Test_Class extends Base_Class {
	
	//declare usefull members as global
	
	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	
	@BeforeClass
	public void openBrowser() {
		initializebrowser();
		
		login1=new Pom1(driver);
		login2= new Pom2(driver);
		home =new  Pom3(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws Throwable {
		//enter UN
		
		login1.enterUN(Utility_class.getTD(0, 0));//DPG458
		System.out.println(Utility_class.getTD(0, 0));
		
		//enter password
		login1.enterPWD(Utility_class.getTD(0, 1));
		
		//click login button
		
		login1.clickLoginBtn();
		
		//enter pin
		
		login2.enterPIN(Utility_class.getTD(0, 2));
		
		//click on continue button
		login2.ContinueBtn();
	}
		
		@Test
		public void getuserID() throws Throwable {
			Reporter.log("im running from verifyID", true);
			String actID=home.verifyUserID();
			String expID=Utility_class.getTD(0, 0);
			Assert.assertEquals(actID, expID,"both are differnt tc fail");
		}
		
		@AfterMethod
		public void logoutApp() {
			
			home.clickOnID();
			home.LogOut();
			Reporter.log("logout the app",true);
		}
		
		@AfterClass
		public void closeBrowser() {
			Reporter.log("close the app",true);	
		
	}

}
