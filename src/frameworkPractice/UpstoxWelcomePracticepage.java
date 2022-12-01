package frameworkPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelcomePracticepage {
	@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement wel;

	public UpstoxWelcomePracticepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickonwelcomepage1() {
		wel.click();
	}
	
}
