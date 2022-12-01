package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1page {
//  Step 1 variable declaration
	@FindBy(xpath="//input[@id='userCode']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//button[@id='submit-btn']") private WebElement loginbtn;
	
///Step 2 variable initialization
	
	public UpstoxLogin1page(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	// Step 3 variable use
	public void enterUN(String User) {
		UN.sendKeys(User);
	}
	public void enterPWD(String Pass) {
		PWD.sendKeys(Pass);
	}
	public void clickonLoginbtn() {
		loginbtn.click();
	}
	
}
//FC7144
//639329
