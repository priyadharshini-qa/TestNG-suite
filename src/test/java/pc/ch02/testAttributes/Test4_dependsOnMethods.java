package pc.ch02.testAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4_dependsOnMethods {

	@Test(groups = "Login")
	public void Login() {
		System.out.println("Login");
		Reporter.log("Login");
	}
	@Test(groups = "Login")
	public void Login2() {
		System.out.println("Login2");
		Reporter.log("Login2");
	}
	@Test(groups = "Login")
	public void Login3() {
		System.out.println("Login3");
		Reporter.log("Login3");
	}
	@Test(groups = "Login")
	public void Login4() {
		System.out.println("Login4");
		Reporter.log("Login4");
	}

	@Test(groups = "Search", dependsOnMethods = {"Login","Login4"})
	public void Search() {
		System.out.println("Search");
		Reporter.log("Search");
	}

	@Test(groups = "Filter", dependsOnMethods = "Search")
	public void filterByBrand() {
		System.out.println("filterByBrand");
		Reporter.log("filterByBrand");
	}

	@Test(groups = "Filter", dependsOnMethods = "Search")
	public void filterByCategory() {
		System.out.println("filterByCategory");
		Reporter.log("filterByCategory");
	}

	@Test(dependsOnMethods = { "Login", "Search" })
	public void billing() {
		System.out.println("billing");
		Reporter.log("billing");
	}

	@Test(dependsOnMethods = "Login")
	public void logOut() {
		System.out.println("logout");
		Reporter.log("logout");
	}
}
