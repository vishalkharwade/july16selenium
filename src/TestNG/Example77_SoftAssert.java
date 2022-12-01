package TestNG;

import org.testng.asserts.SoftAssert;

public class Example77_SoftAssert {
	@Test
	public void TC() 
	{
		SoftAssert soft=new SoftAssert();
		
		boolean actResult1=true;
		soft.assertFalse(actResult1,"Failed1-> actResult is true : ");
		
		String actResult="Hi";
		String expResult="Hello";
		soft.assertEquals(actResult, expResult,"Failed2: both results are diffrent  : ");	
		
		soft.assertAll();
	}
}
