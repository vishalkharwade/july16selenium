package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example77_AssertClass3_asserTrue {
	@Test
	public void asserEquals() 
	{
		boolean actResult=false;
		Assert.assertTrue(actResult,"Failed: actResult is false");
	
	}
}
