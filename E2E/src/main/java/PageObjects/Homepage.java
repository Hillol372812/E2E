package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	By SignInLink = By.xpath("//span[text()='Hello, Sign in']");
	By MobileLink = By.linkText("Mobiles");
	By AllSearchBx = By.cssSelector("input[id*='twotabse']");
	By AllSearchSubmitBtn = By.cssSelector("input[class='nav-input']");

	

	public MobilesPage MobileLink() {
		driver.findElement(MobileLink).click();
		return new MobilesPage(driver);
		
	}
	public LoginPage SignInLink() {
		driver.findElement(SignInLink).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
	}

	public WebElement AllSearchBx() {
		return driver.findElement(AllSearchBx);
	}

	public WebElement AllSearchSubmitBtn() {
		return driver.findElement(AllSearchSubmitBtn);
	}

	

}
