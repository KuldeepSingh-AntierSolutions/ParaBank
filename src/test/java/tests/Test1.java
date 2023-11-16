package tests;

import org.testng.annotations.Test;

import pages.ForgotLoginInfoPage;
import pages.RegisterPage;
import testUtility.BaseUtility;

public class Test1 extends BaseUtility
{
	@Test(enabled = false)
	public void toVerifyOpenApp()
	{
		launchBrowser();
		exitBrowser();
	}
	@Test(enabled=false)
	public void toVerifyNewUserRegistration() throws InterruptedException
	{
		RegisterPage registerPage=homepage.clickOnRegister();
		registerPage.fillDetails();
		Thread.sleep(2000);
		registerPage.clickOnRegister();
		Thread.sleep(2000);	
	}
	@Test(enabled=false)
	public void toVerifyFindLoginInfo() throws InterruptedException
	{
		ForgotLoginInfoPage forgotLoginInfoPage=homepage.clickOnForgotLoginInfo();
		forgotLoginInfoPage.fillDetails();
		Thread.sleep(2000);
		forgotLoginInfoPage.clickOnFindLoginInfo();
		Thread.sleep(2000);
	}
	@Test(enabled=false)
	public void toVerifyLoginFunctionality() throws InterruptedException
	{
		homepage.fillLoginDetails();
		Thread.sleep(2000);
		homepage.clickOnLogin();
		Thread.sleep(2000);
	}
	
	
}
