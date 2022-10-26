package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.id("headerContainer"));
		String fs = ele.getCssValue("font-size");
		System.out.println(fs);

		if (fs.equals("15px")) {
			System.out.println("bold");
		} else {
			System.out.println("not bold");
		}
		driver.close();
	}

}
