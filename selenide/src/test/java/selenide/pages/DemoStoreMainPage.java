package selenide.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

//import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class DemoStoreMainPage {
	
	SelenideElement mainLogo = $(By.xpath("//div[@id='logoo']"));
	SelenideElement welcomeMessage = $(By.xpath("//h1"));
	
	public void validatePageLoaded() {
		mainLogo.shouldBe(visible);
	}

	public void validateWelcomeMessage(String message) {
		//welcomeMessage.shouldBe(Condition.exactText(message));
		welcomeMessage.shouldBe(exactText(message));
	}
	
	

}
