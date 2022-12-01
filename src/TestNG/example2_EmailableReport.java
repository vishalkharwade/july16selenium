package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example2_EmailableReport {

	@Test
	public void TC1(){
		Reporter.log("runnig test case 1",true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("runnig test case2",true);
	}
	
	@Test
	public void TC3() {
		Reporter.log("runnig test case3",true);
	}
	
	
}
