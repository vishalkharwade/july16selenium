package frameworkPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelcomepage {

	
	@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement WEl;
	
	public UpstoxWelcomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickwelcome() {
		WEl.click();
	}
}
