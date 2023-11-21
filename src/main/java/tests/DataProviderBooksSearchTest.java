package tests;

import utils.BaseTest;
import utils.DataProviderClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class DataProviderBooksSearchTest extends BaseTest{
	
	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "bookPictures")
	public void searchBooksTest(String bookName, String bookPicture) throws InterruptedException {
		
		app.menu.search(bookName);
		
		Thread.sleep(2000);
		
		WebElement picture = driver.findElement(By.xpath("//div[contains(@data-image,'"+bookPicture+"')]"));
		assertTrue(picture.isDisplayed());
		
		assertTrue(app.elementIsDisplayed(app.searchResult.getbookPicture(bookPicture)));
		
		
	}
	
	

}
