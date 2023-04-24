package india;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class LoginRefreshIndia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebDriverWait y = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait z = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebDriverWait a = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://citas.sre.gob.mx/");
		try {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button'][2]")));
		driver.findElement(By.xpath("//button[@type='button'][2]")).click();
		}
		catch(TimeoutException e) {
//			System.out.println("inside catch TimeoutException first");
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button'][2]")));
			driver.findElement(By.xpath("//button[@type='button'][2]")).click();
		}
		try {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle']")));
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		}
		catch(TimeoutException e) {
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle']")));
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		}
			
		try {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://citasapi.sre.gob.mx/img/eua.png']")));
		driver.findElement(By.xpath("//img[@src='https://citasapi.sre.gob.mx/img/eua.png']")).click();
		}
		catch(TimeoutException e) {
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://citasapi.sre.gob.mx/img/eua.png']")));
			driver.findElement(By.xpath("//img[@src='https://citasapi.sre.gob.mx/img/eua.png']")).click();
			
		}
//-------------------------------------------------------------------------------------------------------		
		//this for India start here
		try {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akilanudaya@gmail.com");
		}
		catch(TimeoutException e) {
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akilanudaya@gmail.com");
		}
		//this for India end here
		
//-------------------------------------------------------------------------------------------------------		
		//this for china start here
//		try {
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("srimathiakilan17@gmail.com");
//		}
//		catch(TimeoutException e) {
//			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
//			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("srimathiakilan17@gmail.com");	
//		}
		//this for china start here
		//-------------------------------------------------------------------------------------------------------
		
		//this for Austria start here
//		try {
//			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
//			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testusernamemexico@gmail.com");
//			}
//			catch(TimeoutException e) {
//				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
//				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testusernamemexico@gmail.com");	
//			}
		//this for Austria end here
		
		//-------------------------------------------------------------------------------------------------------		
		try {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aksriyash@2022");
		}
		catch(TimeoutException e) {
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aksriyash@2022");
		}
		try {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		}
		catch(TimeoutException e) {
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		}
		try {
			x.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[local-name()='svg' and @fill='currentColor']")));
			driver.findElement(By.xpath("//*[local-name()='svg' and @fill='currentColor']")).click();
		}
		catch(TimeoutException e)
		{
//			System.out.println("inside catch TimeoutException second");
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
//		ElementNotInteractableException ex =new ElementNotInteractableException(null);
//		throw ex;
		}
		catch(ElementNotInteractableException e) {
//			System.out.println("inside catch ElementNotInteractableException");
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
		y.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
		driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
		}
		catch(TimeoutException e) {
			y.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
		}
		
		try {
		y.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
		driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
		}
		catch(TimeoutException e) {
			y.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
		}
		Thread.sleep(5000);
		int count=driver.findElements(By.cssSelector("a[class='btn btn-primary']")).size();
