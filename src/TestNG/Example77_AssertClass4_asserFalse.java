package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example77_AssertClass4_asserFalse {
	@Test
	public void asserEquals() 
	{
		boolean actResult=true;
		Assert.assertFalse(actResult,"Failed-> actResult is true : ");
	
	}
}
