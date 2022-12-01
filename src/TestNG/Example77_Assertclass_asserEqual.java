package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example77_Assertclass_asserEqual {
	@Test
	public void asserEquals() 
	{
		String actResult="Hi";
		String expResult="Hi";
		
		Assert.assertEquals(actResult, expResult,"Failed: both results are diffrent  : ");
	}

}
