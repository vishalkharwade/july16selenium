package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class example_keyword_vocationCount {
	
	 @Test(invocationCount = 3)
	public void Tc1() {
		Reporter.log("rinning TC1 ",true);
	}

}
