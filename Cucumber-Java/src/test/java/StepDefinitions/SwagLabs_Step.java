package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabs_Step {

	WebDriver d1;

	@Given("Open chrome browser and url of the appln")
	public void open_chrome_browser_and_url_of_the_appln() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d1 = new ChromeDriver();
		d1.get("https://www.saucedemo.com/");
		d1.manage().window().maximize();
		System.out.println("Given success");
	}

	@When("Enter username and password")
	public void enter_username_and_password() {

		d1.findElement(By.id("user-name")).sendKeys("problem_user");
		d1.findElement(By.id("password")).sendKeys("secret_sauce");
		d1.findElement(By.id("login-button")).click();
		System.out.println("Entered successfully");

	}

	@Then("login success")
	public void login_success() {
		String exp_title = "Swag Labs";
		String curnt_Window_title = d1.getTitle();

		Assert.assertEquals(curnt_Window_title, exp_title);
		System.out.println("AssertEquals Test Passed\n");
		System.out.println("login success");

	}
}
