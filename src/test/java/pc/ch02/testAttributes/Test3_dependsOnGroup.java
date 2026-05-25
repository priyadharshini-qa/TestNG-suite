package pc.ch02.testAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3_dependsOnGroup {

	@Test(groups = "Login")
	public void Login() {
		System.out.println("Login");
		Reporter.log("Login");
	}

	@Test(groups = "Search", dependsOnGroups = "Login")
	public void Search() {
		System.out.println("Search");
		Reporter.log("Search");
	}

	@Test(groups = "Filter", dependsOnGroups = "Search")
	public void filterByBrand() {
		System.out.println("filterByBrand");
		Reporter.log("filterByBrand");
	}

	@Test(groups = "Filter", dependsOnGroups = "Search")
	public void filterByCategory() {
		System.out.println("filterByCategory");
		Reporter.log("filterByCategory");
	}
	@Test(groups = "Billing", dependsOnGroups = {"Login","Search"})
	public void billing() {
		System.out.println("billing");
		Reporter.log("billing");
	}

	@Test(groups = "Logout", dependsOnGroups = "Login")
	public void logOut() {
		System.out.println("logout");
		Reporter.log("logout");
	}
}
