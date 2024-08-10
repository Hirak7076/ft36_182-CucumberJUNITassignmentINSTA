package INSTAsteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	WebDriver driver;
	Select S;
	
	@Given("Open the browser")
	public void open_the_browser() {
	    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Given("Enter the Instagram Signup url")
	public void enter_the_instagram_signup_url() {
	    
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		
	}

	@When("User enters Mobile Number or Email, Enters Full Name, Enters Username, Enters Password")
	public void user_enters_mobile_number_or_email_enters_full_name_enters_username_enters_password() {
	    
		driver.findElement(By.cssSelector("[name='emailOrPhone']")).sendKeys("Hirakg@gmail.com");;
		driver.findElement(By.cssSelector("[name='fullName']")).sendKeys("Hirak Goswami");
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("ft36_182");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("Hirak@123");
		
	}

	@When("Clicks the Sign up button")
	public void clicks_the_sign_up_button() {
	    
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}

	@Then("User Selects Birth Month, Date and year")
	public void user_selects_birth_month_date_and_year() {
	    
		WebElement Month = driver.findElement(By.cssSelector("[title='Month:']"));
		S = new Select(Month);
		S.selectByVisibleText("July");
		
		WebElement Date = driver.findElement(By.cssSelector("[title='Day:']"));
		S = new Select(Date);
		S.selectByVisibleText("19");
		
		WebElement Year = driver.findElement(By.cssSelector("[title='Year:']"));
		S = new Select(Year);
		S.selectByVisibleText("1997");
		
	}

	@Then("User clicks Next button")
	public void user_clicks_next_button() {
	    
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.close();
		
	}
	
}
