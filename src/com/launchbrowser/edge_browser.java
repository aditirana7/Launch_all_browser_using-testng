package com.launchbrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class edge_browser {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","./Edge_Driver_Jars/msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
