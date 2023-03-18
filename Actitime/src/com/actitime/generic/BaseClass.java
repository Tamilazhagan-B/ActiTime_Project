package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.Login_page;

public class BaseClass {
	public  static WebDriver driver;
	FileLib fl=new FileLib();
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
		public static void impWait()
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@BeforeClass
		public void openBrowser() throws IOException
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			impWait();
			String url = fl.getPropertyData("url");
			driver.get(url);	
			Reporter.log("Browser opened",true);
		}
		@AfterClass
		public void closeWindow()
		{
			driver.close();
			Reporter.log("Browser closed",true);
			
		}
		@BeforeMethod
		public void login() throws IOException
		{
			
			impWait();
			Login_page lp=new Login_page(driver);
			String un = fl.getPropertyData("un");
			String pwd = fl.getPropertyData("pwd");
			lp.setLogin(un, pwd);
			Reporter.log("login",true);
			
		}
		@AfterMethod
		public void logout() throws InterruptedException
		{
			impWait();
			HomePage h=new HomePage(driver);
			h.logout();
			Reporter.log("logout",true);
		}		
}



