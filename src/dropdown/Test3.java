package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	
		Select s=new Select(dropdown);
		s.selectByIndex(4);
		s.selectByValue("search-alias=deals-intl-ship");
		s.selectByVisibleText("Automotive");
		
		s.deselectByIndex(0);
	
		List<WebElement> allopt = s.getOptions();
		System.out.println(allopt.size());
		
		for(WebElement b:allopt) {
			System.out.println(b.getText());
		}
		
		


		Thread.sleep(2000);
		driver.close();
	}

}
