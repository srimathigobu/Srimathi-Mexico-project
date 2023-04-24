package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SessionExpire {
	public static void sessioExp(WebDriver driver, WebDriverWait x) throws InterruptedException
	{
//		System.out.println("Inside SessionExpire start");
		try {
		x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Start']")));
		driver.findElement(By.xpath("//a[text()='Start']")).click();
			}
		catch(TimeoutException e) {
		x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Start']")));
		driver.findElement(By.xpath("//a[text()='Start']")).click();	
		}
		Thread.sleep(5000);
		
		//For testing purpose start here
//		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Close session')]")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
//		Thread.sleep(3000);
		//For testing purpose end here
		if((driver.findElements(By.xpath("//input[@name='email']")).size()>0))
		{
			LoginDetails.LoginInfo(driver, x);
//			System.out.println("Inside SessionExpire If login prompt");
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			}
			
			try {
				x.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[local-name()='svg' and @fill='currentColor']")));
				driver.findElement(By.xpath("//*[local-name()='svg' and @fill='currentColor']")).click();
			}
			catch(TimeoutException e)
			{
				x.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[local-name()='svg' and @fill='currentColor']")));
				driver.findElement(By.xpath("//*[local-name()='svg' and @fill='currentColor']")).click();
			}

			try {
			x.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary pull-right']")));
			driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary pull-right']")));
				driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']")).click();
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
				}
			catch(ElementNotInteractableException e) {
			x.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
				}
			catch(TimeoutException e) {
			x.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
				}
		}
		try {
		x.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary']")));
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			}
		catch(TimeoutException e) {
		x.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary']")));
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			}
		Thread.sleep(3000);
//		System.out.println(driver.findElements(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).size());
		if((driver.findElements(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).size())==1)	
		{
//			System.out.println("Inside SessionExpire after start schudl");
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
				}
			catch(TimeoutException e) {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
				}
		}
//		System.out.println("Inside SessionExpire End");
	}
}


