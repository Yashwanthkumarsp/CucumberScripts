package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook{
	WebDriver driver;

	//Login Scenario
	@Given("user on login page")
	public void user_on_login_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("user enter valid UN")
	public void user_enter_valid_un() {
		driver.findElement(By.id("email")).sendKeys("");
	}

	@And("user enter valid password")
	public void user_enter_valid_password() {
		driver.findElement(By.id("pass")).sendKeys("");
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook");
		System.out.println("Validation Success");
		Thread.sleep(2000);
		driver.quit();
	}
	
	// Forgot Account Scenario
	@When("user navigates to find account page")
	public void user_navigates_to_find_account_page() {
	    driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

	@And("enter registered number")
	public void enter_registered_number() {
	   driver.findElement(By.id("identify_email")).sendKeys(""); 
	}

	@And("user click on search button")
	public void user_click_on_search_button() {
		 driver.findElement(By.id("did_submit")).click();
	}

	@Then("user ID should be displayed")
	public void user_id_should_be_displayed() throws InterruptedException {
	    System.out.println("ID is displayed");
	    Thread.sleep(4000);
	    driver.quit();
	}
}
