package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogin {
	//declaration
	@FindBy(id="username")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbutton;
	
	
	//initalization
	public ActitimeLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
	public void usernametextbox(String user) {
		usernametb.sendKeys(user);
	}
	
	public void passwordtextbox(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void loginbtn() {
		loginbutton.click();
	}

}
