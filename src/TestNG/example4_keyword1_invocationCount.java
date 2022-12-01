package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class example4_keyword1_invocationCount {
	
	@Test(invocationCount = 2)
	public void TC1() {
	Reporter.log("runnig Tc1",true);
	}

}
