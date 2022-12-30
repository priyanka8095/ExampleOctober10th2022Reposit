package com.sgtesting.Pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3pom {
	public static WebDriver oBrowser=null;
	public static ActiTimePage1 oPage1=null;
	
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		createuser1();
		createuser2();
		createuser3();
		loginandlogoutasuser1();
		loginandlogoutasuser2();
		loginandlogoutasuser3();
		modifypasswordforuser1();
		modifypasswordforuser2();
		modifypasswordforuser3();
		loginandlogoutasuser11();
		loginandlogoutasuser12();
		loginandlogoutasuser13();
		loginasadmin();
		modifypasswordforuser1again();
		modifypasswordforuser2again();
		modifypasswordforuser3again();
		loginandlogoutasuser11again();
		//loginandlogoutasuser12again();
		//loginandlogoutasuser13again();
		loginasadminagain();
		deleteuser1();
		deleteuser2();
		deleteuser3();
	}

	private static void launchBrowser() {
		try
		{
			
			System.setProperty("WebDriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage1=new ActiTimePage1(oBrowser);
			Thread.sleep(2000);
			oBrowser.manage().window().maximize();
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
private static void createuser1()
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
    oPage1.getusername1().sendKeys("demouser1");
    oPage1.getpassword().sendKeys("welcome");
    oPage1.getpasswordcopy().sendKeys("welcome");
    oPage1.getclickoncreateuser().click();
    Thread.sleep(2000);

	
}catch (Exception e) {
	e.printStackTrace();
}
}

private static void createuser2() {
	try
	{
		oPage1.geticon().click();
		Thread.sleep(2000);
		oPage1.getfirstName().sendKeys("demo");
	    oPage1.getlastName().sendKeys("demo2");	
	    oPage1.getmail().sendKeys("www.@yahoo.com");
	    oPage1.getusername1().sendKeys("demouser2");
	    oPage1.getpassword().sendKeys("welcome");
	    oPage1.getpasswordcopy().sendKeys("welcome");
	    oPage1.getclickoncreateuser().click();
	    Thread.sleep(2000);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
private static void createuser3() {
	try
	{
		oPage1.geticon().click();
		Thread.sleep(2000);
		oPage1.getfirstName().sendKeys("demo");
	    oPage1.getlastName().sendKeys("demo3");	
	    oPage1.getmail().sendKeys("www.@yahoo.com");
	    oPage1.getusername1().sendKeys("demouser3");
	    oPage1.getpassword().sendKeys("welcome");
	    oPage1.getpasswordcopy().sendKeys("welcome");
	    oPage1.getclickoncreateuser().click();
	    Thread.sleep(2000);
	    oPage1.getlogout().click();
	    Thread.sleep(2000);
	}catch (Exception e) {
		e.printStackTrace();
	}
}

private static void loginandlogoutasuser1() {
	try
	{
		oPage1.getUserName().sendKeys("demouser1");
		oPage1.getPwd().sendKeys("welcome");
		oPage1.getLogin().click();
		Thread.sleep(2000);
		oPage1.getclickonstartexploringtime().click();
		Thread.sleep(2000);
		oPage1.getlogout().click();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
private static void loginandlogoutasuser2() {
	try
	{
		oPage1.getUserName().sendKeys("demouser2");
		oPage1.getPwd().sendKeys("welcome");
		oPage1.getLogin().click();
		Thread.sleep(2000);
		oPage1.getclickonstartexploringtime().click();
		Thread.sleep(2000);
		oPage1.getlogout().click();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
private static void loginandlogoutasuser3() {
	try
	{
		oPage1.getUserName().sendKeys("demouser3");
		oPage1.getPwd().sendKeys("welcome");
		oPage1.getLogin().click();
		Thread.sleep(2000);
		oPage1.getclickonstartexploringtime().click();
		Thread.sleep(2000);
		oPage1.getlogout().click();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
private static void modifypasswordforuser1()
{
	try
	{
		oPage1.getUserName().sendKeys("demouser1");
		oPage1.getPwd().sendKeys("welcome");
		oPage1.getLogin().click();
		Thread.sleep(2000);
		oPage1.getUSERS().click();
		Thread.sleep(2000);
		
		
		oPage1.getclickonuserdemo1().click();
		Thread.sleep(2000);
		oPage1.getpassword().sendKeys("welcome1");
        oPage1.getpasswordcopy().sendKeys("welcome1");
        oPage1.getclickonsavechangesfor3().click();
        Thread.sleep(2000);
        oPage1.getlogout().click();
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
private static void modifypasswordforuser2()
{
	try
	{
		oPage1.getUserName().sendKeys("demouser2");
		oPage1.getPwd().sendKeys("welcome");
		oPage1.getLogin().click();
		Thread.sleep(2000);
		oPage1.getUSERS().click();
		Thread.sleep(2000);
		
		
		oPage1.getclickonuserdemo2().click();
		Thread.sleep(2000);
		oPage1.getpassword().sendKeys("welcome2");
        oPage1.getpasswordcopy().sendKeys("welcome2");
        oPage1.getclickonsavechangesfor3().click();
        Thread.sleep(2000);
        oPage1.getlogout().click();
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
private static void modifypasswordforuser3()
{
	try
	{
		oPage1.getUserName().sendKeys("demouser3");
		oPage1.getPwd().sendKeys("welcome");
		oPage1.getLogin().click();
		Thread.sleep(2000);
		oPage1.getUSERS().click();
		Thread.sleep(2000);
		
		
		oPage1.getclickonuserdemo3().click();
		Thread.sleep(2000);
		oPage1.getpassword().sendKeys("welcome3");
        oPage1.getpasswordcopy().sendKeys("welcome3");
        oPage1.getclickonsavechangesfor3().click();
        Thread.sleep(2000);
        oPage1.getlogout().click();
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
private static void loginandlogoutasuser11() {
	try
	{
		oPage1.getUserName().sendKeys("demouser1");
		oPage1.getPwd().sendKeys("welcome1");
		oPage1.getLogin().click();
		Thread.sleep(2000);
		
		
		oPage1.getlogout().click();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
private static void loginandlogoutasuser12() {
	try
	{
		oPage1.getUserName().sendKeys("demouser2");
		oPage1.getPwd().sendKeys("welcome2");
		oPage1.getLogin().click();
		
		
		Thread.sleep(2000);
		oPage1.getlogout().click();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
private static void loginandlogoutasuser13() {
	try
	{
		oPage1.getUserName().sendKeys("demouser3");
		oPage1.getPwd().sendKeys("welcome3");
		oPage1.getLogin().click();
		
		Thread.sleep(2000);
		oPage1.getlogout().click();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
private static void loginasadmin()
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
private static void modifypasswordforuser1again()
{
	try
	{
		//oPage1.getUserName().sendKeys("demouser1");
	//	oPage1.getPwd().sendKeys("welcome");
	//	oPage1.getLogin().click();
		oPage1.getFlyOutWindow().click();
	
		Thread.sleep(2000);
		oPage1.getUSERS().click();
		Thread.sleep(2000);
		
		
		oPage1.getclickonuserdemo1().click();
		Thread.sleep(2000);
		oPage1.getpassword().sendKeys("welcome11");
        oPage1.getpasswordcopy().sendKeys("welcome11");
        oPage1.getclickonsavechangesfor3().click();
        Thread.sleep(2000);
        oPage1.getlogout().click();
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
private static void modifypasswordforuser2again()
{
	try
	{
		oPage1.getUserName().sendKeys("admin");
		oPage1.getPwd().sendKeys("manager");
		oPage1.getLogin().click();
		Thread.sleep(2000);
		oPage1.getFlyOutWindow().click();
		oPage1.getUSERS().click();
		Thread.sleep(2000);
		
		
		oPage1.getclickonuserdemo2().click();
		Thread.sleep(2000);
		oPage1.getpassword().sendKeys("welcome12");
        oPage1.getpasswordcopy().sendKeys("welcome12");
        oPage1.getclickonsavechangesfor3().click();
        Thread.sleep(2000);
        oPage1.getlogout().click();
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
private static void modifypasswordforuser3again()
{
	try
	{
		oPage1.getUserName().sendKeys("admin");
		oPage1.getPwd().sendKeys("manager");
		oPage1.getLogin().click();
		Thread.sleep(2000);
		oPage1.getFlyOutWindow().click();
		oPage1.getUSERS().click();
		Thread.sleep(2000);
		
		
		oPage1.getclickonuserdemo2().click();
		Thread.sleep(2000);
		oPage1.getpassword().sendKeys("welcome13");
        oPage1.getpasswordcopy().sendKeys("welcome13");
        oPage1.getclickonsavechangesfor3().click();
        Thread.sleep(2000);
        oPage1.getlogout().click();
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
private static void loginandlogoutasuser11again() {
	try
	{
		oPage1.getUserName().sendKeys("demouser1");
		oPage1.getPwd().sendKeys("welcome11");
		oPage1.getLogin().click();
		Thread.sleep(2000);
		
		
		oPage1.getlogout().click();
		Thread.sleep(2000);
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
private static void loginandlogoutasuser12again() {
	try
	{
		oPage1.getclickonusernameforuser1().sendKeys("demouser2");
		oPage1.getclickonpwdforuser1().sendKeys("welcome12");
		oPage1.getLogin().click();
		
		
		Thread.sleep(2000);
		oPage1.getlogout().click();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
private static void loginandlogoutasuser13again() {
	try
	{
		oPage1.getUserName().sendKeys("demouser3");
		oPage1.getPwd().sendKeys("welcome13");
		oPage1.getLogin().click();
		
		Thread.sleep(2000);
		oPage1.getlogout().click();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
private static void loginasadminagain()
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
private static void deleteuser1() {
	try
	{
		oPage1.getUSERS().click();
		Thread.sleep(2000);
		oPage1.getclickonuserdemo1().click();
		Thread.sleep(2000);
		oPage1.getclickondeleteuser1().click();
		Thread.sleep(2000);
Alert oAlert1=oBrowser.switchTo().alert();
		Thread.sleep(2000);
		String content=oAlert1.getText();
		System.out.println(content);
		oAlert1.accept();
		Thread.sleep(2000);

	}catch (Exception e) {
		e.printStackTrace();
	}
}

private static void deleteuser2() {
	try
	{
		oPage1.getUSERS().click();
		Thread.sleep(2000);
		oPage1.getclickonuserdemo2().click();
		Thread.sleep(2000);
		oPage1.getclcikonuserdemo2fordeleting1().click();
		Thread.sleep(2000);
Alert oAlert2=oBrowser.switchTo().alert();
		Thread.sleep(2000);
		String content=oAlert2.getText();
		System.out.println(content);
		oAlert2.accept();
		Thread.sleep(2000);

	}catch (Exception e) {
		e.printStackTrace();
	}
}

private static void deleteuser3() {
	try
	{
		oPage1.getUSERS().click();
		Thread.sleep(2000);
		oPage1.getclickonuserdemo3().click();
		Thread.sleep(2000);
		oPage1.getclickondeleteuser3().click();
		Thread.sleep(2000);
Alert oAlert3=oBrowser.switchTo().alert();
		Thread.sleep(2000);
		String content=oAlert3.getText();
		System.out.println(content);
		oAlert3.accept();
		Thread.sleep(2000);
		oPage1.getclcikonlogoutLink().click();

	}catch (Exception e) {
		e.printStackTrace();
	}
}

}