//		count=1;
//		System.out.println(count);
		while(count!=1)
		{
//			System.out.println("While loop start");
			driver.navigate().refresh();
			Thread.sleep(5000);
			int popup=driver.findElements(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).size();
//			System.out.println("popup"+popup);
//			popup=0;
		if((popup!=0))
		{
//			System.out.println("inside popup if statement");
			try
			{
			y.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			}
			catch(TimeoutException e)
			{
//				System.out.println("inside catch TimeoutException");
				driver.navigate().refresh();
				y.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
				driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			}
		}
//			System.out.println("popup clicked inside while loop end");
			Thread.sleep(3000);
			count=driver.findElements(By.cssSelector("a[class='btn btn-primary']")).size();
//			System.out.println("While loop end");
//			count=1;
		}
		
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='btn btn-primary']")));
		driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();
		}
		catch(TimeoutException e)
		{
//			System.out.println("TimeoutException inside SELECT BUTTON Catch block");
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='btn btn-primary']")));
			driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();
		}
		
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary.btn-sm")));
		driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm")).click();
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary.btn-sm")));
			driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm")).click();
		}
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")));
		driver.findElement(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")).click();
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")));
			driver.findElement(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")).click();
		}
		
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='introduce first name']")));
		driver.findElement(By.cssSelector("input[placeholder='introduce first name']")).sendKeys("AKILAN");
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='introduce first name']")));
			driver.findElement(By.cssSelector("input[placeholder='introduce first name']")).sendKeys("AKILAN");
		}
		
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='Introduce last name']")));
		driver.findElement(By.cssSelector("input[placeholder='Introduce last name']")).sendKeys("UDAYAKUMAR");
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='Introduce last name']")));
			driver.findElement(By.cssSelector("input[placeholder='Introduce last name']")).sendKeys("UDAYAKUMAR");
		}
		
		try {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthdate")));
		driver.findElement(By.name("birthdate")).click();
		}
		catch(TimeoutException e) {
			w.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthdate")));
			driver.findElement(By.name("birthdate")).click();
		}
		
		
		try {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ui-datepicker-month']")));
		WebElement staticdropdown1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select dropdown1 = new Select(staticdropdown1);
		dropdown1.selectByVisibleText("May");
		}
		catch(TimeoutException e) {
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ui-datepicker-month']")));
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
		z.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='26']")));
		driver.findElement(By.xpath("//a[normalize-space()='26']")).click();
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='26']")));
			driver.findElement(By.xpath("//a[normalize-space()='26']")).click();
		}
		
		try {
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).sendKeys("mas",Keys.ENTER);
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).sendKeys("mas",Keys.ENTER);
		}
		
		try {
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
		}
		try {
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).sendKeys("cas",Keys.ENTER);
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).sendKeys("cas",Keys.ENTER);
		}
		try {
		z.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[1]")));
		driver.findElement(By.xpath("(//input[@value='Two'])[1]")).click();
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[1]")));
			driver.findElement(By.xpath("(//input[@value='Two'])[1]")).click();
		}
		
		try {
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
		}
		
		try {
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).sendKeys("mil",Keys.ENTER);
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).sendKeys("mil",Keys.ENTER);
		}
		
		try {
		z.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[2]")));
		driver.findElement(By.xpath("(//input[@value='Two'])[2]")).click();
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[2]")));
			driver.findElement(By.xpath("(//input[@value='Two'])[2]")).click();
		}
		
		try {
		a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-primary.pull-right")));
		driver.findElement(By.cssSelector(".btn.btn-primary.pull-right")).click();
		}
		catch(TimeoutException e) {
			a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-primary.pull-right")));
			driver.findElement(By.cssSelector(".btn.btn-primary.pull-right")).click();
		}
		try {
		Thread.sleep(5000);
		a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-primary']")));
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		}
		catch(TimeoutException e) {
			Thread.sleep(5000);
			a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-primary']")));
			driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		}
		
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
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs10__combobox'] input[placeholder='--Select--']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		}
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='passportNumber'])[1]")));
		driver.findElement(By.xpath("(//input[@id='passportNumber'])[1]")).sendKeys("V8533049");
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='passportNumber'])[1]")));
			driver.findElement(By.xpath("(//input[@id='passportNumber'])[1]")).sendKeys("V8533049");
		}
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='passportNumber'])[2]")));
		driver.findElement(By.xpath("(//input[@id='passportNumber'])[2]")).sendKeys("5761320");
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='passportNumber'])[2]")));
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
		try {
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
		}
		try {
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("input[placeholder='--Select--']")).click();
		z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
		driver.findElement(By.cssSelector("input[placeholder='--Select--']")).sendKeys("mil",Keys.ENTER);
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("input[placeholder='--Select--']")).sendKeys("mil",Keys.ENTER);
		}
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.id("direction")));
		driver.findElement(By.id("direction")).sendKeys("CHENNAI");
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.id("direction")));
			driver.findElement(By.id("direction")).sendKeys("CHENNAI");
		}
		
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.id("name")));
		driver.findElement(By.id("name")).sendKeys("UDAYAKUMAR");
		}
		
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.id("name")));
			driver.findElement(By.id("name")).sendKeys("UDAYAKUMAR");
		}
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.id("firstName")));
		driver.findElement(By.id("firstName")).sendKeys("KANNUCHAMY");
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.id("firstName")));
			driver.findElement(By.id("firstName")).sendKeys("KANNUCHAMY");
		}
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_phone_number']")));
		driver.findElement(By.cssSelector("*[id^='phone-'][id$='_phone_number']")).sendKeys("08939240099");
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_phone_number']")));
			driver.findElement(By.cssSelector("*[id^='phone-'][id$='_phone_number']")).sendKeys("08939240099");
		}
		try {
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_country_selector']")));
		driver.findElement(By.cssSelector("*[id^='phone-'][id$='_country_selector']")).click();
		z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_country_selector']")));
		driver.findElement(By.cssSelector("*[id^='phone-'][id$='_country_selector']")).sendKeys("ind",Keys.ENTER);
		}
		catch(TimeoutException e) {
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_country_selector']")));
			driver.findElement(By.cssSelector("*[id^='phone-'][id$='_country_selector']")).click();
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='phone-'][id$='_country_selector']")));
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
