package pc.ch02.testAttributes;

import org.testng.annotations.Test;

public class Test2_Priority1 {
	@Test(groups = "login", priority = 1)
	public void login() {
		System.out.println("Login successful");
		
	}

	@Test(groups = "search", priority = 2)
	public void searchProduct() {
		System.out.println("product search completed");
	}

	@Test(groups = "shopping", priority = 3)
	public void addToCart() {
		System.out.println("product items finalised");
	}

	@Test(groups = "billing", priority = 5)
	public void makePymt() {
		System.out.println("billing done");
	}

	@Test(groups = "logout", priority = 4)
	public void logout() {
		System.out.println("Logout successful");
	}

}
