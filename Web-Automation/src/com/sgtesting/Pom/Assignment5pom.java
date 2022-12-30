package com.sgtesting.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5pom {

	public static WebDriver oBrowser=null;
	public static ActiTimePage1 oPage1=null;
	
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		createcustomer();
		modifyuser() ;
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
  private static void createcustomer()
  {
	  try
	  {
		  oPage1.getclickontask().click();
		  Thread.sleep(2000);
		  oPage1.getclickonaddnew().click();
		  Thread.sleep(2000);
		  oPage1.getclickonnewcustomer().click();
		  Thread.sleep(2000);
		  oPage1.getcustomername().sendKeys("iphone");
		  oPage1.getclickoncustomerdescription().sendKeys("it is an iphone");
		  oPage1.getclickoncreatecustomer().click();
		  Thread.sleep(2000);
		 oPage1.getclickoneditbutton().click();
		  Thread.sleep(2000);
	  }catch (Exception e) {
		e.printStackTrace();
	}

}
  private static void modifyuser() 
  {
	  try
	  {
		 // oPage1.getclickontask().click();
		  Thread.sleep(2000);
		 // oPage1.getclickonaddnew().click();
		  Thread.sleep(2000);
		//  oPage1.getclickonnewcustomer().click();
		  Thread.sleep(2000);
		  oPage1.getclickoneditbutton().click();
		  Thread.sleep(2000);
		  oPage1.getclickoncustomerdescription1().sendKeys("it is an apple company");
		  
	  }catch (Exception e) {
		e.printStackTrace();
	}
  }
  
  }

