package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondPageFillingPage {
	public static void HomePage(WebDriver driver, WebDriverWait x) throws InterruptedException
	{
		try {
			Thread.sleep(5000);
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			}
			catch(TimeoutException e) {
				Thread.sleep(5000);
				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
				driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			}
			
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#A00")));
			driver.findElement(By.cssSelector("#A00")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#A00")));
				driver.findElement(By.cssSelector("#A00")).click();
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='panel panel-default'] button[class='btn btn-primary']")));
			driver.findElement(By.cssSelector("div[class='panel panel-default'] button[class='btn btn-primary']")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='panel panel-default'] button[class='btn btn-primary']")));
				driver.findElement(By.cssSelector("div[class='panel panel-default'] button[class='btn btn-primary']")).click();
			}
		
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")).click();
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")).click();
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='passportNumber'])[1]")));
			driver.findElement(By.xpath("(//input[@id='passportNumber'])[1]")).sendKeys("V8533049");
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='passportNumber'])[1]")));
				driver.findElement(By.xpath("(//input[@id='passportNumber'])[1]")).sendKeys("V8533049");
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='passportNumber'])[2]")));
			driver.findElement(By.xpath("(//input[@id='passportNumber'])[2]")).sendKeys("5761320");
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='passportNumber'])[2]")));
				driver.findElement(By.xpath("(//input[@id='passportNumber'])[2]")).sendKeys("5761320");
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
			driver.findElement(By.cssSelector(".btn.btn-primary")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
				driver.findElement(By.cssSelector(".btn.btn-primary")).click();
			}
			try {
			Thread.sleep(3000);
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
			driver.findElement(By.cssSelector(".btn.btn-primary")).click();
			}
			catch(TimeoutException e) {
				Thread.sleep(3000);
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
				driver.findElement(By.cssSelector(".btn.btn-primary")).click();
			}
	}
}
