package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	public static void StartingPage(WebDriver driver, WebDriverWait x)
	{
		try {
			x.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			}
			catch(ElementNotInteractableException e) {
//				System.out.println("inside catch ElementNotInteractableException");
				x.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
				driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
				driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary']")));
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary']")));
				driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			}
			
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
				driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			}
			
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
				driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			}
	}
}
