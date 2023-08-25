package stepDefinations;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginTest {
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	    
	}

	/*
	 * @When("User enter the credentials") public void user_enter_the_credentials()
	 * { driver.findElement(By.id("username")).sendKeys("tomsmith");
	 * driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	 * driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	 * 
	 * }
	 */
	/*for parameter scenario outline
	 * @When("User enter {string} the {string}") public void user_enter_the(String
	 * strUser, String strPWD) {
	 * driver.findElement(By.id("username")).sendKeys(strUser);
	 * driver.findElement(By.id("password")).sendKeys(strPWD);
	 * driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click(); }
	 */
	//using data table
	/*
	 * @When("User enter the credentials") public void
	 * user_enter_the_credentials(DataTable dataTable) { List<List<String>> data =
	 * dataTable.asLists(); String strUser = data.get(0).get(0); String strPWD =
	 * data.get(0).get(1); driver.findElement(By.id("username")).sendKeys(strUser);
	 * driver.findElement(By.id("password")).sendKeys(strPWD);
	 * driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	 * 
	 * 
	 * }
	 */
	//using map
	@When("User enter the credentials")
	public void user_enter_the_credentials(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		
		String strUser = data.get(0).get("username");
		String strPWD = data.get(0).get("password");
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.id("password")).sendKeys(strPWD);
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
		
	    
	}
	@Then("User should navigated to home page")
	public void user_should_navigated_to_home_page() {
		boolean isValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		assertTrue(isValid);
	}

}
