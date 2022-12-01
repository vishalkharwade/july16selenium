package frameworkPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UpstoxHomepage {
  @FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement PN;
  
  public UpstoxHomepage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
 public void varifyuserID() {
	String ActPN = PN.getText();
	String EXTPN = "Vishal";
	if(ActPN.contains(EXTPN)) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
	 
 }
}
