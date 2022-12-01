package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class example3_TestNgAnnotation {
@BeforeClass
public void openBroweser() {
	Reporter.log("----opem broser",true);
}
@BeforeMethod public void ligintoApp() {
	Reporter.log("login to app",true);
}
@Test
public void verifyuserID() {
	Reporter.log("running varify  user",true);
}
@AfterMethod
public void LogOutFRmomApp() {
	Reporter.log("logout fromApp",true);
}

}
