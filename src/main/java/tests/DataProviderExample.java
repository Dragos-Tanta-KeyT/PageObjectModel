package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.ScreenShot;

public class DataProviderExample extends BaseTest{
	
	@DataProvider(name="loginTestData")
	public Object[][] loginTestData(){
			
		/*
		 * String[] textArray = new String[3];
		 * String[] textArray = {"iasi", "bacau", "pitesti"}
		 * index :                  0       1         2
		 * textArray[1] --> bacau
		 * 
		 * String[][] textArray = new String[2][3];
		 * String[][] textArray = {{"alb", "gri", "rosu"} , {"unu", "doi", "trei"} } 
		 * index[2][]              |          0         |    |         1         |
		 * index[][3]                0        1      2          0      1      2
		 * 
		 * textArray[0][1] --> gri
		 * textArray[1][2] --> trei
		 * 
		 */
		Object[][] data =  new Object[4][3];
		
		data[0][0]= "TestUser";
		data[0][1]= "12345@67890";
		data[0][2] = true;
		
		data[1][0] = "gresit";
		data[1][1] = "gresit";
		data[1][2] = false;
		
		data[2][0]= "TestUser";
		data[2][1]= "12345@67890";
		data[2][2]= true;
		
		data[3][0] = "gresit";
		data[3][1] = "gresit";
		data[3][2] = false;
		
		return data;
		
	}
	
	@Test(dataProvider = "loginTestData", groups = "LoginFunctionality")
	public void loginTest(String user, String pass, boolean success) {
		ScreenShot.screenshot(driver);
		app.click(app.menu.loginLink);
		ScreenShot.screenshot(driver);
		app.login.loginInApp(user, pass);
		ScreenShot.screenshot(driver);
		if(success) {	
			ScreenShot.screenshot(driver);
			assertTrue(app.elementIsDisplayed(app.login.loginSucessMsg));
			ScreenShot.screenshot(driver);
			app.click(app.login.logoutButton);
		
		}else if(!success) {
			
			assertTrue(app.elementIsDisplayed(app.login.loginErrorMsg));
			app.click(app.login.closePopUpButton);
		}
		
		
	}
	
	

}
