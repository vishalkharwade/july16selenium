package frameworkPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxlogin1practicepage {
	
	
	@FindBy(xpath = "//input[@id='userCode']") private WebElement User;
	
	@FindBy(xpath = "//input[@id='password']") private WebElement pass;
	
	@FindBy(xpath = "//button[@id='submit-btn']") private WebElement LGN;
	
	
	public Upstoxlogin1practicepage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Enterusername1() {
		User.sendKeys("FC7144");
	}
	public void Enterpassword1() {
		pass.sendKeys("Vishal07@");
	}
	public void ClickOnloginBTN1() {
		LGN.click();
	}
	
	

}
