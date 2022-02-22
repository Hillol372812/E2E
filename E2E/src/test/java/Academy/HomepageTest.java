package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoginPage;
import PageObjects.MobilesPage;
import PageObjects.ShopByBrand;
import junit.framework.Assert;
import resources.base;

public class HomepageTest extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
	
     public WebDriver driver;
	
	@BeforeTest	
	public void initialize() throws IOException {

		driver = initializedriver();
		driver.get("https://www.amazon.in/");
		log.info("URL launch successfully ");
	}

	@Test(dataProvider = "getdata", enabled = true)
	public void LaunchHomePage(String email, String Password) throws IOException {

		Homepage hp = new Homepage(driver);
		LoginPage lp = hp.SignInLink();
		lp.Email().sendKeys(email);
		lp.ContinueButton().click();
		lp.Password().sendKeys(Password);
		lp.LoginBtn().click();
		lp.AmazonLink();
		hp.AllSearchBx().sendKeys("Medicine");
		hp.AllSearchSubmitBtn().click();
		log.info("search result display");

	}

	@Test(enabled = true)

	public void ValidateSignlink() throws IOException {
		driver = initializedriver();
		driver.get(prop.getProperty("url"));
		log.info("navigate to home url");
		Homepage hp = new Homepage(driver);
		log.info("navigate to Login Page");
		LoginPage lp = hp.SignInLink();
		Assert.assertEquals("Amazon Sign I", driver.getTitle());
		log.info("Assertion successfully");

	}

	@Test(enabled = true)

	public void ShopByBrandNokiaLink() throws IOException {
		driver = initializedriver();
		driver.get(prop.getProperty("url"));
		Homepage hp = new Homepage(driver);
		MobilesPage MP = hp.MobileLink();
		ShopByBrand SBB = MP.ShopByBrandNokiaLink();
		SBB.SelectColor().click();
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Test@mail.com";
		data[0][1] = "Password1";
		data[1][0] = "Test2@mail.com";
		data[1][1] = "Password12";
		return data;
	}

	@AfterTest

	public void closebrowser() {
		driver.close();
		log.info("browser close successfully");
	}

}
