package Mockpractice_POMcLass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2page {
	@FindBy(xpath = "//input[@id='yob']")private WebElement YOB;
	
	
	public UpstoxLogin2page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void inpUpstoxLogin2pageBirthDate(String BIRTH) {
		YOB.sendKeys(BIRTH);
	}

}
