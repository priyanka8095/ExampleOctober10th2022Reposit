package com.sgtesting.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignemnt8pom {
	public static WebDriver oBrowser=null;
	public static ActiTimePage1 oPage1=null;
	
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		createcustomer();
		createproject();
		createtask();
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
	  }catch (Exception e) {
		e.printStackTrace();
	}
}
  private static void createproject()
  {
	  try
	  {
		  oPage1.getclickonaddnew().click();
		  Thread.sleep(2000);
		  oPage1.getclickonnewproject().click();
		  Thread.sleep(3000);
		  oPage1.getclcickonprojectname().sendKeys("selenium");
		  oPage1.getclickonprojectdescription().sendKeys("it is used to auytomate");
		  oPage1.getclickonCreateProject().click();
		  Thread.sleep(2000);
	  }catch (Exception e) {
		e.printStackTrace();
	}
  }
  private static void createtask()
  {
	  try
	  {
		  oPage1.getclickonaddnewtask().click();
		  oPage1.getclickoncreatetask().click();
		  Thread.sleep(2000);
		  oPage1.getclickonenterfield1().sendKeys("selenium automa");
		  oPage1.getclickonenterfield2().sendKeys("manual test");
		  oPage1.getclickonenterfield3().sendKeys("testcase");
		  oPage1.getclickonenterfield4().sendKeys("test execution");
		  oPage1.getclickoncreatetaskbutton().click();
		  Thread.sleep(2000);
		  oPage1.getclickontaskselenium().click();
		  Thread.sleep(2000);
		  
		  oPage1.getclickontaskaction().click();
		  Thread.sleep(2000);
		  oPage1.getclcikondeleteaction().click();
		  oPage1.getclcikondeletepermanently().click();
		 
	  }catch (Exception e) {
		  
		e.printStackTrace();
	}
  }
}
