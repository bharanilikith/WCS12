package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");

driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
