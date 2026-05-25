package pc.ch05.dataProviders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1_Dataprovider_properties {

	public WebDriver driver;
	static Properties testdata;

	@BeforeClass
	public void setUpPropFile() throws IOException, InterruptedException {
		testdata = new Properties();
		FileInputStream prop_file = new FileInputStream(
				"C:\\Users\\Priyadharshini\\eclipse-workspace\\04_TestNG\\src\\test\\resources\\Config.properties");
		testdata.load(prop_file);

		System.out.println("Property file setup completed");
	}

	@BeforeMethod

	public void setUp() throws InterruptedException {
		String browser1 = testdata.getProperty("browser1");
		System.out.println(browser1);
		String URL = testdata.getProperty("URL");
		String cookies = testdata.getProperty("cookies");
		if (browser1.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement acceptcookies = driver.findElement(By.xpath(cookies));
			acceptcookies.click();
			System.out.println("accepted the cookies");
		}
		if (browser1.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			WebElement acceptcookies = driver.findElement(By.xpath(cookies));
			acceptcookies.click();
			System.out.println("accepted the cookies");
		}
	}

	@Test(priority = 1)
	public void testLogin1() {
		String loginbtn = testdata.getProperty("loginbtn");
		String entername = testdata.getProperty("entername");
		String enterpswd = testdata.getProperty("enterpswd");
		String username1 = testdata.getProperty("username1");
		String password1 = testdata.getProperty("password1");
		driver.findElement(By.className(loginbtn)).click();

		WebElement name_field = driver.findElement(By.cssSelector(entername));
		name_field.sendKeys(username1);
		WebElement pswd_field = driver.findElement(By.id(enterpswd));
		pswd_field.sendKeys(password1);
		System.out.println("testLogin1 done");

	}

	@Test(priority = 2, enabled = false)
	public void testLogin2() {
		String loginbtn = testdata.getProperty("loginbtn");
		String entername = testdata.getProperty("entername");
		String enterpswd = testdata.getProperty("enterpswd");
		String username2 = testdata.getProperty("username2");
		String password2 = testdata.getProperty("password2");
		driver.findElement(By.className(loginbtn)).click();
		WebElement name_field = driver.findElement(By.cssSelector(entername));
		name_field.sendKeys(username2);
		WebElement pswd_field = driver.findElement(By.id(enterpswd));
		pswd_field.sendKeys(password2);
		System.out.println("testLogin2 done");
	}

	@Test(priority = 3, enabled = false)
	public void testLogin3() {
		String loginbtn = testdata.getProperty("loginbtn");
		String entername = testdata.getProperty("entername");
		String enterpswd = testdata.getProperty("enterpswd");
		String username3 = testdata.getProperty("username3");
		String password3 = testdata.getProperty("password3");
		driver.findElement(By.className(loginbtn)).click();
		WebElement name_field = driver.findElement(By.cssSelector(entername));
		name_field.sendKeys(username3);
		WebElement pswd_field = driver.findElement(By.id(enterpswd));
		pswd_field.sendKeys(password3);
		System.out.println("testLogin3 done");
	}

	@Test(priority = 4, enabled = true)
	public void Search() {
		String searchbox = testdata.getProperty("searchbox");
		String searchtext1 = testdata.getProperty("searchtext1");

		WebElement searchText = driver.findElement(By.xpath(searchbox));
		searchText.sendKeys(searchtext1 + Keys.ENTER);

		System.out.println("search done");
	}

	@AfterMethod
	public void tearDownBrowser() {
		// driver.close();
		System.out.println("Browser closed");
	}

	@AfterClass
	public void tearDownPropFile() {
		testdata.clear();
		System.out.println("property file closed");

	}
}