package com.sgtesting.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();

	}
	private static void launchBrowser() {
		try
		{
			
			System.setProperty("WebDriver.chrome.driver", "D:\\GitRepositry\\CurrentWorkSpace\\ExampleOctober10th2022Reposit\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		
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


	}


