package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer4 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		createCustomer();
		deletecustomer();
		logout();
		

	}


	private static void launch() {
		try
		{
			
			
		System.setProperty("WebDriver.driver.Chrome", "D:\\ExampleAutomation\\Automation\\Web-Automation\\src\\com\\sgtesting\\test\\CreateCustomer.java");
		oBrowser=new  ChromeDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(4000);
				
		}catch (Exception e) {
		 e.printStackTrace();
		}
	}
		private static void login() 
		{
			try
			{
			   oBrowser.findElement(By.name("username")).sendKeys("admin");	
			   oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			   oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			}catch  (Exception e) {
				e.printStackTrace();
			}
		}
		private static void createCustomer() {
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")).click();
				oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("iphone");
				oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("It is an mobile");
				oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			}catch (Exception e) {
				e.printStackTrace();
				
			}
		}
			private static void deletecustomer() 
			{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch  (Exception e) {
				e.printStackTrace();
				
			}
			}
			private static void logout() {
				try
				{
					oBrowser.findElement(By.id("logoutLink")).click();
					Thread.sleep(2000);
				}catch (Exception e)
				{
					e.printStackTrace();
				}

			}
				
			}
			
		
		
		


