package loginScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(5000);
driver.findElement(By.name("username"))	.sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("manager");
driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[3]")).click();

String title = driver.getTitle();
System.out.println(title);

String url = driver.getCurrentUrl();
System.out.println(url);

if(title.equals("Instagram")) {
	System.out.println("Pass");
}
else{
	System.out.println("Fail");
}
Thread.sleep(5000);		
driver.close();
	}

}
