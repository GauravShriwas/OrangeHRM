package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	private By username = By.xpath("//input[@placeholder='Username']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By loginButton = By.xpath("//button[normalize-space()='Login']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String user, String pass) {
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(loginButton).click();
	}
	
}
