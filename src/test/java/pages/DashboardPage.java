package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.*;

public class DashboardPage {
	WebDriver driver;
	private By adminTab = By.xpath("//span[normalize-space()='Admin']");
	private By Username = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
	
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	
	}
	
	public void verifyDashboardLoader() {
		WebElement admin = driver.findElement(adminTab);
		Assert.assertTrue(admin.isDisplayed(),"Dashboard not loaded");
	}
	
	public void goToAdminTab() {
		driver.findElement(adminTab).click();	
		}
	public void searchUser(String username) {
		driver.findElement(Username).sendKeys(username);
	}

}
