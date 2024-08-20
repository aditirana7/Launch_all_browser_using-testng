package com.launchbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_broswer {
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./Firefox_driver_jars/geckodriver.exe");
	FirefoxDriver driver =new FirefoxDriver();
	driver.get("https://auth.hollandandbarrett.com/u/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}