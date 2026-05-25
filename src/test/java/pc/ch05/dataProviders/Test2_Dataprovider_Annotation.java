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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2_Dataprovider_Annotation {

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

	@Test(dataProvider = "passlogindata", enabled=false)
	public void testLogin(String username, String password) {
		String loginbtn = testdata.getProperty("loginbtn");
		String entername = testdata.getProperty("entername");
		String enterpswd = testdata.getProperty("enterpswd");

		driver.findElement(By.className(loginbtn)).click();
		// getting input from property file
		WebElement name_field = driver.findElement(By.cssSelector(entername));
		// getting input from Dataprovider annotation
		name_field.sendKeys(username);
		WebElement pswd_field = driver.findElement(By.id(enterpswd));
		pswd_field.sendKeys(password);
		System.out.println("testLogin1 done");
	}

	@Test(dataProvider = "passSearchdata")
	public void Search(String searchtext) {
		String searchbox = testdata.getProperty("searchbox");
		// getting input from property file
		WebElement searchText = driver.findElement(By.xpath(searchbox));
		// getting input from Dataprovider annotation
		searchText.sendKeys(searchtext + Keys.ENTER);

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

	@DataProvider
	public Object[][] passlogindata() {
		Object[][] data = new Object[2][2];
		// 1st row
		data[0][0] = "username1@gmail.com";// 1st row 1st col
		data[0][1] = "password1";// 1st row 2nd col
		// 2nd row
		data[1][0] = "username2@gmail.com";// 2nd row 1st col
		data[1][1] = "password2";// 2nd row 2nd col
		return data;

	}
	@DataProvider
	public Object[][] passSearchdata() {
		Object[][] data = new Object[2][1];
		// 1st row
		data[0][0] = "fruits";// 1st row 1st col
		data[1][0] = "toys";// 1st row 2nd col
		
		return data;

	}

}
