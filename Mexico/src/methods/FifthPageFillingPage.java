package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FifthPageFillingPage {
	public static void HomePage(WebDriver driver, WebDriverWait x) throws InterruptedException
	{
		try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("input[placeholder='--Select--']")).click();
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("input[placeholder='--Select--']")).click();
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
			}
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("input[placeholder='--Select--']")).click();
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("input[placeholder='--Select--']")).sendKeys("mil",Keys.ENTER);
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("input[placeholder='--Select--']")).click();
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("input[placeholder='--Select--']")).sendKeys("mil",Keys.ENTER);
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.id("direction")));
			driver.findElement(By.id("direction")).sendKeys("CHENNAI");
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.id("direction")));
				driver.findElement(By.id("direction")).sendKeys("CHENNAI");
			}
			
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.id("name")));
			driver.findElement(By.id("name")).sendKeys("UDAYAKUMAR");
			}
			
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.id("name")));
				driver.findElement(By.id("name")).sendKeys("UDAYAKUMAR");
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.id("firstName")));
			driver.findElement(By.id("firstName")).sendKeys("KANNUCHAMY");
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.id("firstName")));
				driver.findElement(By.id("firstName")).sendKeys("KANNUCHAMY");
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_phone_number']")));
			driver.findElement(By.cssSelector("*[id^='phone-'][id$='_phone_number']")).sendKeys("08939240099");
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_phone_number']")));
				driver.findElement(By.cssSelector("*[id^='phone-'][id$='_phone_number']")).sendKeys("08939240099");
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_country_selector']")));
			driver.findElement(By.cssSelector("*[id^='phone-'][id$='_country_selector']")).click();
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_country_selector']")));
			driver.findElement(By.cssSelector("*[id^='phone-'][id$='_country_selector']")).sendKeys("ind",Keys.ENTER);
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_country_selector']")));
				driver.findElement(By.cssSelector("*[id^='phone-'][id$='_country_selector']")).click();
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_country_selector']")));
				driver.findElement(By.cssSelector("*[id^='phone-'][id$='_country_selector']")).sendKeys("ind",Keys.ENTER);
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
			driver.findElement(By.cssSelector(".btn.btn-primary")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
				driver.findElement(By.cssSelector(".btn.btn-primary")).click();
			}
	}
}
