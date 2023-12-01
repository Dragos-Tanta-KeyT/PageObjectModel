package pages;

import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BasePage extends SeleniumWrappers{

		public MenuPage menu =  new MenuPage(driver);
		public LoginPage login =  new LoginPage(driver);
		public ShopPage shop =  new ShopPage();
		public SearchResultPage searchResult = new SearchResultPage();
		public PostFormatsPage postFormat =  new PostFormatsPage();
		public ContactsPage contacts =  new ContactsPage();
		public EventsPage events =  new EventsPage();
		public GenericEventPage genericEvent = new GenericEventPage();
}
