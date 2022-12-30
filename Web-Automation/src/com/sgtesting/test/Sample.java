package com.sgtesting.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {

		launch();
		navigate();
		login();
	   search();
	 countoflinks();
	dropdown();

	}
  private static void launch()
  {
	  
	  
		  try {
			  System.setProperty("WebDriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe ");
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
	}
	  }
  private static void  navigate()
  {
	  try
	  {
		  oBrowser.get("https://www.flipkart.com/");
		  Thread.sleep(2000);
		  
	  }catch (Exception e) {
		e.printStackTrace();
	}
  }
  
  
  private static void login()
  {
	  try
	  {
		  oBrowser.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("raya.basavanth@gmail.com");
		  oBrowser.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("brsrlrrp123");
		  Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		  
	  }catch  (Exception e) {
		e.printStackTrace();
	}
  }
  private static void search()
  {
	  try
	  {
		  Thread.sleep(20000);
		 oBrowser.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("iphone");
		 oBrowser.findElement(By.className("L0Z3Pu")).click();
	  }catch (Exception e) {
		e.printStackTrace();
	}
  }
  private static void countoflinks()
  {
	  try
	  {
		   List<WebElement> olinks=oBrowser.findElements(By.tagName("a"));
		   int count=olinks.size();
		   System.out.println("no of links:" +count);
	  }catch (Exception e) {
		e.printStackTrace();
	}
  }
  private static void dropdown()
  {
	  try
	  {
		  List<WebElement> dropdowns=oBrowser.findElements(By.xpath("//span[@class=\"_2I9KP_\"]"));
		  
		  int count=dropdowns.size();
		  System.out.println("no of dropdowns:"+ count);
	  }catch (Exception e) {
		e.printStackTrace();
	}
  }
  }
		  
	  
  

