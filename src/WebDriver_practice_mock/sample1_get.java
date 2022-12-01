package WebDriver_practice_mock;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class sample1_get {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.google.com/");
//	String Gettitile = driver.getTitle();
	//System.out.println(Gettitile);
	//String exp = "Google";
//	if(exp.equals(Gettitile)) {
	//	System.out.println("match re");
	//}else {System.out.println("try my dear");}
	  
		//String CurentURL = driver.getCurrentUrl();
	//	System.out.println(CurentURL);
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().window().minimize();
		//driver.close();
		//Dimension d=new Dimension(1250,750);
		//driver.manage().window().setSize(d);
		//Thread.sleep(2000);
		//driver.quit();
		//Point p=new Point(100,50);
		//driver.manage().window().setPosition(p);
		//Thread.sleep(3000);
		//driver.close();
		
		
		System.out.println("size of browser:"+driver.manage().window().getSize());
		
	System.out.println("Position of browser:"+driver.manage().window().getPosition());	
		
		
		
		
		
		
		
		
	}
		
		
		
	}
	
	
	
	

