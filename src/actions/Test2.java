package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement couse = driver.findElement(By.id("course"));
		
		Actions a=new Actions(driver);
		a.moveToElement(couse).perform();
	
	driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
	

	WebElement plus = driver.findElement(By.id("add"));

	a.doubleClick(plus).perform();

	}

}
