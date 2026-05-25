package pc.ch03.ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Test1_ParallelByTest {

	public WebDriver driver;

	@Parameters({"browser","url"})

	@BeforeTest()
	public void InitialiseBrowser(String browser, String baseURL) throws InterruptedException {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new EdgeDriver();
		}

		//String baseURL = "https://www.google.co.uk/";
		String expectedTitle = "Google";
		Thread.sleep(3000);
		driver.manage().window().maximize();

		driver.get(baseURL);
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]")).click();
		String actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Google search is launched");
		} else {
			System.out.println("Error in launching URL");
		}
	}

	@Test
	public void searchText() {
		driver.findElement(By.name("q")).sendKeys("asda");
	}

	/*
	 * @AfterTest public void tearDown() { driver.close(); }
	 */
}
