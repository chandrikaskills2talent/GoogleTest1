package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Constants {
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty(CHROME_KEY,CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, 20);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}



