package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");

		
driver.findElement(By.linkText("LOGIN")).click();
driver.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
driver.findElement(By.cssSelector("input[id='password']")).sendKeys("manager");
driver.findElement(By.cssSelector("button[id='last']")).click();


	}

}
