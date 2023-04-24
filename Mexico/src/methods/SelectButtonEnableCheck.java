package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectButtonEnableCheck {
	public static void HomePage(WebDriver driver, WebDriverWait x) throws InterruptedException
	{
		int count=driver.findElements(By.cssSelector("a[class='btn btn-primary']")).size();
//		count=1;
//		System.out.println(count);
		while(count!=1)
		{
			System.out.println("While loop start");
			driver.navigate().refresh();
			Thread.sleep(5000);
			System.out.println("After refresh in while loop start");
			int popup=driver.findElements(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).size();
			//For testing purpose start here
//			driver.get("https://citas.sre.gob.mx/error");
			//For testing purpose end here
//			System.out.println("popup"+popup);
//			popup=0;
			//New lines of code to be handle when the error pop up start here
			Thread.sleep(5000);
			if((driver.findElements(By.xpath("//a[text()='Start']")).size())==1)
			{
				SessionExpire.sessioExp(driver,x);
			}
			//New lines of code to be handle when the error pop up end here
			if((popup!=0))
			{
				System.out.println("inside popup if statement");
				try
				{
					x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
					driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
				}
				catch(TimeoutException e)
				{
					System.out.println("inside catch TimeoutException");
					driver.navigate().refresh();
					x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
					driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
				}
				//For testing purpose start here
//				driver.get("https://citas.sre.gob.mx/error");
				//For testing purpose end here
			}
			//For testing purpose start here
//			driver.get("https://citas.sre.gob.mx/error");
			//For testing purpose end here
				//New lines of code to be handle when the error pop up start here
			Thread.sleep(5000);
			if((driver.findElements(By.xpath("//a[text()='Start']")).size())==1)
			{
				SessionExpire.sessioExp(driver,x);
			}
				//New lines of code to be handle when the error pop up end here
			System.out.println("popup clicked inside while loop end");
			Thread.sleep(3000);
			count=driver.findElements(By.cssSelector("a[class='btn btn-primary']")).size();
			System.out.println("While loop end");
//			count=1;
		}
	}
	
}
