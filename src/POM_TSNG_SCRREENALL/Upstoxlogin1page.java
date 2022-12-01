package POM_TSNG_SCRREENALL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxlogin1page {
	
	@FindBy(xpath = "//input[@id='userCode']")private WebElement UN;
	
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	
	@FindBy(xpath = "//button[@id='submit-btn']")private WebElement LGN;
public Upstoxlogin1page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void inpUpstoxlogin1pageUserName(String User) {
	UN.sendKeys(User);
	
}
public void inpUpstoxlogin1pagePassWord(String pass) {
	PWD.sendKeys(pass);
}
public void ClickUpstoxlogin1pageLoginBtn() {
	LGN.click();
}

}
