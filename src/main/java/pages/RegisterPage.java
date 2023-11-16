package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageUtility.PageUtility;

public class RegisterPage extends PageUtility
{
	WebDriver driver;
	public RegisterPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "customer.firstName")
	private WebElement firstname;
	@FindBy(id = "customer.lastName")
	private WebElement lastname;
	@FindBy(id = "customer.address.street")
	private WebElement streetaddress;
	@FindBy(id = "customer.address.city")
	private WebElement cityaddress;
	@FindBy(id = "customer.address.state")
	private WebElement state;
	@FindBy(id = "customer.address.zipCode")
	private WebElement pincode;
	@FindBy(id = "customer.phoneNumber")
	private WebElement phone;
	@FindBy(id = "customer.ssn")
	private WebElement ssn;
	@FindBy(id = "customer.username")
	private WebElement username;
	@FindBy(id = "customer.password")
	private WebElement password;
	@FindBy(id = "repeatedPassword")
	private WebElement confirmpassword;
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement register;
	
	
	
	
	
	
	public void fillDetails() throws InterruptedException
	{
		firstname.sendKeys("Kuldeep");
		lastname.sendKeys("Singh");
		streetaddress.sendKeys("Runkata");
		cityaddress.sendKeys("Agra");
		state.sendKeys("Uttar Pradesh");
		pincode.sendKeys("123456");
		phone.sendKeys("9876543210");
		ssn.sendKeys("012345");
		username.sendKeys("kuldee.singh@antiersolutions.com");
		password.sendKeys("Admin@1234");
		confirmpassword.sendKeys("Admin@1234");
	}
	public void clickOnRegister()
	{
		register.click();
	}

}
