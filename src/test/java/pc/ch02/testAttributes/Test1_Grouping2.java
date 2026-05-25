package pc.ch02.testAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1_Grouping2 {

	@Test(groups = "Login")
	public void loginWithValidCredentials() {
		System.out.println("loginWithValidCredentials");
		Reporter.log("loginWithValidCredentials");
	}

	@Test(groups = "Login")
	public void loginWithInvalidCredentials() {
		System.out.println("loginWithInvalidCredentials");
		Reporter.log("loginWithInvalidCredentials");
	}
	@Test(groups = {"Login","Search","Logout"})
	public void selectProduct() {
		System.out.println("selectProduct");
		Reporter.log("selectProduct");
	}
	@Test(groups = {"Login","Search"})
	public void addToCart() {
		System.out.println("addToCart");
		Reporter.log("addToCart");
	}
	@Test
	public void logOut() {
		System.out.println("logout");
		Reporter.log("logout");
	}
}
