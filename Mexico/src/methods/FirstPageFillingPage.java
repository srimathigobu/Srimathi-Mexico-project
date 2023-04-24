package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstPageFillingPage {
	public static void HomePage(WebDriver driver, WebDriverWait x) throws InterruptedException
	{
		try {
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='btn btn-primary']")));
			driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();
			}
			catch(TimeoutException e)
			{
//				System.out.println("TimeoutException inside SELECT BUTTON Catch block");
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='btn btn-primary']")));
				driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();
			}
			
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary.btn-sm")));
			driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary.btn-sm")));
				driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm")).click();
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")));
			driver.findElement(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")));
				driver.findElement(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")).click();
			}
			
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='introduce first name']")));
			driver.findElement(By.cssSelector("input[placeholder='introduce first name']")).sendKeys("AKILAN");
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='introduce first name']")));
				driver.findElement(By.cssSelector("input[placeholder='introduce first name']")).sendKeys("AKILAN");
			}
			
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='Introduce last name']")));
			driver.findElement(By.cssSelector("input[placeholder='Introduce last name']")).sendKeys("UDAYAKUMAR");
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='Introduce last name']")));
				driver.findElement(By.cssSelector("input[placeholder='Introduce last name']")).sendKeys("UDAYAKUMAR");
			}
			
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthdate")));
			driver.findElement(By.name("birthdate")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthdate")));
				driver.findElement(By.name("birthdate")).click();
			}
			
			
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ui-datepicker-month']")));
			WebElement staticdropdown1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select dropdown1 = new Select(staticdropdown1);
			dropdown1.selectByVisibleText("May");
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ui-datepicker-month']")));
				WebElement staticdropdown1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
				Select dropdown1 = new Select(staticdropdown1);
				dropdown1.selectByVisibleText("May");
			}
			
			try {
			WebElement staticdropdown2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select dropdown2 = new Select(staticdropdown2);
			dropdown2.selectByValue("1991");
			}
			catch(TimeoutException e) {
				WebElement staticdropdown2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select dropdown2 = new Select(staticdropdown2);
				dropdown2.selectByValue("1991");
			}
			try {
			x.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='26']")));
			driver.findElement(By.xpath("//a[normalize-space()='26']")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='26']")));
				driver.findElement(By.xpath("//a[normalize-space()='26']")).click();
			}
			
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).click();
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).sendKeys("mas",Keys.ENTER);
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).click();
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).sendKeys("mas",Keys.ENTER);
			}
			
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).click();
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).click();
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
			}
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).click();
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).sendKeys("cas",Keys.ENTER);
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).click();
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).sendKeys("cas",Keys.ENTER);
			}
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[1]")));
			driver.findElement(By.xpath("(//input[@value='Two'])[1]")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[1]")));
				driver.findElement(By.xpath("(//input[@value='Two'])[1]")).click();
			}
			
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).click();
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).click();
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
			}
			
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).click();
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).sendKeys("mil",Keys.ENTER);
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).click();
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
				driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).sendKeys("mil",Keys.ENTER);
			}
			
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[2]")));
			driver.findElement(By.xpath("(//input[@value='Two'])[2]")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[2]")));
				driver.findElement(By.xpath("(//input[@value='Two'])[2]")).click();
			}
			
			try {
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-primary.pull-right")));
			driver.findElement(By.cssSelector(".btn.btn-primary.pull-right")).click();
			}
			catch(TimeoutException e) {
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-primary.pull-right")));
				driver.findElement(By.cssSelector(".btn.btn-primary.pull-right")).click();
			}
			try {
			Thread.sleep(5000);
			x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-primary']")));
			driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
			}
			catch(TimeoutException e) {
				Thread.sleep(5000);
				x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-primary']")));
				driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
			}
	}
}
