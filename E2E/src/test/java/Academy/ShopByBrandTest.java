package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.MobilesPage;
import PageObjects.ShopByBrand;
import junit.framework.Assert;
import resources.base;

public class ShopByBrandTest extends base{	
	WebDriver driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializedriver();
		driver.get(prop.getProperty("url"));	
		
	}
	

	@Test
	public void ShopByBrandNokia() throws IOException
	{
				
		Homepage hp = new Homepage(driver);
		MobilesPage MP=hp.MobileLink();
		log.info("successfully click on mobile link in ShopByBrandNokiaLink method ");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement Element =driver.findElement(By.xpath("(//div[@class='bxc-grid__image   bxc-grid__image--light'])[18]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		/*WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='bxc-grid__image   bxc-grid__image--light'])[18]")));*/
		ShopByBrand SBB=MP.ShopByBrandNokiaLink();
		SBB.SelectColor().click();	
		Assert.assertTrue(true);
		log.info("Assertion pass in ShopByBrandNokiaLink");
		
		
	}
	
	@Test
	public void ShopByBrandNokia2() throws IOException
	{
				
		Homepage hp = new Homepage(driver);
		MobilesPage MP=hp.MobileLink();
		log.info("successfully click on mobile link in ShopByBrandNokiaLink method ");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement Element =driver.findElement(By.xpath("(//div[@class='bxc-grid__image   bxc-grid__image--light'])[18]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		/*WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='bxc-grid__image   bxc-grid__image--light'])[18]")));*/
		ShopByBrand SBB=MP.ShopByBrandNokiaLink();
		SBB.SelectColor().click();	
		Assert.assertTrue(true);
		log.info("Assertion pass in ShopByBrandNokiaLink");
		
		
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
}
