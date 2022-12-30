package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutUsingChromeBrowser {
		public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutwindow();
		logout();
		closeApp();

	}
	private static void launchBrowser(){
	 
		 {
		try
		{
			System.setProperty("Webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		 
		 }
	}
	
	 
	private static void navigate()
	{try
	{
		oBrowser.get("http://localhost:81/login.do ");
		Thread.sleep(5000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
		
	}
	private static void login() {
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		
		}catch (Exception e)
		{
			e.printStackTrace();
		}
			
		}
		
	private static void minimizeFlyOutwindow() {
		try
		{
		 oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();	
		 Thread.sleep(6000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
			
		}
	private static void logout() {
		try
		{
		  oBrowser.findElement(By.id("logoutLink"))	.click();
		  Thread.sleep(6000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
			
		}
	private static void closeApp()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
			
		}
	}
	
	
	


	
