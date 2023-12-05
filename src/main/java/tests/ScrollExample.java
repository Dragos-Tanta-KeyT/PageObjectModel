package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ScrollExample extends BaseTest{

	//@Test
	public void scrollExample() {
		
		//JsExecutor scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 2500)");
		
		//Action class scroll
		Actions action = new Actions(driver);
	//	action.scrollByAmount(0, 2500).perform();
		
	}
	
	
	//@Test
	public void scrollToWebElement() {
		WebElement signUp = driver.findElement(By.cssSelector("input[value='Sign up']"));

		//JSExecutor scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", signUp);
		jse.executeScript("document.getElementsByClassName('sc_emailer_button')[0].scrollIntoView()");
		
		//Action class scroll
		Actions action = new Actions(driver);
		//action.scrollToElement(signUp).perform();
		
		
	}
	
	@Test
	public void scrollTopAndDown() throws InterruptedException {
		
		//JSExecutor scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");

		Thread.sleep(4000);

		//Action class scroll
		Actions action = new Actions(driver);		
		action.sendKeys(Keys.END).perform();
		Thread.sleep(4000);
		action.sendKeys(Keys.HOME).perform();
		
	}
	
	
}
