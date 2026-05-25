package pc.ch01.basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Annotation1_Test {

	// TODO Auto-generated method stub
	/** This method is to setup browser
	*
	* @author: Priya
	* @param: This method doesn't require any parameter
	*/
	@BeforeTest
	public void setUp() {
		// TODO Auto-generated method stub
		System.out.println("Browser setup done--> This is beforeTest of Test_Annotation1_Test");
	}
	/** This method is to perform demotest1
	* 
	* @param: This method doesn't require any parameter
	* @author: Priya
	* 	*/
	@Test
	public void demoTest1() {
		System.out.println("This is demoTest1 of Test_Annotation1_Test");
	}
	/** This method is to perform demotest2
	* 
	* @param: This method doesn't require any parameter
	* @author: Priya
	* 	*/
	@Test
	private void demoTest2() {
		System.out.println("This is demoTest2 of Test_Annotation1_Test");
	}
	/** This method is to close browser
	* 
	* @param: This method doesn't require any parameter
	* @author: Priya
	* 
	* 	*/
	@AfterTest
	public void tearDown() {
		// TODO Auto-generated method stub
		System.out.println("Close browser of AfterTest of Test_Annotation1_Test");
	}
}
