package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.name("addresstype"));
		
		Select s=new Select(dd);
		s.selectByIndex(0);
		
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		
		ArrayList a=new ArrayList<>();
		
		
		for(WebElement b:opt) {
			String t = b.getText();
			a.add(t);
			System.out.println(t);
		}
		Collections.sort(a);
		
		System.out.println("*******after sorting******");
		
		for(Object allopt:a) {
			System.out.println(allopt);
		}
		driver.close();
	}

}
