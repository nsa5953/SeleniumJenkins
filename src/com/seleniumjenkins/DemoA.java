package com.seleniumjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoA 
{
	@Test
	public void run()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\niat01\\eclipse-workspace\\SeleniumJenkins\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		String Expectedtitle = "Google";
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion" + Expectedtitle + Actualtitle);
		Assert.assertEquals(Actualtitle, Expectedtitle);
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + "Title matched" );		
	}
}
