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
 * This class is parent class
 *
 * @author: Priya
 * @param: This method doesn't require any parameter
 */

public class Test_Annotation4_Demo1  {
	@BeforeSuite
	public void runSeleniumserver() {
		System.out.println("Parent class-before suite method");
	}

	@BeforeTest
	public void setupDB() {
		System.out.println("Parent class-before Test method");
	}

	@BeforeClass
	public void browserSetUp() {
		System.out.println("Parent class-before Class method");
	}

	@BeforeMethod
	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Parent class-before method");
	}

	@Test
	public void Test1() {
		System.out.println("Parent class-test method1");
	}

	@Test
	public void Test2() {
		System.out.println("Parent class-test method2");
	}

	@AfterMethod
	public void Logout() {
		// TODO Auto-generated method stub
		System.out.println("Parent class-after method");
	}
	@AfterClass
	public void browserTearDown() {
		System.out.println("Parent class-After Class method");
	}
	@AfterTest
	public void CloseDB() {
		System.out.println("Parent class-After Test method");
	}
	@AfterSuite
	public void StopserverRun() {
		System.out.println("Parent class-After suite method");
	}
}
