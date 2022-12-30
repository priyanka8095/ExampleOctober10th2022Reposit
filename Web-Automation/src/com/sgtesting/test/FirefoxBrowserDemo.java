package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();

	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new FirefoxDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate() {
		try
		{
			oBrowser.get(" D:\\ExampleAutomation\\Automation\\Web-Automation\\src\\com\\sgtesting\\test\\FirefoxBrowserDemo.java");
		}
			
		 catch (Exception e) {
		e.printStackTrace();
		}
	}
	

}
