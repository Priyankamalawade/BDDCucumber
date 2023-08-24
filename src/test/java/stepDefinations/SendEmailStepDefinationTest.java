package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SendEmailStepDefinationTest {
	
	WebDriver driver;
	@Given("User must launch the application")
	public void user_must_launch_the_application() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/samplepagetest/");
	    
	}
	@When("User should send email to register")
	public void user_should_send_email_to_register(String docString) {
		driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys(docString);
	    
	}

}
