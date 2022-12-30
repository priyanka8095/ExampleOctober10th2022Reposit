package com.sgtesting.test;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserDemo1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimizeFlyOutwindow();
		createUser();
		deleteUser();
		logout();
		close();


	}
	private static void launch()
	{
		try
		{
			System.setProperty("WebDriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\src\\com\\sgtesting\\test\\CreateUserDemo1.java");
			oBrowser=new ChromeDriver();
		}catch (Exception e) {
			e.printStackTrace();
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
			Thread.sleep(2000);

		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void minimizeFlyOutwindow() {
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void  createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(4000);

			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("demo@yahoo.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("manager1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("manager1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser() {
		try
		{
		oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
		Thread.sleep(4000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert oAlert=oBrowser.switchTo().alert();
		Thread.sleep(2000);
		String content=oAlert.getText();
		System.out.println(content);
		oAlert.accept();
		Thread.sleep(2000);
		
			
		}catch (Exception e) {
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
	private static void close() {
		try
		{
			oBrowser.quit();
			Thread.sleep(6000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
