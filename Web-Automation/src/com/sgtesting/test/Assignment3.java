package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		createuser1();
		createuser2();
		createuser3();
		logoutfromadmin();
		loginasuser1();
		lagoutasuser1();
		loginasuser2();
		logoutasuser2();
		loginasuser3();
		lagoutasuser3();
		modifypasswordforuser1();
		lagoutasuser11();
		modifypasswordforuser2();
		lagoutasuser12();
		modifypasswordforuser3();
		lagoutasuser13();
		loginasuser1withnewpassword();
		lagoutasuser1withnewpassword();
		loginasuser2withnewpassword();
		lagoutasuser2withnewpassword();
		loginasuser3withnewpassword();
		lagoutasuser3withnewpassword();
		loginasadmin();
		modifysecondpasswordforuser1();
		modifysecondpasswordforuser2();
		modifysecondpasswordforuser3();
		lagoutasadmin();
		loginagainuser1();
		lagoutagainUser1();
		loginagainuser2();
		lagoutagainUser2();
		//loginaagainuser3();
	//	lagoutagainUser3();
		//loginasadmin1();
		deletealluser();
		//logout();
		


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
			   oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			}catch  (Exception e) {
				e.printStackTrace();
			}
		}
		private static void createuser1() {
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
				oBrowser.findElement(By.name("lastName")).sendKeys("user1");
				oBrowser.findElement(By.name("email")).sendKeys("www.@yahoo.com");
				oBrowser.findElement(By.name("username")).sendKeys("demouser1");
				oBrowser.findElement(By.name("password")).sendKeys("welcome2");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome2");
				oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(2000);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void createuser2(){
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("demo3");
				oBrowser.findElement(By.name("lastName")).sendKeys("user2");
				oBrowser.findElement(By.name("email")).sendKeys("www.@yahoo1.com");
				oBrowser.findElement(By.name("username")).sendKeys("demouser2");
				oBrowser.findElement(By.name("password")).sendKeys("welcome3");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome3");
				oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(2000);
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void createuser3()
		{
		  try
		  {
			  oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.name("firstName")).sendKeys("demo4");
			  oBrowser.findElement(By.name("lastName")).sendKeys("user3");
			  oBrowser.findElement(By.name("email")).sendKeys("www.@yahoo3.com");
			  oBrowser.findElement(By.name("username")).sendKeys("demouser3");
			  oBrowser.findElement(By.name("password")).sendKeys("welcome4");
			  oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome4");
			  oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			  Thread.sleep(2000);
			  
			  
			  
		  }catch (Exception e) {
		  
			e.printStackTrace();
		}
		}
		


		
		private static void logoutfromadmin()
		{
			try
			{
				oBrowser.findElement(By.id("logoutLink")).click();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void loginasuser1()
		{
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("demouser1");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome2");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				
			
		}catch (Exception e) {
		   e.printStackTrace();
		} 
}
		private static void lagoutasuser1()
		{
			try
			{
				oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void loginasuser2()
		{
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("demouser2");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome3");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void logoutasuser2()
		{
			try
			{
				oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void loginasuser3()
		{
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("demouser3");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome4");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void lagoutasuser3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void modifypasswordforuser1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("demouser1");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome2");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='user1, demo2']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("welcome123");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void lagoutasuser11()
		{
			try
			{
				
				Thread.sleep(2000);
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void modifypasswordforuser2()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("demouser2");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome3");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='user2, demo3']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("welcome456");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome456");
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void lagoutasuser12()
		{
			try
			{
				
				Thread.sleep(2000);
				oBrowser.findElement(By.id("logoutLink")).click();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void modifypasswordforuser3()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("demouser3");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome4");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='user3, demo4']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("welcome789");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome789");
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void lagoutasuser13()
		{
			try
			{
				
				Thread.sleep(2000);
				oBrowser.findElement(By.id("logoutLink")).click();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void loginasuser1withnewpassword()
		{
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("demouser1");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome123");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
			
		}catch (Exception e) {
		   e.printStackTrace();
		} 
		}
		
		private static void lagoutasuser1withnewpassword()
		{
			try
			{
			//	oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void loginasuser2withnewpassword()
		{
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("demouser2");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome456");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void lagoutasuser2withnewpassword()
		{
			try
			{
				
				
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void loginasuser3withnewpassword()
		{
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("demouser3");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome789");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void lagoutasuser3withnewpassword()
		{
			try
			{
				
				Thread.sleep(2000);
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void loginasadmin()
		{
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
		
		private static void modifysecondpasswordforuser1()
		{
			try
			{
				
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='user1, demo2']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("welcome1234");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1234");
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(2000);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void modifysecondpasswordforuser2()
		{
			try
			{
				
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='user2, demo3']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("welcome4567");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome4567");
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void modifysecondpasswordforuser3()
		{
			try
			{
				
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='user3, demo4']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("welcome7890");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome7890");
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void lagoutasadmin()
		{
			try
			{
				
				
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void loginagainuser1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("demouser1");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome1234");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void lagoutagainUser1()
		{
			try
			{
				
				
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void loginagainuser2()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("demouser2");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome4567");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void lagoutagainUser2()
		{
			try
			{
				
				
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void loginaagainuser3()
		{
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("demouser3");
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome7890");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void lagoutagainUser3()
		{
			try
			{
				
				
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		private static void loginasadmin1()
		{
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

		private static void deletealluser()
		{
			try
			{
				Thread.sleep(2000);;
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='user1, demo2']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				Thread.sleep(2000);
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='user2, demo3']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert1=oBrowser.switchTo().alert();
				Thread.sleep(2000);
				String content1=oAlert1.getText();
				System.out.println(content);
				oAlert1.accept();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='user3, demo4']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert3=oBrowser.switchTo().alert();
				Thread.sleep(2000);
				String content3=oAlert3.getText();
				System.out.println(content3);
				oAlert1.accept();
				Thread.sleep(2000);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void logout()
		{
			try
			{
				oBrowser.findElement(By.id("logoutLink")).click();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		


}



