package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example77_AssertClass2_asserNotEqual {
	@Test
	public void asserEquals() 
	{
		String actResult="Hi";
		String expResult="Hi";
		
		Assert.assertNotEquals(actResult, expResult,"Failed-> both results are same: ");
	}
}
