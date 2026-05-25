package pc.ch04.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2_hardAssert {

	@Test
	public void hartAssertDemo() {
		String expectedTitle = "Asda.com";
		String actualTitle = "Asda.com  Demo";
		Assert.assertEquals(expectedTitle,actualTitle,"Titles dont match");
		System.out.println("moving to next assertion");
		int expectedCount=5;
		int actualCount=2;
		Assert.assertEquals(expectedCount,actualCount,"Count dont match");
		
	}

}
