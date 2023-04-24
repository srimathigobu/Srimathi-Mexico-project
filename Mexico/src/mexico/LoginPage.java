package mexico;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebDriverWait y = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebDriverWait z = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebDriverWait a = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		driver.get("https://citas.sre.gob.mx/");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button'][2]")));
		driver.findElement(By.xpath("//button[@type='button'][2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle']")));
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//img[@src='https://citasapi.sre.gob.mx/img/eua.png']")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akilanuday26@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aksriyash@2022");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//*[local-name()='svg' and @fill='currentColor']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']")).click();
		
		//Login flow ended
		x.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
		driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
		y.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
		driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
		
		y.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
		driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
		
		//Please comment from below code if you're using india - start here
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs4__combobox'] input[type='search']")));
		driver.findElement(By.cssSelector("div[id='vs4__combobox'] input[type='search']")).click();
		a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs4__combobox'] input[type='search']")));
		driver.findElement(By.cssSelector("div[id='vs4__combobox'] input[type='search']")).sendKeys("China",Keys.ENTER);
		
		
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs2__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs2__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs2__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs2__combobox'] input[placeholder='--Select--']")).sendKeys("Shanghai",Keys.ENTER);
		//Please comment from below code if you're using india - end here
		
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='btn btn-primary']")));
		driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();
		
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary.btn-sm")));
		driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm")).click();
		
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")));
		driver.findElement(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")).click();
	
		
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='introduce first name']")));
		driver.findElement(By.cssSelector("input[placeholder='introduce first name']")).sendKeys("AKILAN");
	
		
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='Introduce last name']")));
		driver.findElement(By.cssSelector("input[placeholder='Introduce last name']")).sendKeys("UDAYAKUMAR");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthdate")));
		driver.findElement(By.name("birthdate")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ui-datepicker-month']")));
		WebElement staticdropdown1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select dropdown1 = new Select(staticdropdown1);
		dropdown1.selectByVisibleText("May");
		
		WebElement staticdropdown2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select dropdown2 = new Select(staticdropdown2);
		dropdown2.selectByValue("1991");
		
		z.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='26']")));
		driver.findElement(By.xpath("//a[normalize-space()='26']")).click();
	
		
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).sendKeys("mas",Keys.ENTER);
		
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
	
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).sendKeys("cas",Keys.ENTER);
	
	
		z.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[1]")));
		driver.findElement(By.xpath("(//input[@value='Two'])[1]")).click();
		
		
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
		
		
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).sendKeys("mil",Keys.ENTER);
	
		
		z.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[2]")));
		driver.findElement(By.xpath("(//input[@value='Two'])[2]")).click();
		
		a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-primary.pull-right")));
		driver.findElement(By.cssSelector(".btn.btn-primary.pull-right")).click();
		
		Thread.sleep(5000);
		a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-primary']")));
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		
//		a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-primary']")));
//		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		
		Thread.sleep(5000);
		x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
		driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
	
		
		x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#A00")));
		driver.findElement(By.cssSelector("#A00")).click();
		
		x.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='panel panel-default'] button[class='btn btn-primary']")));
		driver.findElement(By.cssSelector("div[class='panel panel-default'] button[class='btn btn-primary']")).click();
	
	
		
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("div[class='panel panel-default'] button[class='btn btn-primary']")));
//		WebElement staticdropdown3 = driver.findElement(By.xpath("div[class='panel panel-default'] button[class='btn btn-primary']"));
//		Select dropdown3 = new Select(staticdropdown3);
//		dropdown3.selectByVisibleText("May");
		
		
		z.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='passportNumber'])[1]")));
		driver.findElement(By.xpath("(//input[@id='passportNumber'])[1]")).sendKeys("V8533049");
		
		z.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='passportNumber'])[2]")));
		driver.findElement(By.xpath("(//input[@id='passportNumber'])[2]")).sendKeys("5761320");
		
		
		x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		Thread.sleep(3000);
		x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(3000);
		x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
		
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("input[placeholder='--Select--']")).sendKeys("mil",Keys.ENTER);
		
		z.until(ExpectedConditions.elementToBeClickable(By.id("direction")));
		driver.findElement(By.id("direction")).sendKeys("CHENNAI");
		
		
		z.until(ExpectedConditions.elementToBeClickable(By.id("name")));
		driver.findElement(By.id("name")).sendKeys("UDAYAKUMAR");
		
		z.until(ExpectedConditions.elementToBeClickable(By.id("firstName")));
		driver.findElement(By.id("firstName")).sendKeys("KANNUCHAMY");
		
//		z.until(ExpectedConditions.visibilityOfElementLocated(By.id("*[id^='phone-'][id$='_phone_number']")));
//		driver.findElement(By.id("*[id^='phone-'][id$='_phone_number']")).click();
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_phone_number']")));
		driver.findElement(By.cssSelector("*[id^='phone-'][id$='_phone_number']")).sendKeys("08939240099");
		
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_country_selector']")));
		driver.findElement(By.cssSelector("*[id^='phone-'][id$='_country_selector']")).click();
		
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_country_selector']")));
		driver.findElement(By.cssSelector("*[id^='phone-'][id$='_country_selector']")).sendKeys("ind",Keys.ENTER);
		
		x.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();

	}

}
