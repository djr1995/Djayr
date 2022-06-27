import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introductionseljava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Dhananjay\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	List<WebElement> list=	driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	
	for(int i=0; i<list.size();i++) {
		String linkText= list.get(i).getText();
		System.out.println(linkText);
		
	}
	   
	}

}
