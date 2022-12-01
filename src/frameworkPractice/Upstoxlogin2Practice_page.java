package frameworkPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxlogin2Practice_page {
	
	@FindBy(xpath = "//input[@id='yob']") private WebElement YOB;
	
public Upstoxlogin2Practice_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void EnterBIRThDATE() {
	YOB.sendKeys("1993");
}
}
