package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class ActionClassExample extends BaseTest{

	
	//@Test
	public void hoverExample() throws InterruptedException {
		
		app.hoverElement(app.menu.blogLink);
		Thread.sleep(3000);
		app.hoverElement(app.menu.masonryLInk); 
		Thread.sleep(3000);
		app.hoverElement(app.menu.portfolioLink); 
		Thread.sleep(3000);
		app.hoverElement(app.menu.aboutLink); 	
	}
	
	
	@Test
	public void dragAndDropExample() {
		
		app.click(app.menu.shopLink);
		
		app.scrollVerically(350);
		
		app.dragAndDrop(app.shop.sliderInitialPosition, 100, 0);
		app.dragAndDrop(app.shop.sliderFinalPostition, -100, 0);
		
		
	}
	
	
}
