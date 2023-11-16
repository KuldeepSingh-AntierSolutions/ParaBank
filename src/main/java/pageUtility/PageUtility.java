package pageUtility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility 
{
	WebDriver driver;
	public PageUtility(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void waitForElementToAppear(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitForElementToBeClickable(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public void clickMe(WebElement ele)
	{
		waitForElementToAppear(ele);
		ele.click();
	}
	public void navigateBack()
	{
		driver.navigate().back();
	}
	public void switchToParentWindow()
	{
		String handle=driver.getWindowHandle();
		driver.switchTo().window(handle);
	}
	
	@FindBy(xpath="//div[@id='footerPanel']/ul[1]/li")
	private List<WebElement> footer;
	
	public void browseFooterSection() throws InterruptedException
	{
		for(WebElement ele:footer)
		{
			Thread.sleep(10000);
			waitForElementToBeClickable(ele);
			ele.click();
			switchToParentWindow();
			
		}
	}

}
