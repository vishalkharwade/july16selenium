package POM_TSNG_SCRREENALL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class wishlist {
	WebDriver driver;
	
	
	@FindBy(xpath = "//div[@id='watchlistSelect_dropdown']")private WebElement drop;
	
	@FindBy(xpath = "//div[@id='new-watchlist_suffix']")private WebElement selc;
	@FindBy(xpath = "//div[@id='Mock_title']")private WebElement mctlc;
	@FindBy(xpath = "//div[@id='watchlistAdd']")private WebElement addc;
	@FindBy(xpath = "//div[@class='_2qSoU5m9p_WTwxgb5exwsU _2MBORvY3t6NJsLnmzvwK2m']/input[1]")private WebElement keys;
	@FindBy(xpath = "//button[@id='NSE_EQ|1330']")private WebElement Bc;
	
	public wishlist(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	 //driver.findElement(By.xpath("//div[@class='_2qSoU5m9p_WTwxgb5exwsU _2MBORvY3t6NJsLnmzvwK2m']/input[@type='text']")).sendKeys("mock");
	//driver.findElement(By.xpath("//div[@class='_2Zj7zuh0aYIa3JQ9dKvLkB']//button[@type='submit']")).click();




	public void wishlistdrops1c() {
		drop.click();
		
	}
	
		public void wishlistsel2c() {
			selc.click();
		}
		public void wishlistselec3c() {
			mctlc.click();
		}
		public void wishlistaddc4c() {
			addc.click();
		}
		public void wishlistsend5s(String wish) {
			keys.sendKeys(wish);
		}
		public void wishlistclick6c() {
			Bc.click();
		}
		
	}
