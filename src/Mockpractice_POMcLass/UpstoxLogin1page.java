package Mockpractice_POMcLass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1page {
	
	
	@FindBy(xpath = "//input[@id='userCode']") private WebElement UN;
	
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	
	@FindBy(xpath = "//button[@id='submit-btn']") private WebElement LGNBTN;
	
	
	public UpstoxLogin1page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void InpUpstoxLogin1pageUserName(String Username) {
		UN.sendKeys(Username);
	}
	
	public void inpUpstoxLogin1pagePassword(String Password) {
		PWD.sendKeys(Password);
	}
	 
	public void clickUpstoxLogin1pageLoginbutton() {
		LGNBTN.click();
	}
	

}
