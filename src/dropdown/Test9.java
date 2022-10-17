package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement ele = driver.findElement(By.id("cars"));

Select s=new Select(ele);
s.selectByIndex(0);
s.selectByValue("99");


System.out.println(s.isMultiple());
Thread.sleep(3000);
s.deselectByIndex(0);
s.deselectByValue("99");


Thread.sleep(3000);
driver.close();


	}

}
