package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelcomepage {
	@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement NoAmGood;

	public UpstoxWelcomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickUpstoxWelcomepageONAmGood() {
		NoAmGood.click();
	}
}
