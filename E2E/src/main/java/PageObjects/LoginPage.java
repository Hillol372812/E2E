package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By Email = By.cssSelector("input[id='ap_email']");
	By ContinueButton = By.cssSelector("input[id='continue']");
	By Password = By.cssSelector("input[id*='ap_p']");
	By LoginBtn = By.cssSelector("input[id='signInSubmit']");
	By AmazonLink  =By.xpath("//a[@class='a-link-nav-icon']");

	public WebElement Email() {
		return driver.findElement(Email);
	}

	public WebElement ContinueButton() {
		return driver.findElement(ContinueButton);
	}

	public WebElement Password() {
		return driver.findElement(Password);
	}

	public WebElement LoginBtn() {
		return driver.findElement(LoginBtn);
	}
	
	public Homepage AmazonLink() {
		 driver.findElement(AmazonLink).click();
		 return new Homepage(driver);		 
	}

}
