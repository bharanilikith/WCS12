package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapp.skillrary.com/index.php");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

if(ele.isEnabled()) {
	System.out.println("Pass");
}
else
{
	System.out.println("Fail");
}
driver.close();

	}

}
