package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDefinationTest {
	WebDriver driver;
	
	@Given("user is on Google Page")
	public void user_is_on_google_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
	    
	}
	@When("I Search Java Tutorial")
	public void i_search_java_tutorial() {
		WebElement srcBox = driver.findElement(By.name("q"));
	    srcBox.sendKeys("Java Tutorial");
	    srcBox.submit();
	}
	@Then("Should Display Java Result Page")
	public void should_display_java_result_page() {
		String strTitle = driver.getTitle();
		Assert.assertEquals(strTitle, "Java Tutorial - Google Search");
	   
	}
	
	@When("I Search Selenium Tutorial")
	public void i_search_selenium_tutorial() {
		WebElement srcBox = driver.findElement(By.name("q"));
	    srcBox.sendKeys("Selenium Tutorial");
	    srcBox.submit();
	    
	}
	@Then("Should Display Selenium Result Page")
	public void should_display_selenium_result_page() {
		String strTitle = driver.getTitle();
		Assert.assertEquals(strTitle, "Selenium Tutorial - Google Search");

	}

}
