package com.launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser {
	public static void main(String args[]) throws InterruptedException
	{
		//key and value copy only .exe file
		System.setProperty(" webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Aditi Rana\\Selinium class\\Selenium Practices\\Launch_chrome_browser\\Chrome_driver_jars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
		}
}
