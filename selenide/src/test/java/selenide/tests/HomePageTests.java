package selenide.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

import selenide.pages.DemoStoreMainPage;

import static com.codeborne.selenide.Selenide.open;

public class HomePageTests {

	
	@BeforeTest
	public void setUp() {
		Configuration.startMaximized = true;
		
	}
	
	@AfterTest
	public void tearDown() {
		
		System.out.println("adeus");
		
	}
	
	@Test
	public void validateWelcomeMessage() {
		DemoStoreMainPage mPage = open("https://demostore.x-cart.com/", DemoStoreMainPage.class);
		
		mPage.validatePageLoaded();
		mPage.validateWelcomeMessage("Welcome to X-Cart Demo Store!");
		
	}
	
}
