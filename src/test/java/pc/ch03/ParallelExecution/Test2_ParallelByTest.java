package pc.ch03.ParallelExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2_ParallelByTest {

	public WebDriver driver;

	@Parameters("browser")

	@BeforeTest()
	public void SetUp(String browser) throws InterruptedException {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new EdgeDriver();
		}
		loadHomepage();
		searchText();
	}

	@Test 
	public void test1() {
		System.out.println("test1");
	}
	
	public void loadHomepage() throws InterruptedException {
		String baseURL = "https://www.Asda.co.uk/";
		String expectedTitle = "Asda";
		Thread.sleep(3000);
		driver.manage().window().maximize();

		driver.get(baseURL);
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");

		String actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Google search is launched");
		} else {
			System.out.println("Error in launching URL");
		}
	}

	
	public void searchText() {
		// search fruits
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits" + Keys.ENTER);
		System.out.println("search completed");
	}

	/*
	 * @AfterTest public void tearDown() { driver.close(); }
	 */
}
