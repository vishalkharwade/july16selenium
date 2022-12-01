package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example55_keyword5_dependOnmethod {
	@Test
	public void Login1() {
		Reporter.log("runnig Tc1",true);
		}
	@Test
	public void Login2() {
		Reporter.log("runnig Tc2",true);

}
	@Test(dependsOnMethods = {"Login1","Login2"})
	public void Logout() {
		Reporter.log("runnig Tc2",true);

}}
