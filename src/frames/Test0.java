package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://skillrary.com/core-java-for-selenium-training");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//switching to frame
driver.switchTo().frame(0);

driver.findElement(By.xpath("//div[@class='play-icon']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//div[@class='pause-icon']")).click();

//switching back from frame
driver.switchTo().defaultContent();


driver.findElement(By.xpath("//span[text()='Add To Wishlist']")).click();

	}

}
