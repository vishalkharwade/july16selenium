package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_dependonMethod {

	
	@Test
	public void Login() {
		Reporter.log("runnig login TC--",true);
	}
	@Test(dependsOnMethods = {"Login"})
	public void Logout() {
		Reporter.log("Running logout Tc",true);
	}
}
