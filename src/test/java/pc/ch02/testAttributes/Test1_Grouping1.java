package pc.ch02.testAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1_Grouping1 {

	@Test(groups = "Login")
	public void Login() {
		System.out.println("Login");
		Reporter.log("Login");
	}

	@Test(groups = "Search")
	public void Search() {
		System.out.println("Search");
		Reporter.log("Search");
	}

	@Test(groups ="Filter")
	public void filterByBrand() {
		System.out.println("filterByBrand");
		Reporter.log("filterByBrand");
	}

	@Test(groups ="Filter")
	public void filterByCategory() {
		System.out.println("filterByCategory");
		Reporter.log("filterByCategory");
	}

	@Test(groups = "Logout")
	public void logOut() {
		System.out.println("logout");
		Reporter.log("logout");
	}
}
