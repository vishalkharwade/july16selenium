package frameworkPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePracticepage {
 @FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement PN;
 
 public UpstoxHomePracticepage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 public void varifyid() {
	String actual = PN.getText();
	
	String Expected = "Vishal";
	if(actual.contains(Expected)) {
		System.out.println("PASS");
	}else {
		System.out.println("FAIL");
	}
 }
}
