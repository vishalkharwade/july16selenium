package selfpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxlogin2page {
	
	@FindBy(xpath = "//input[@id='yob']")private WebElement DOB;
	
public Upstoxlogin2page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void inpUpstoxlogin2pageBIRTH(String YOB) {
	DOB.sendKeys(YOB);
}


}
