package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.actitime.POM.HomePage;
import com.actitime.POM.LoginPage;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void login() throws IOException 
	{
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un,pwd);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("login",true);
		HomePage h=new HomePage(driver);
		h.setLogout();		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
