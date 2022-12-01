package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example7_timeout {
	@Test(timeOut = 5000)
	public void TC1() throws InterruptedException {
		Thread.sleep(700);
		Reporter.log("runnig Tc1",true);
		}
@Test
	public void TC2() {
		Reporter.log("runnig Tc2",true);
		}
@Test(enabled = false)
	public void TC3() {
		Reporter.log("runnig Tc3",true);
		}
@Test(enabled = false)
	public void TC4() {
		Reporter.log("runnig Tc4",true);
		}
}
