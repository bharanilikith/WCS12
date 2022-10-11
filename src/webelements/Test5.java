package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
Point loc = ele.getLocation();
System.out.println(loc.getX() +"x co-ordinates");
System.out.println(loc.getY() +"y co-ordinates");

driver.close();

	}

}
