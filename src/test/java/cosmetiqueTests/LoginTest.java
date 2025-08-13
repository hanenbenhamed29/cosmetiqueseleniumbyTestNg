package cosmetiqueTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import cosmetiquePages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority=1)
public void loginTest() {
	
	
	LoginPage login=new LoginPage(driver);
	
	login.login("hanenbenhamed11@gmail.com", "hanen123&");
	
	
	
	Assert.assertTrue(login.assertHomePage(),"login failed");
	
}

	
	
}
