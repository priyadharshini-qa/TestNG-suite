package pc.ch01.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Annotation3_Class {

	/**
	 * This class is to setup browser
	 *
	 * @author: Priya
	 * @param: This method doesn't require any parameter
	 */
	@BeforeClass
	public void setUp() {
		// TODO Auto-generated method stub
		System.out.println("Browser setup done--> This is beforeclass of Test_Annotation3_Class");
	}

	/**
	 * This test method is to perform demotest1
	 * 
	 * @param: This method doesn't require any parameter
	 * @author: Priya
	 */
	@Test
	public void demoTest1() {
		System.out.println("This is demoTest1 of Test_Annotation1_Test");
	}

	/**
	 * This test method is to perform demotest2
	 * 
	 * @param: This method doesn't require any parameter
	 * @author: Priya
	 */
	@Test
	private void demoTest2() {
		System.out.println("This is demoTest2 of Test_Annotation1_Test");
	}

	/**
	 * This class is to close browser
	 * 
	 * @param: This method doesn't require any parameter
	 * @author: Priya
	 * 
	 */
	@AfterClass
	public void tearDown() {
		// TODO Auto-generated method stub
		System.out.println("Close browser of AfterClass of Test_Annotation3_Class");
	}
}
