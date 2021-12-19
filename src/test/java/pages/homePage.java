package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class homePage {
	protected WebDriver driver;
	
	private By btn_logout = By.xpath("(//div[@class='UserProfileLayout---current_user_actions']//div//div//button)[3]");
	private By menu_OpenUserOptionMenu = By.xpath("//a[@aria-label='Open user options menu']");
	private By lbl_welcome = By.xpath("//*[contains(text(),'Welcome')]");
	private By link_Task1 = By.xpath("(//*[@class='AccentText---color_accent']//a)[1]");
	public homePage(WebDriver driver) {
		this.driver= driver; 
//		if(!driver.getTitle().contains("TEST")) {
//			throw new IllegalStateException("This is not Home Page-"+driver.getTitle()+"The current page is-"
//					+ driver.getCurrentUrl());
//		}
	}
	
	public void clickLogout()
	{
		driver.findElement(btn_logout).click();
	}
	public void validateWelcome()
	{
		driver.findElement(lbl_welcome).isDisplayed();
	}
	public void clickOpenUserOptionMenu()
	{
		driver.findElement(menu_OpenUserOptionMenu).click();
	}
	public void clickFirstTask()
	{
		driver.findElement(link_Task1).click();
	}
	
	
	

}
