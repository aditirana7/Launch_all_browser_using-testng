package com.launchbrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class ALL_browser_testng1 {
	WebDriver driver;
	@Test(priority=1)
	public void ChromeBrowserLaunch() throws Exception{
		System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}
	@Test(priority=2)
	public void EdgeBroswerLaunch() throws Exception{
			System.setProperty("webdriver.edge.driver","./Edge_Driver_Jars/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://auth.hollandandbarrett.com/u/login");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.manage().window().minimize();
			driver.quit();
	
	}
	@Test(priority=3)
	public void FirefoxBroswerLaunch() throws Exception{
			System.setProperty("webdriver.gecko.driver","./Firefox_driver_jars/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://auth.hollandandbarrett.com/u/login");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.manage().window().minimize();
			driver.quit();
	}
}

