package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement serachtb = driver.findElement(By.name("q"));
		Test1 t=new Test1(driver);
		
		driver.navigate().refresh();
		
		//serachtb.sendKeys("123456ertryt");
		t.serachtextbox("3546ytrdfgfh");
		


	}

}
