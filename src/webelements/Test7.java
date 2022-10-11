package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		WebElement ele = driver.findElement(By.id("username"));
		
		if(ele.isDisplayed()) {
			System.out.println("Element is dispalyed");
			ele.sendKeys("admin");
		}
		else
		{
			System.out.println("Element is not dispalyed");
		}
		
	}

}
