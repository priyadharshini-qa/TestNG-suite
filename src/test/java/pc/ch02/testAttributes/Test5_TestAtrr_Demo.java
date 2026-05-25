package pc.ch02.testAttributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5_TestAtrr_Demo {

	@Test
	public void demoTest() {
		System.out.println("This is demoTest method");
	}

	@Test(priority = 1, groups="smoke", dependsOnMethods = "demoTest")
	public void demoTest1() {
		System.out.println("This is demoTest1 method");
	}
	@Test(groups="smoke", dependsOnMethods = "demoTest")
	public void demoTest1a() {
		System.out.println("This is demoTest1a method");
		Assert.fail();
	}
	@Test(priority = 2, groups="Regression", dependsOnGroups = "smoke")
	public void demoTest2() {
		System.out.println("This is demoTest2 method");
	}
	@Test(priority = 3, groups="Regression", dependsOnGroups = "smoke",alwaysRun = true)
	public void demoTest3() {
		System.out.println("This is demoTest3 method");
	}
	@Test(priority = 4, enabled = true)
	public void demoTest4() {
		System.out.println("This is demoTest4 method");
		
	}
	@Test(priority = 5, enabled = true, dependsOnMethods = "demoTest4",alwaysRun = true)
	public void demoTest5() {
		System.out.println("This is demoTest5 method");
	}
	@Test(priority = 6, enabled = false, dependsOnMethods = "demoTest4",alwaysRun = true)
	public void demoTest6() {
		System.out.println("This is demoTest6 method");
	}
	@Test(priority = 7, alwaysRun = true)
	public void demoTest7() {
		System.out.println("This is demoTest7 method");
	}
	@Test(priority = 8, alwaysRun = false)
	public void demoTest8() {
		System.out.println("This is demoTest8 method");
	}
	@Test(priority = 9, alwaysRun = false,enabled = true,groups = "sanity")
	public void demoTest9() {
		System.out.println("This is demoTest9 method");
	}
	@Test(priority = 10, alwaysRun = true,enabled = false)
	public void demoTest10() {
		System.out.println("This is demoTest10 method");
	}
	@Test(priority = 11, dependsOnGroups = "sanity", dependsOnMethods ="demoTest8" )
	public void demoTest11() {
		System.out.println("This is demoTest11 method");
	}
	@Test(priority = 12, dependsOnMethods ="demoTest9",dependsOnGroups = "smoke" )
	public void demoTest12() {
		System.out.println("This is demoTest12 method");
	}
	
	
	
	
}
