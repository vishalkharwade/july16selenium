package frameworkPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1page {
	
	 @FindBy(xpath = "//input[@id='userCode']") private WebElement UN;
	 @FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	 @FindBy(xpath = "//button[@id='submit-btn']") private WebElement LGBTN;
	 
	 
	 
	 public UpstoxLogin1page(WebDriver driver) {
		 
		 PageFactory.initElements(driver, this);
	 }
	
	public void EnterUN() {
		UN.sendKeys("FC7144");
	}
public void Enterpass() {
	PWD.sendKeys("Vishal07@");
}
public void Enterclick() {
	LGBTN.click();
}
}
