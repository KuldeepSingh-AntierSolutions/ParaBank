package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageUtility.PageUtility;

public class Homepage extends PageUtility
{
WebDriver driver;
	
	public Homepage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void launchUrl()
	{
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	}
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement register;
	@FindBy(xpath="//a[text()='Forgot login info?']")
	private WebElement forgotlogininfo;
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;
	
	
	public RegisterPage clickOnRegister()
	{
		clickMe(register);
		RegisterPage registerPage=new RegisterPage(driver);
		return registerPage;
	}
	public ForgotLoginInfoPage clickOnForgotLoginInfo()
	{
		clickMe(forgotlogininfo);
		ForgotLoginInfoPage forgotLoginInfoPage=new ForgotLoginInfoPage(driver);
		return forgotLoginInfoPage;
	}
	public void fillLoginDetails()
	{
		username.sendKeys("kuldeep.singh@antiersolutions.com");
		password.sendKeys("Admin@123");
	}
	public void clickOnLogin()
	{
		login.click();
	}
}
