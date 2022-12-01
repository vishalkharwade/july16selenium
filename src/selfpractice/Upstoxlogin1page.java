package selfpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxlogin1page {
	@FindBy(xpath = "//input[@id='userCode']")private WebElement PN;
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	@FindBy(xpath = "//button[@id='submit-btn']")private WebElement LGBTN;
	
	public Upstoxlogin1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	public void inpUpstoxHomepageUserName(String user) 
	{
		PN.sendKeys(user);
	}
	public void inpUpstoxHomepagePassword(String pass) 
	{
		PWD.sendKeys(pass);
	}
	public void clickpUpstoxHomepagesinglogin()
	{
		LGBTN.click();
	}
}
