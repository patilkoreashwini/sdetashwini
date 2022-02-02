package com.crm.Contact;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateContactTest {
	@Test(groups = "smokeTest")
	public void createcontactTest() {
		System.out.println("execute createcontactTest-SmokeTest");

	}
	
	@Test(groups = "regressionTest")
	public void modifycontactTest() {
		System.out.println("execute modifycontactTest-RegressionTest");
		String BROWSER = System.getProperty("BROWSER");
		String URL = System.getProperty("URL");
		String USERNAME = System.getProperty("USERNAME");
		String PASSWORD = System.getProperty("PASSWORD");
		WebDriver driver=null;
		if(BROWSER.equals("chrome"))
	    {
	    	driver=new ChromeDriver();
	    }
	    else if (BROWSER.equals("firefox"))
	    		{
	    	driver=new FirefoxDriver();
	    	
	    	 }
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@value='Login']")).submit();
		driver.quit();
		
		
	}
	

}


