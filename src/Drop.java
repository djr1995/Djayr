import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\Dhananjay\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	//	WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
	//	Select drop= new Select(dropdown);
	//	drop.selectByIndex(2);
	//	drop.selectByVisibleText("Option3");
		driver.findElement(By.id("name")).sendKeys("ABCDEFGH");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.findElement(By.id("alertbtn")).click();
		
		driver.switchTo().alert().dismiss();
		
	}

}
