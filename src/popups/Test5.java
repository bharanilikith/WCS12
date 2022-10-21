package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nnnow.com/men-formal-shirts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='NEW ARRIVAL - AW22']")).click();
		
		Set<String> child = driver.getWindowHandles();
		
		for(String a:child) {
			driver.switchTo().window(a);
		}
		
		driver.findElement(By.xpath("//button[text()='ADD TO BAG']")).click();
	}

}
