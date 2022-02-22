package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializedriver() throws IOException {
		
		 prop = new Properties();
	
		FileInputStream fis = new FileInputStream(
				"E:\\Desktop\\Selenium WorkSpace\\E2E\\src\\main\\java\\Data.properties");
		prop.load(fis);
		String BrowserName = prop.getProperty("browsername");
		System.out.println(BrowserName);
		if(BrowserName.equals("chrome")) {
//			System.setProperty("webdriver.chrme.driver",
//					"C:\\Users\\Hillol\\Desktop\\Eclipse\\Gecko driver\\geckodriver.exe");
			//WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();		
		} else if (BrowserName.equals("Firefox")) {
			System.out.println("Firefox browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenshotpath(String Testcasename,WebDriver driver) throws IOException
	{
		TakesScreenshot TS=(TakesScreenshot)driver;
		File source=TS.getScreenshotAs(OutputType.FILE);
		String Destination=System.getProperty("user.dir")+"//reports//"+Testcasename+".png";
		FileUtils.copyFile(source,new File(Destination));
		return Destination;
		
	}

}
