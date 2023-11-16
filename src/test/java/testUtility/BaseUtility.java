package testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;

public class BaseUtility 
{
	public WebDriver driver;
	public Homepage homepage;
	
	public WebDriver initializeDriver()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	@BeforeMethod(alwaysRun = true)
	public Homepage launchBrowser()
	{
		initializeDriver();
		homepage=new Homepage(driver);
		homepage.launchUrl();
		return homepage;
	}
	@AfterMethod(alwaysRun = true)
	public void exitBrowser()
	{
		driver.close();
	}
}
