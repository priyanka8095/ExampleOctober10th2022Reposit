package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	
	public static  WebDriver oBrowser=null;

	public static void main(String[] args) {
		
		launch();
		navigate();
		login();
		createCustomer();
		createproject();
		createtask();
		deleteTask();
		deleteproject();
		deletecustomer();
		logout();
	}
	
		
		private static void launch() {
			try
			{
				
				
			System.setProperty("WebDriver.driver.Chrome", "D:\\ExampleAutomation\\Automation\\Web-Automation\\src\\com\\sgtesting\\test\\CreateCustomer.java");
			oBrowser =new  ChromeDriver();
			oBrowser.manage().window().maximize();
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
					Thread.sleep(2000);
					oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				}catch (Exception e) {
					e.printStackTrace();
					
				}
			}
			private static void createproject() {
				try
				{
					oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
					oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Selen");
					oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("I is used to automate");
					oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			private static void createtask()
			{
				try
				{
					oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[1]")).click();
					oBrowser.findElement(By.xpath("//div[text()='Create new tasks']")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("write test case for functional testing");
					oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")).sendKeys("create test case design template for function test case");
					oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[3]/td[1]/input")).sendKeys("execute test case for function test");
					oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[4]/td[1]/input")).sendKeys("log the defect and report to devop");
					oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[5]/td[1]/input")).sendKeys("prepare test execution report");
					oBrowser.findElement(By.xpath("//span[text()='Create Tasks']")).click();
					Thread.sleep(2000);
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			private static void deleteTask()
			{
				try
				{
					oBrowser.findElement(By.xpath("//div[text()='write test case for functional testing']")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void deleteproject() {
				try
				{
					
					oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")).click();
					Thread.sleep(2000);
				}catch (Exception e)
				{
					e.printStackTrace();
				}
			
			}
			private static void deletecustomer() {
				try
				{
					oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
				}catch (Exception e) {
					e.printStackTrace();
				}
			
				
			}
		private static void logout() {
			try
			{
				oBrowser.findElement(By.id("logoutLink")).click();
			}catch (Exception e) {
			  e.printStackTrace();
			}
		}

	}


