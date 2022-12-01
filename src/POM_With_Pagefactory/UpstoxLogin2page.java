package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2page {
	 @FindBy(xpath="//input[@id='yob']") private WebElement yearOfBirth;
	 
	 
	public UpstoxLogin2page(WebDriver driver){
		 PageFactory.initElements(driver, this);

	}
public void enterYOB(String DOB)
{
	yearOfBirth.sendKeys(DOB);
	}




}
