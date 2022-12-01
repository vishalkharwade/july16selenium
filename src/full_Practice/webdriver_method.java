package full_Practice;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webdriver_method {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\new version\\chromedriver_win32\\chromedriver.exe" );
		
	
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

Thread.sleep(1000);
WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
Thread.sleep(1000);
WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

Select D=new Select(Day);
Select m=new Select(month);
Select y=new Select(year);

Thread.sleep(1000);
D.selectByVisibleText("7");
Thread.sleep(500);
m.selectByVisibleText("Sep");
Thread.sleep(500);
y.selectByVisibleText("1993");
List<WebElement> opt = m.getOptions();
TreeSet<String>tr=new TreeSet<String>();
System.out.println("size of  month :"+opt.size());
for(WebElement o:opt) {
	String str = o.getText();
	tr.add(str);
	
}
System.out.println("________");
	Iterator<String>RR=tr.descendingIterator();
	while(RR.hasNext()) {
		System.out.println(RR.next());
	}


	}
}
//System.out.println("--Printing month in Acending order--");
//for(String p:tr) {
//	System.out.println(p);
//}
