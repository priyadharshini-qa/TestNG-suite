package pc.ch04.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3_softAssert {

	@Test
	public void softAssertDemo() {
		//Instantiate softAssert
		SoftAssert softAssert=new SoftAssert();
		
		String expectedTitle = "Asda.com";
		String actualTitle = "Asda.com  Demo";
		
		softAssert.assertEquals(expectedTitle,actualTitle,"Titles dont match");
		System.out.println("moving to next assertion");
		int expectedCount=5;
		int actualCount=5;
		
		softAssert.assertEquals(expectedCount,actualCount,"Count dont match");
		
		//This is crucial for soft assertions to view assert info in console
		softAssert.assertAll();
		//softAssert.assertAll("Assertion error");
	}

}
