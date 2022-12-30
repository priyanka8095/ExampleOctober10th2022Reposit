package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutUsingFirefoxBrowser {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login() ;
		minimizeFlyOutwindow();
		logout();
		

	}
	private static void launch()
	{
		try
		{
			System.setProperty(" WebDriver.firefox.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\src\\com\\sgtesting\\test\\LoginLogoutUsingFirefoxBrowser.java ");
			oBrowser=new FirefoxDriver();
		}catch  (Exception e) {
		  e.printStackTrace();
		}
	}
	private static void navigate() {
		try
		{
			oBrowser.get(" http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void login() 
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		    Thread.sleep(2000);
			
		} catch (Exception e) {
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
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}
			
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
