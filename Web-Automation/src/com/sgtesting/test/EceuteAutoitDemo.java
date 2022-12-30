package com.sgtesting.test;

public class EceuteAutoitDemo {

	public static void main(String[] args) {
		executeAutoIT();

	}

	private static void executeAutoIT()
	{
		try
		{
			//Runtime.getRuntime().exec("D:\\ExampleAutomation\\Autoit\\FirstScript.exe");
			Runtime obj=Runtime.getRuntime();
			obj.exec("D:\\\\ExampleAutomation\\\\Autoit\\\\FirstScript.exe");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
