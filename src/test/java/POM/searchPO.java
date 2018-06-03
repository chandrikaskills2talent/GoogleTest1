package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.Basepage;

public class searchPO extends Basepage{	
	public searchPO(WebDriver driver) {
		super(driver);
	}	
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	private WebElement facebookLink;
	
	public WebElement facebooklink() {
		return facebookLink;
	}
}