package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopByBrand {
	WebDriver driver;

	public ShopByBrand(WebDriver driver) {
		this.driver = driver;
	}

	By SelectColor = By.xpath("//div[@class='colorsprite aok-float-left']");

	

	public  WebElement SelectColor() {
		return driver.findElement(SelectColor);
		
	}
	
	

}
