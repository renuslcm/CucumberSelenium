package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	protected WebDriver driver;
	
	private By txt_username = By.id("un") ;
	private By txt_password = By.id("pw");
	private By btn_login = By.xpath("//input[@type='submit']");
	
	public loginPage(WebDriver driver) {
		this.driver= driver; 
		if(!driver.getTitle().equals("TEST Environment")) {
			throw new IllegalStateException("This is not Login Page. The current page is"
					+ driver.getCurrentUrl());
		}
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin()
	{
		driver.findElement(btn_login).click();
	}
	public void enterValidCredentails(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
	

}
