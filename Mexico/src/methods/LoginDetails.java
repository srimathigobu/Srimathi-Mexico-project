package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginDetails {
	public static void LoginInfo(WebDriver driver, WebDriverWait x)
	{
		//-------------------------------------------------------------------------------------------------------		
				//this for India start here
				try {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akilanudaya@gmail.com");
				}
				catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akilanudaya@gmail.com");
				}
				//this for India end here
				
		//-------------------------------------------------------------------------------------------------------		
				//this for china start here
//				try {
//				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
//				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("srimathiakilan17@gmail.com");
//				}
//				catch(TimeoutException e) {
//					x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
//					driver.findElement(By.xpath("//input[@name='email']")).sendKeys("srimathiakilan17@gmail.com");	
//				}
				//this for china start here
				//-------------------------------------------------------------------------------------------------------
				
				//this for Austria start here
//				try {
//					x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
//					driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testusernamemexico@gmail.com");
//					}
//					catch(TimeoutException e) {
//						x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
//						driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testusernamemexico@gmail.com");	
//					}
				//this for Austria end here
				
				//-------------------------------------------------------------------------------------------------------		
				try {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aksriyash@2022");
				}
				catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aksriyash@2022");
				}
	}
}
