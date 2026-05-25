package pc.ch01.basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Annotation2_Method {
	// TODO Auto-generated method stub
	/**
	 * This method is to setup browser
	 *
	 * @author: Priya
	 * @param: This method doesn't require any parameter
	 */
	@BeforeMethod
	public void setUp() {
		// TODO Auto-generated method stub
		System.out.println("Browser setup done");
	}

	@Test
	public void demoTest1() {
		System.out.println("This is demoTest1");
	}

	@Test
	private void demoTest2() {
		System.out.println("This is demoTest2");
	}

	@AfterMethod
	public void tearDown() {
		// TODO Auto-generated method stub
		System.out.println("Close browser");
	}
}
