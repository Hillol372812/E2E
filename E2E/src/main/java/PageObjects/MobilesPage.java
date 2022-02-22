package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobilesPage {

	WebDriver driver;

	public MobilesPage(WebDriver driver) {
		this.driver = driver;
	}

	By ShopByBrandNokiaLink = By.xpath("(//div[@class='bxc-grid__image   bxc-grid__image--light'])[18]");

	public  ShopByBrand ShopByBrandNokiaLink() {
		
		driver.findElement(ShopByBrandNokiaLink).click();
		return new ShopByBrand(driver);
		
	}

}
