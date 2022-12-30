package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage1 {
 
	public ActiTimePage1(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
}
	
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	private WebElement pwd;
	public WebElement getPwd()
	{
		return pwd;
	}
	private WebElement oLogin ;
	public WebElement getLogin()
	{
		return oLogin;
	}
}