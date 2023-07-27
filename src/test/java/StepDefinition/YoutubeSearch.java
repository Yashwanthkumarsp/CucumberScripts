package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YoutubeSearch {
	WebDriver driver;
	@Given("user on home page")
	public void user_on_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
	}

	@When("user enter API Testing in search field")
	public void user_enter_api_testing_in_search_field() {
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("API Testing");
	}

	@And("user click on search icon")
	public void user_click_on_search_icon() {
	    driver.findElement(By.id("search-icon-legacy")).click();
	}

	@Then("Video should be displayed")
	public void video_should_be_displayed() throws InterruptedException {
	    System.out.println("Video is Displayed");
	    Thread.sleep(2000);
	    driver.quit();
	}

	@When("user enter Cucumber BDD in search field")
	public void user_enter_cucumber_bdd_in_search_field() {
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Cucumber BDD");
	}

	@When("user enter Data Driven Testing in search field")
	public void user_enter_data_driven_testing_in_search_field() {
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Data Driven Testing");
	}
}
