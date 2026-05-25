package pc.ch01.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * This class is child class
 *
 * @author: Priya
 * @param: This method doesn't require any parameter
 */
//TestNG_Annotation1_xml file
//public class Test_Annotation4_Demo2 {
// TODO Auto-generated method stub
//TestNG_Annotation2_xml file
public class Test_Annotation4_Demo2 extends Test_Annotation4_Demo1 {
	@BeforeSuite
	public void runSeleniumserver() {
		System.out.println("Child class-before suite method");
	}

	@BeforeTest
	public void setupDB() {
		System.out.println("Child class-before Test method");
	}

	@BeforeClass
	public void browserSetUp() {
		System.out.println("Child class-before Class method");
	}

	@BeforeMethod
	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Child class-before method");
	}

	@Test
	public void demoTest1() {
		System.out.println("Child class-test method1");
	//	Test1();
	}

	@Test
	private void demoTest2() {
		System.out.println("Child class-test method2");
		//Test2();
	}

	@AfterMethod
	public void Logout() {
		// TODO Auto-generated method stub
		System.out.println("Child class-after method");
	}

	@AfterClass
	public void browserTearDown() {
		System.out.println("Child class-After Class method");
	}

	@AfterTest
	public void CloseDB() {
		System.out.println("Child class-After Test method");
	}

	@AfterSuite
	public void StopserverRun() {
		System.out.println("Child class-After suite method");
	}
}
