import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhan {
	public static void syspro() {
		System.setProperty("webdriver.chrome.driver", "E:\\Dhananjay\\chromedriver.exe");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		syspro();
		WebDriver driver= new ChromeDriver();
	//	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	//	driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("openwindow")).click();
		Set<String> win= driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		String parentId= it.next();
		String childId= it.next();
		driver.switchTo().window(childId);
		

	}

}
