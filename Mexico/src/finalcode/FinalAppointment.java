package finalcode;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import methods.FifthPageFillingPage;
import methods.FirstPageFillingPage;
import methods.HomePage;
import methods.LoginFlow;
import methods.SecondPageFillingPage;
import methods.SelectButtonEnableCheck;
import methods.ThirdPageFillingPage;
public class FinalAppointment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://citas.sre.gob.mx/");
		LoginFlow.logiFlow(driver, x);
		HomePage.StartingPage(driver, x);
		Thread.sleep(5000);
		SelectButtonEnableCheck.HomePage(driver, x);
		FirstPageFillingPage.HomePage(driver, x);
		SecondPageFillingPage.HomePage(driver, x);
		ThirdPageFillingPage.HomePage(driver, x);
		FifthPageFillingPage.HomePage(driver, x);

	}

}
