package pc.ch02.testAttributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5_OtherAttributes {

	@Test(priority=5,enabled = false)
	void aboutLink() {
		System.out.println("about link enabled");
	}
	@Test(priority=1,description="This is to login")
	void login() {
		System.out.println("Login successful");
	}
	@Test(priority=2,dependsOnMethods = "login",alwaysRun = true)
	void search() {
		System.out.println("Search completed");
		Assert.fail();
	}
	//@Test(priority=3,alwaysRun = false)
	//@Test(alwaysRun = false)
	@Test(priority=2,dependsOnMethods = "search",alwaysRun = false)
	void filterProduct() {
		System.out.println("filterProduct completed");
	}
	@Test(priority=3,timeOut = 1000)
	void Billing() {
		System.out.println("Billing done");
	}
	
}
