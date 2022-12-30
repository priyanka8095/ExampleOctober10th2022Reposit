package com.sgtesting.Pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment2pom {

	public static WebDriver oBrowser=null;
	public static ActiTimePage1 oPage1=null;
	
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		Createusers();
		//modifyuser;
		deleteuser();
	}
	private static void launchBrowser() {
		try
		{
			
			System.setProperty("WebDriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage1=new ActiTimePage1(oBrowser);
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage1.getUserName().sendKeys("admin");
			oPage1.getPwd().sendKeys("manager");
			oPage1.getLogin().click();
			Thread.sleep(2000);
			oPage1.getFlyOutWindow().click();
			Thread.sleep(2000);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Createusers()
	{
		try
		{
			oPage1.getUSERS().click();
			Thread.sleep(2000);
			oPage1.geticon().click();
			Thread.sleep(2000);
			oPage1.getfirstName().sendKeys("demo");
            oPage1.getlastName().sendKeys("demo1");	
            oPage1.getmail().sendKeys("www.@yahoo.com");
            oPage1.getusername1().sendKeys("demouser");
            oPage1.getpassword().sendKeys("welcome");
            oPage1.getpasswordcopy().sendKeys("welcome");
            oPage1.getclickoncreateuser().click();
            Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}

}
	private static void modifyuser()
	{
		try
		{
			oPage1.getclickonuserdemo().click();
			Thread.sleep(2000);
			oPage1.getModifyUser().click();
			Thread.sleep(2000);
			oPage1.getPassword1().sendKeys("welcome5");
			oPage1.getPasswordcopy1().sendKeys("welcome5");
			oPage1.getSaveChangesButton().click();
			Thread.sleep(2000);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		private static void deleteuser()
		{
			try
			{
				Thread.sleep(2000);
				oPage1.getclickonuserdemo().click();
	            Thread.sleep(2000);
	            oPage1.getclickondelete().click();
	            Alert oAlert=oBrowser.switchTo().alert();
	    		Thread.sleep(2000);
	    		String content=oAlert.getText();
	    		System.out.println(content);
	    		oAlert.accept();
	    		Thread.sleep(2000);
	    		//oPage1.getlogout().click();
			
			}catch (Exception e) {
				e.printStackTrace();
			
		}
		
	}
}

