package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.Googlepo;
import POM.searchPO;
import library.Basetest;

public class test1 extends Basetest{	
	@Test
	public void testFacebookHome() {
		try {
			driver.get("https://www.google.com/");
			Googlepo googlePO=new Googlepo(driver);
			googlePO.searchTxtBx().sendKeys("facebook"+Keys.ENTER);
			searchPO searchPO=new searchPO(driver);
			searchPO.verifyElement(searchPO.facebooklink());
			searchPO.facebooklink().click();
			String eTitle = "Facebook – log in or sign up";
			wait.until(ExpectedConditions.titleContains(eTitle));
			String aTitle =driver.getTitle();
			Reporter.log("Title displayed is"+aTitle, true);
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {
			Assert.fail();
		}
	}

}
