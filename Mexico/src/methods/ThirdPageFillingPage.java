package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThirdPageFillingPage {
	public static void HomePage(WebDriver driver, WebDriverWait x) throws InterruptedException
	{
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
