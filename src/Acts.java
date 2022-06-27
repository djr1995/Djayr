import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\Dhananjay\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions act= new Actions(driver);
//	act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	act.moveToElement(driver.findElement(By.id("nav-search-bar-form"))).click().sendKeys("Hello").perform();
	driver.manage().window().minimize();
	}

}
