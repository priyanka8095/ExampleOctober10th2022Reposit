package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpathforcreateuser {

	 public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		
		launch();
		navigate();
		login();
		createuser();
		deleteuser();
	}
	private static void launch()
	{
		try
		{
			System.setProperty("WebDriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\src\\com\\sgtesting\\test\\Relativexpathforcreateuser.java");
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
	private static void login()

	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin");
			oBrowser.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()=\"Login \"]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@id=\"gettingStartedShortcutsPanelId\"]")).click();
			Thread.sleep(2000);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class=\"buttonText\"]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[@tabindex=\"10\"]")).sendKeys("sample");
				oBrowser.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("sampleuser");
				oBrowser.findElement(By.xpath("//input[@tabindex=\"14\"]")).sendKeys("wwww.@gmail.com");
				oBrowser.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("demo");
				oBrowser.findElement(By.xpath("//input[@tabindex=\"15\"]")).sendKeys("welcome");
				oBrowser.findElement(By.xpath("//input[@name=\"passwordCopy\"]")).sendKeys("welcome");
				
				oBrowser.findElement(By.xpath("//span[@class=\"buttonTitle\"]")).click();
				Thread.sleep(2000);
		}catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	private static void deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[@class=\"name\"]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//button[@tabindex=\"9\"]")).click();
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
}

