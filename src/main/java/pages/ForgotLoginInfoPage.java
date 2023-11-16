package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageUtility.PageUtility;

public class ForgotLoginInfoPage extends PageUtility
{
	WebDriver driver;
	public ForgotLoginInfoPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "firstName")
	private WebElement firstname;
	@FindBy(id = "lastName")
	private WebElement lastname;
	@FindBy(id = "address.street")
	private WebElement streetaddress;
	@FindBy(id = "address.city")
	private WebElement cityaddress;
	@FindBy(id = "address.state")
	private WebElement state;
	@FindBy(id = "address.zipCode")
	private WebElement pincode;
	@FindBy(id = "ssn")
	private WebElement ssn;
	@FindBy(xpath = "//input[@value='Find My Login Info']")
	private WebElement findlogininfo;
	
	
	public void fillDetails()
	{
		firstname.sendKeys("Kuldeep");
		lastname.sendKeys("Singh");
		streetaddress.sendKeys("Runkata");
		cityaddress.sendKeys("Agra");
		state.sendKeys("Uttar Pradesh");
		pincode.sendKeys("123456");
		ssn.sendKeys("012345");
	}
	public void clickOnFindLoginInfo()
	{
		findlogininfo.click();
	}

}
