package StepDefinitions;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import pages.loginPage;

public class LoginSteps {
	WebDriver driver= null;
	loginPage login;
	homePage home;

	@Given("Open chrome browser")
	public void Open_chrome_browser() {
		String projectPath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Hurray");
		
	}
	@And("Launch the application")
	public void Launch_the_application() {
		driver.navigate().to("https://shma-test.appiancloud.com/suite/");
	}
	@Given("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
	
		login=new loginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
			
	}
	
	@Given("User enter username and password")
	public void user_enters_username_and_password() {
	
		driver.findElement(By.id("un")).sendKeys("bpl.feeearner");
		driver.findElement(By.id("pw")).sendKeys("SHMA@1234");

	}

	@When("Click login button")
	public void click_login_button() {
		login = new loginPage(driver);
		login.clickLogin();
	}

	@Then("The applicaiton is opened")
	public void the_applicaiton_is_opened() {
		home = new homePage(driver);
		home.validateWelcome();
		
		
	}
	@And("Log out from the application")
	public void log_out_from_the_app() {
		home = new homePage(driver);
		home.clickOpenUserOptionMenu();
		home.clickLogout();
		
		//driver.findElement(By.xpath("//a[@aria-label='Open user options menu']")).click();  
		//driver.findElement(By.xpath("(//div[@class='UserProfileLayout---current_user_actions']//div//div//button)[3]")).click();
		driver.close();
		driver.quit();
	}
	
	
	
}
