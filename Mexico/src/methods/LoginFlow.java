package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFlow {

	public static void logiFlow(WebDriver driver, WebDriverWait x)
	{
		try {
		x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button'][2]")));
		driver.findElement(By.xpath("//button[@type='button'][2]")).click();
		}
		catch(TimeoutException e) {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button'][2]")));
			driver.findElement(By.xpath("//button[@type='button'][2]")).click();
		}
		
		try {
		x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle']")));
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		}
		catch(TimeoutException e) {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle']")));
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		}
			
		try {
		x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://citasapi.sre.gob.mx/img/eua.png']")));
		driver.findElement(By.xpath("//img[@src='https://citasapi.sre.gob.mx/img/eua.png']")).click();
		}
		catch(TimeoutException e) {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://citasapi.sre.gob.mx/img/eua.png']")));
			driver.findElement(By.xpath("//img[@src='https://citasapi.sre.gob.mx/img/eua.png']")).click();
			
		}
		
		LoginDetails.LoginInfo(driver, x);
		
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
	}
}
