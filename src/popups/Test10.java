package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager\\");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0);
		Thread.sleep(3000);
		System.out.println("frame handled");
		WebElement ele1 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement ele2 = driver.findElement(By.id("trash"));

		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();

	}

}
