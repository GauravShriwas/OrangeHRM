package tests;
import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test
	public void testLoginAndSearchUser() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage login = new LoginPage(driver);
		login.login("Admin", "admin123");
		
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.verifyDashboardLoader();
		dashboard.goToAdminTab();
	
	}

}
