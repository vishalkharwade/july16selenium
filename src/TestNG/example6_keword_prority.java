package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example6_keword_prority {
	@Test(priority = 3)
	public void TC1() {
		Reporter.log("runnig Tc1",true);
		}
@Test(priority = 1)
	public void TC2() {
		Reporter.log("runnig Tc2",true);
		}
@Test(priority = 4)
	public void TC3() {
		Reporter.log("runnig Tc3",true);
		}
@Test(priority = 2)
	public void TC4() {
		Reporter.log("runnig Tc4",true);
		}

}
