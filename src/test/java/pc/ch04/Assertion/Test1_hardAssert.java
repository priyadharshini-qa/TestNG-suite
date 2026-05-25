package pc.ch04.Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test1_hardAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testAssertEquals();
		// testAssertNotEquals();
		// testAssertTrue();
		// testAssertFalse();
		// testAssertSame();
		//testAssertNotSame();
		testAssertFail();
	}

	

	public static void testAssertEquals() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		// Asda.com - Online Food Shopping, George, & more
		String expectedTitle = "Asda.com - Online Food Shopping, George, & more";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle, "This error appeared since Title is not a match");
		System.out.println("done");
	}

	private static void testAssertNotEquals() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		String expectedTitle = "Asda.com  Online Food Shopping, George, & more";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle, "This error appeared since Titles match");
	}

	private static void testAssertTrue() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().window().maximize();
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		// search fruits
		WebElement searchbtn = driver.findElement(By.xpath("/html/body/div[1]/div/header/div/form/button"));
		// verify search button is displayed
		Assert.assertTrue(searchbtn.isDisplayed(), "Search button is displayed");
		Assert.assertFalse(false, null);
		System.out.println("done");
	}

	private static void testAssertFalse() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().window().maximize();
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		// search fruits
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits" + Keys.ENTER);
		// verify search results are not empty
		// co-product
		WebElement searchResults = driver.findElement(By.className("co-product"));
		Assert.assertNotNull(searchResults, "Search results are null");
		System.out.println("completed1");
		Assert.assertTrue(searchResults.getText().isBlank(), "Search results are empty");
		// Assert.assertTrue(searchResults.getText().isEmpty(), "Search results are
		// empty");
		System.out.println("completed2");

	}

	private static void testAssertSame() {
		// TODO Auto-generated method stub
		// Asda.com - Online Food Shopping, George, & more
		String expectedTitle = "Asda.com - Online Food Shopping, George, & more";
		String actualTitle = performAsda();
		Assert.assertSame(actualTitle, expectedTitle, "Titles dont match");
		System.out.println("done");
	}

	private static String performAsda() {
		// TODO Auto-generated method stub
		String asdaTitle = "Asda.com - Online Food Shopping, George, & more";
		return asdaTitle;
	}

	private static void testAssertNotSame() {
		// TODO Auto-generated method stub
		
		String firstLink = "https://www.asda.com/";
		String secondLink = "https://www.tesco.com/";
		Assert.assertSame(firstLink, secondLink, "Links are same");
		System.out.println("done");
	}
	private static void testAssertFail() {
		// to fail the test explicitly
		//Assert.fail();
		Assert.fail("assert failed");
		System.out.println("done");
	}
	
}
