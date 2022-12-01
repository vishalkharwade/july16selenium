package guru99_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_project_module1{
	@FindBy(xpath = "//a[text()='New Customer']")	private WebElement NewCustomer;
    @FindBy(xpath = "//input[@name='name']")	private WebElement Username;
    @FindBy(xpath = "(//input[@name='rad1'])[1]")	private WebElement Gender;
    @FindBy(xpath = "//input[@name='dob']")	private WebElement DOB;
    
    @FindBy(xpath = "//textarea[@name='addr']")	private WebElement Adress;
    @FindBy(xpath = "//input[@name='city']")	private WebElement City;
    @FindBy(xpath = "//input[@name='state']")	private WebElement State;
    @FindBy(xpath = "//input[@name='pinno']")	private WebElement Pin;
    @FindBy(xpath = "//input[@name='telephoneno']")	private WebElement mobile;
    @FindBy(xpath = "//input[@name='emailid']")	private WebElement email;
    @FindBy(xpath = "//input[@name='sub']")	private WebElement submit;
    
    public Guru99_project_module1(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void NewCustmer() {
    	NewCustomer.click();
    	Username.sendKeys("vishalkharwade");
    	Gender.click();
    	DOB.sendKeys("07/08/2017");
    	Adress.sendKeys("At.Kinhola Dist.parbhani");
    	City.sendKeys("pune");
    	State.sendKeys("maharashtra");
    	Pin.sendKeys("431537");
    	mobile.sendKeys("9673862891");
        email.sendKeys("vishalkharwade12@gmail.com");
        submit.click();
    
    }
	
	
	

}
